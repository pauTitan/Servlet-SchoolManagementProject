package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pavan");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Student saveStudent(Student student) {
		
		if(student!=null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		}
		return student;
	}
	
	public Student updateStudent(Student student) {
		Student s=entityManager.find(Student.class, student.getId());
		s.setName(student.getName());
		s.setEmail(student.getEmail());
		s.setDob(student.getDob());
		s.setCno(student.getCno());
		s.setGender(student.getGender());
		
		entityTransaction.begin();
		entityManager.merge(s);
		entityTransaction.commit();
		
		return s;
		
	}
	
	public boolean deleteStudent(int id) {
		Student student=entityManager.find(Student.class, id);
		if(student!=null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			System.out.println("details deleted");
			return true;
		}else {
			System.out.println("details not deleted");
			return false;
		}
	}
	
	public List<Student> getAllStudent(){
		String sql="Select s from Student s";
		Query query=entityManager.createQuery(sql);
		List<Student> students=query.getResultList();
		return students;
	}

}
