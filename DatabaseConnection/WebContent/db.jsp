<%@ page import="java.sql.*" %>

<%
java.sql.Connection con = null;
try{
  Class.forName("com.mysql.jdbc.Driver"); 
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","root","");
} catch (Exception e) {
  out.println(e.getMessage());
}
%>