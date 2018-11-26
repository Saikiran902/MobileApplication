<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="a" %>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="added.obj"  method="post" modelAttribute="mobile">
<table>
<%--  <tr>
<td>enter mobile id</td>
<td><f:input path="mobileId"/></td>
</tr> --%>
 <tr>
<td>enter mobile name</td>
<td><f:input path="name"/></td>
</tr>
<tr>
<td>enter mobile price</td>
<td><f:input path="price"/></td>
</tr>
<tr>
<td>enter quantity</td>
<td><f:input path="quantity"/></td>
</tr>
<tr>
<td><input type="submit" value="add">
</tr>
</table>
</f:form>
</body>
</html>