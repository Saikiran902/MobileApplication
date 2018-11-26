<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
List of All mobiles:
<table border="2">
<tr><th>Mobile Id</th><th>Name</th><th>price</th><th>quantity</th>
<c:forEach var="mobile" items="${list}">
<tr>
<td>${mobile.mobileId }</td>
<td>${mobile.name}</td>
<td>${mobile.price}</td>
<td>${mobile.quantity}</td>
<td><a href = "getUpdatePage.obj?mobid=${mobile.mobileId}">Update</a>
<td><a href = "delete.obj?mobid=${mobile.mobileId}">Delete</a>
</tr>
</c:forEach>
</table>
</body>
</html>