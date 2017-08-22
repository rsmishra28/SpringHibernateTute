<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View Record</h1>

	<table border="1" bgcolor="black" width="600px">
	<tr style="background-color: teal;color: white;text-align: center;" height="40px">  
		<td>User Id</td>
		<td>First Name</td>
		<td>Last Name</td>
		<td>Email</td>
	</tr>
	<c:forEach  var="user" items="${list}">  
<tr style="background-color:white;color: black;text-align: center;" height="30px" >  
<td><c:out value="${user.getUserid()}"/></td>    
<td><c:out value="${user.getFirstName()}"/></td>  
<td><c:out value="${user.getLastName()}"/></td>  
<td><c:out value="${user.getEmail()}"/></td>  
  
</tr>  
</c:forEach>  
</table>  	
	</table>
	<a href="Welcome.jsp">Back To Main Page</a>
</body>
</html>