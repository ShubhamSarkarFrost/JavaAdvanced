<%@ page import="java.util.*" %>

<html>


<body>

<!-- Step 1 - Create a HTML Form -->
<form>
<div class="form-group">
    Add new Items:
    <input type="text" class="form-control" placeholder="Enter items" name="enterItems">
  </div>
  <br></br>
<button type="submit" class="btn btn-primary">Submit</button>
</form>
Items Entered: <%= request.getParameter("enterItems") %> 

<% 
 //Step 2 - add new item to To Do List 
 // get the To Do itemsfrom the sessions 
List<String> todoitems = (List<String>) session.getAttribute("mytoDoList");

//If the Todo item does not exist create a new one  
if(todoitems == null){
	todoitems = new ArrayList<String>();
	session.setAttribute("mytoDoList", todoitems);
}

//see if the form data is there to add
String theItem = request.getParameter("enterItems");
if(theItem != null){
	todoitems.add(theItem);
}


%>

<!--  Display all the items in TODO list -->
<hr>
<br></br>
<label>To do List</label>

<ol>
<%
      for (String temp : todoitems){
    	  out.println("<li>"+temp+"</li>");
      }

%>



</ol>

</body>





</html>