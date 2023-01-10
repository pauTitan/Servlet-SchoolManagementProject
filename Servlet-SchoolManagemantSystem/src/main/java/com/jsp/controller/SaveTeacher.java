package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;
@WebServlet("/saveteacher")
public class SaveTeacher extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String subject=req.getParameter("subject");
		String contact=req.getParameter("contact");
		String gender=req.getParameter("gender");
		
		Teacher t1=new Teacher();
		t1.setName(name);
		t1.setSubject(subject);
		t1.setContact(contact);
		t1.setGender(gender);
		
		TeacherDao teacherDao=new TeacherDao();
		
		HttpSession httpSession=req.getSession();
		
		Teacher t=teacherDao.saveTeacher(t1);
		
		if(t!=null) {
			httpSession.setAttribute("SuccMsg", "Teacher details saved Successfully...");
			resp.sendRedirect("saveteacher.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong... ");
			resp.sendRedirect("saveteacher.jsp");
		}
		
	}
}
