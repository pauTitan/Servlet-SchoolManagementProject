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

<h1 class="text-center">Crud operations on Staff Table</h1>

<style>
.container {
  height: 350px;
  position: relative;
  border: 2px solid black;
  width:300px;
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
  
  <form action="savestaff.jsp">
   <a href="Save"> <button>Save</button></a><br><br><br>
   </form>
   <form action="updatestaff.jsp">
<a href="Update"><button>Update</button></a><br><br><br>
</form>
<form action="deletestaff.jsp">
<a href="Delete"><button>Delete</button></a><br><br><br>
</form>
<form action="detailsofstaff.jsp">
<a href="Staff Details"><button>Staff Details</button></a><br><br><br>
</form>
<a href="Home.jsp" class="btn btn-dark">Back</a>
   
  </div>
</div>

</body>
</html>