<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details are :</title>
</head>
<body>

The Student is Confirmed : ${param.exampleInputFirstName} ${param.exampleInputLastName}
<br></br>
The Student Country is : ${param.country}
<br><br>
The Favorite Programming language of ${param.exampleInputFirstName} ${param.exampleInputLastName} is ${param.favouriteLanguage}
<br></br>
The Favorite Food Dishes of the Users are:
<ul>
<%
      String [] items = request.getParameterValues("favouritefood");
       
    if(items != null){
    	for(String food : items){
        	out.println("<li>"+ food + "<li>");
        }
    }
%>
</ul>
</body>
</html>