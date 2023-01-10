package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.TeacherDao;
@WebServlet("/deleteteacher")
public class DeleteTeacher extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		
		TeacherDao teacherDao=new TeacherDao();
		
		HttpSession httpSession =req.getSession();
		
		boolean t=teacherDao.deleteTeacher(id1);
		
		if(t) {
			httpSession.setAttribute("SuccMsg","Teacher Deleted Successfully.....");
			resp.sendRedirect("deleteteacher.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong.....");
			resp.sendRedirect("deleteteacher.jsp");
		}
	}

}
