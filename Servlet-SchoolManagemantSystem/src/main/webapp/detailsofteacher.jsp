<%@page import="com.jsp.dto.Teacher"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dao.TeacherDao"%>
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

<h1 class="text-center">Details of Teacher</h1>

<% TeacherDao teacherDao=new TeacherDao(); 
  List<Teacher> t=teacherDao.getAllTeacher();
%>

<table class="table table-dark table-hover">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Subject</th>
      <th scope="col">Contact</th>
      <th scope="col">Gender</th>
    </tr>
  </thead>
  <tbody>
  <%for (Teacher t1:t){ %>
    <tr>
      <td><%=t1.getId() %></td>
      <td><%=t1.getName() %></td>
      <td><%=t1.getSubject() %></td>
      <td><%=t1.getContact()%></td>
      <td><%=t1.getGender() %></td>
    </tr>
    <%} %>
  </tbody>
</table>
<a href="teacher2.jsp" class="btn btn-dark">Back</a>
</body>
</html>