<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   String username = request.getParameter("username");
  String password = request.getParameter("password");
    
    if((username.equals("admin")&&password.equals("admin")))
    {
    	response.sendRedirect("index1.html");
    }else
    {
    	response.sendRedirect("Error.html");
    }
  %> 

</body>

</html>