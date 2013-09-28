<%@page import="com.bargebq.dao.InventoryDao"%>
<%@page import="com.bargebq.dao.DisplayControl"%>
<%@page import="java.io.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BargeBQ_JSP_Page</title>
</head>
<body>
<p>This is the correct site. Congrats!</p>
<%@ include file="BargeBQJSP.jsp" %>
<%
	String output = DisplayControl.class.toString();

	out.println("the output is" + output);
	
	//private InventoryDao inventory = new InvetoryDaoDBImpl();
	//out.println("This is a testing");
	//out.println(usernames);
	
	// 	public static Connection getConnection() throws SQLException{
	// 		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.107/project1","larry","larryboy");
	// 		return con;
	// 	}

	
%>

</body>
</html>