package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dao.StaffDao;
import com.jsp.dto.Staff;

@WebServlet("/savestaff")
public class SaveStaff extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String date=req.getParameter("date");
		String contact=req.getParameter("contact");
		
		Staff s1=new Staff();
		s1.setName(name);
		s1.setDate(date);
		s1.setContact(contact);
		
		StaffDao staffDao=new StaffDao();
		
		HttpSession httpSession=req.getSession();
		
		Staff s=staffDao.saveStaff(s1);
		
		if(s!=null) {
			httpSession.setAttribute("SuccMsg", "Staff details saved Successfully...");
			resp.sendRedirect("savestaff.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong... ");
			resp.sendRedirect("savestaff.jsp");
		}
	}

}
