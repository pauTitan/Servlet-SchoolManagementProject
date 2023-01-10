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

@WebServlet("/updateteacher")
public class UpdateTeacher extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String subject=req.getParameter("subject");
		String contact=req.getParameter("contact");
		String gender=req.getParameter("gender");
		
		Teacher t=new Teacher();
		if(t!=null) {
		t.setId(id1);
		t.setName(name);
		t.setContact(contact);
		t.setSubject(subject);
		t.setGender(gender);
		System.out.println("details updated");
		}else {
			System.out.println("details not updated");
		}
		
		TeacherDao teacherDao =new TeacherDao();
		
		HttpSession httpSession =req.getSession();
		
		Teacher t1=teacherDao.updateTeacher(t);
		
		if(t1!=null) {
			httpSession.setAttribute("SuccMsg","Teacher Updated Successfully.....");
			resp.sendRedirect("updateteacher.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong.....");
			resp.sendRedirect("updateteacher.jsp");
		}
	}

}
