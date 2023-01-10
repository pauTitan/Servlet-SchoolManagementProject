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
@WebServlet("/updatestaff")
public class UpdateStaff extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String date=req.getParameter("date");
		String contact=req.getParameter("contact");
		
		Staff s=new Staff();
		if(s!=null) {
			s.setId(id1);
			s.setName(name);
			s.setDate(date);
			s.setContact(contact);
			System.out.println("details updated");	
		}else {
			System.out.print("details not updated");
		}
		
		StaffDao staffDao =new StaffDao();
		
		HttpSession httpSession =req.getSession();
		
		Staff s1=staffDao.updateStaff(s);
		
		if(s1!=null) {
			httpSession.setAttribute("SuccMsg","Staff Updated Successfully.....");
			resp.sendRedirect("updatestaff.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong.....");
			resp.sendRedirect("updatestaff.jsp");
		}
	}

}
