package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.StaffDao;
import com.jsp.dto.Staff;

public class AllDetailsOfStaff extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StaffDao staffDao=new StaffDao();
		List<Staff> staffs=staffDao.getAllStaff();
	}

}
