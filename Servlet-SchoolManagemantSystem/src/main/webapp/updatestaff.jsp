<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="all-css.jsp" %>
<body>
<%@include file="navbar.jsp" %>
<h1 class="text-center">Update Staff</h1>

<style>
.container {
  height: 400px;
  position: relative;
  border: 2px solid black;
  width:700px;
}

  .center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}
</style>

<div class="container">
<div class="center">

<c:if test="${not empty SuccMsg }">
<p class="text-center text-success">${SuccMsg}</p>
<c:remove var="SuccMsg"/>
</c:if>

<c:if test="${not empty error }">
<p class="text-center text-success">${error}</p>
<c:remove var="error"/>
</c:if>

<form action="updatestaff" method="post">
Id:<input type="number" name="id"><br><br>
Name:<input type="text" name="name"><br><br>
Date:<input type="date" name="date"><br><br>
Contact:<input type="tel" name="contact"><br><br>
<a href="staff2.jsp" class="btn btn-dark">Back</a>   <input class="btn btn-primary" type="submit">
</form>
</div>
</div>

</body>
</html>