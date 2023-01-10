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
@WebServlet("/deletestudent")
public class DeleteStudent extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		
		StudentDao studentDao=new StudentDao();
		
		HttpSession httpSession=req.getSession();
		
		boolean s=studentDao.deleteStudent(id1);
		
		if(s) {
			httpSession.setAttribute("SuccMsg","Student Deleted Successfully.....");
			resp.sendRedirect("deletestudent.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong.....");
			resp.sendRedirect("deletestudent.jsp");
		}
	}

}
