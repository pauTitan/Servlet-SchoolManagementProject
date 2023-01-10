package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class AllDetailsOfStudent extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentDao studentDao=new StudentDao();
		List<Student>students=studentDao.getAllStudent();
	}

}
