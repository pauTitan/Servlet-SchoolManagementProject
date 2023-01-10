<%@page import="com.jsp.dto.Staff"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dao.StaffDao"%>
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

<h1 class="text-center">Details of Staff</h1>

<% StaffDao staffDao=new StaffDao();
List<Staff> s=staffDao.getAllStaff();
%>
<table class="table table-dark table-hover">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Date of join</th>
      <th scope="col">Contact</th>
    </tr>
  </thead>
  <tbody>
  <%for (Staff s1:s){ %>
    <tr>
      <td><%=s1.getId() %></td>
      <td><%=s1.getName() %></td>
      <td><%=s1.getDate() %></td>
      <td><%=s1.getContact() %></td>
    </tr>
    <%} %>
  </tbody>
</table>
<a href="staff2.jsp" class="btn btn-dark">Back</a>
</body>
</html>