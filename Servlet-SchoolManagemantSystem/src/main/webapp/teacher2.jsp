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
<h1 class="text-center">Crud operations on Teacher Table</h1> <br><br>

<style>
.container {
  height: 370px;
  position: relative;
  border: 2px solid black;
  width:320px;
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
  
  <form action="saveteacher.jsp">
   <a href="Save"> <button>Save</button></a><br><br><br>
   </form>
   <form action="upadteteacher.jsp">
<a href="Update"><button>Update</button></a><br><br><br>
</form>
<form action="deleteteacher.jsp">
<a href="Delete"><button>Delete</button></a><br><br><br>
</form>
<form action="detailsofteacher.jsp">
<a href="Teacher Details"><button>Teacher Details</button></a><br><br><br>
</form>
<a href="Home.jsp" class="btn btn-dark">Back</a>
   
  </div>
</div>
</body>
</html>