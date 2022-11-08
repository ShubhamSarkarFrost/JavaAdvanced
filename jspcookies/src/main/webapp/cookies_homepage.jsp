<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Page</title>
</head>
<body>
<%

  // the default ........... if no cookies is set
  String favlang = "Java";

 // find our favourite language cookie
  Cookie[] thecookie= request.getCookies();
  
 if(thecookie != null){
	 
	 for(Cookie tempCookie : thecookie){
		 
		 if("myApp.favouriteLanguage".equals(tempCookie.getName())){
			 favlang = tempCookie.getValue();
			 break;
		 }
	 }
	 
	 
 }
%>
<!-- Show a Personalized Page -->
<strong>Training Portal</strong>
<h4>New Books for <%= favlang %></h4>
<ul>
<li>Blah Blah Blah</li>
<li>Blah Blah Blah</li>
<li>Blah Blah Blah</li>
</ul>
<br></br>
<br></br>
<h4>Latest news Report for <%= favlang %></h4>
<ul>
<li>Blah Blah Blah</li>
<li>Blah Blah Blah</li>
<li>Blah Blah Blah</li>
</ul>
<br></br>
<br></br>
<h4>Hot Jobs for <%= favlang %></h4>
<ul>
<li>Blah Blah Blah</li>
<li>Blah Blah Blah</li>
<li>Blah Blah Blah</li>
</ul>
<br></br>
<br></br>
<a href="personalizeform.html">personalize this page</a>


</body>
</html>