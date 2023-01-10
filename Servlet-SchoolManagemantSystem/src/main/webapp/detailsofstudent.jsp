<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dao.StudentDao"%>
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

<h1 class="text-center">Details of Students</h1>

<% StudentDao studentDao=new StudentDao(); 
List<Student> s=studentDao.getAllStudent();
%>

<table class="table table-dark table-hover">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Cno</th>
      <th scope="col">Dob</th>
      <th scope="col">Gender</th>
    </tr>
  </thead>
  <tbody>
  <%for (Student s1:s){ %>
    <tr>
      <td><%=s1.getId() %></td>
      <td><%=s1.getName() %></td>
      <td><%=s1.getEmail() %></td>
      <td><%=s1.getCno() %></td>
      <td><%=s1.getDob() %></td>
      <td><%=s1.getGender() %></td>
    </tr>
    <%} %>
  </tbody>
</table>
<a href="student2.jsp" class="btn btn-dark">Back</a>
</body>
</html>