package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;
@WebServlet("/savestudent")
public class SaveStudent extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String cno=req.getParameter("cno");
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		
		Student s1=new Student();
		s1.setName(name);
		s1.setEmail(email);
		s1.setCno(cno);
		s1.setDob(dob);
		s1.setGender(gender);
		
		StudentDao studentDao=new StudentDao();
		
		HttpSession httpSession=req.getSession();
		
		Student s=studentDao.saveStudent(s1);
		
		if(s!=null) {
			httpSession.setAttribute("SuccMsg", "Student details saved Successfully...");
			resp.sendRedirect("savestudent.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong... ");
			resp.sendRedirect("savestudent.jsp");
		}
		
	}

}
