<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>

<%

    //read the data
    String favouritelanguage = request.getParameter("favouriteLanguage");

    //create a Cookie
    Cookie thecookie = new Cookie("myApp.favouriteLanguage",favouritelanguage);
    
    // set the life span of the cookie
    thecookie.setMaxAge(60*60*24*365);
    
    //sent cookie to the browser
    response.addCookie(thecookie);
%>
 Thanks your favorite Language has been changed to : ${param.favouriteLanguage}

<br><br>
<a href="cookies_homepage.jsp">Return to Homepage:</a>
</body>
</html>