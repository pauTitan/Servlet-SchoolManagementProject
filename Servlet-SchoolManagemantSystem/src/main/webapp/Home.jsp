<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="all-css.jsp" %>
<body>
<%@include file="navbar.jsp" %>

<h1 class="text-center" >Welcome to I.C.L. HIGH SCHOOL</h1>

<style>
.container {
  height: 300px;
  position: relative;
  border: 2px solid black;
  width:200px;

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
  
  <a href="teacher2.jsp"><button>Teacher</button></a> <br><br><br>
<a href="student2.jsp"><button>Student</button></a><br><br><br>
<a href="staff2.jsp"><button>Staff</button></a><br><br> <br>
   
  </div>
</div>
</body>
</html>