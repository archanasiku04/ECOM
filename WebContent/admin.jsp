
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.hcl.service.*" import="com.hcl.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddCategory" method="post">

Name : <input type="text" name="name"><br>
Description : <input type="text" name="desc">
<br/>
<input type="submit" value="SUBMIT">
</form>



<br><br><br><br>



</body>
</html>