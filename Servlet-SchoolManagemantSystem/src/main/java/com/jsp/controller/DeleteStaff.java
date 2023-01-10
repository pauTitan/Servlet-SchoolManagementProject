package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.StaffDao;
@WebServlet("/deletestaff")
public class DeleteStaff extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		
		StaffDao staffDao=new StaffDao();
		
		HttpSession httpSession =req.getSession();
		
		boolean s=staffDao.deleteStaff(id1);
		
		if(s) {
			httpSession.setAttribute("SuccMsg","Staff Deleted Successfully.....");
			resp.sendRedirect("deletestaff.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong.....");
			resp.sendRedirect("deletestaff.jsp");
		}
	}

}
