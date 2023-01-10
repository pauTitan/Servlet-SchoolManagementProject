package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.annotation.WebServlet;

import com.jsp.dto.Teacher;

public class TeacherDao {
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("pavan");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Teacher saveTeacher(Teacher teacher) {
		
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.persist(teacher);
			entityTransaction.commit();
		}
		return teacher;
		
	}
	//To update teacher
	public Teacher updateTeacher(Teacher teacher) {
		Teacher t=entityManager.find(Teacher.class, teacher.getId());
		t.setName(teacher.getName());
		t.setSubject(teacher.getSubject());
		t.setContact(teacher.getContact());
		t.setGender(teacher.getGender());
		
			entityTransaction.begin();
			entityManager.merge(t);
			entityTransaction.commit();
		
		return t;
	}
	//To delete teacher
	public boolean deleteTeacher(int id) {
		Teacher teacher=entityManager.find(Teacher.class,id);
		if(teacher!=null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
			System.out.println("Teacher id deleted");
			return true;
		}else {
			return false;
		}
	}
	//Details of teacher
	public List<Teacher> getAllTeacher(){
		String sql="Select t from Teacher t";
		Query query=entityManager.createQuery(sql);
		List<Teacher> teachers=query.getResultList();
		return teachers;
	}

}
