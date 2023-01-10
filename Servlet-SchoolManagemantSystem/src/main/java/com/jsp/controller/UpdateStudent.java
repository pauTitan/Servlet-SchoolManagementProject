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
@WebServlet("/updatestudent")
public class UpdateStudent extends HttpServlet {
	
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
		
		Student s=new Student();
		if(s!=null) {
			s.setId(id1);
			s.setName(name);
			s.setEmail(email);
			s.setCno(cno);
			s.setDob(dob);
			s.setGender(gender);
			System.out.println("details updated");
		}else {
			System.out.println("details not updated");
		}
		
		StudentDao studentDao=new StudentDao();
		
		HttpSession httpSession=req.getSession();
		
		Student s1=studentDao.updateStudent(s);
		
		if(s1!=null) {
			httpSession.setAttribute("SuccMsg","Student Updated Successfully.....");
			resp.sendRedirect("updatestudent.jsp");
		}else {
			httpSession.setAttribute("error", "Something went wrong.....");
			resp.sendRedirect("updatestudent.jsp");
		}
	}

}
