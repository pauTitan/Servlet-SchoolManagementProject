 package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Staff;

public class StaffDao {
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("pavan");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	public Staff saveStaff(Staff staff) {
	
		if(staff!=null) {
			entityTransaction.begin();
			entityManager.persist(staff);
			entityTransaction.commit();
		}
		return staff;
	}
	
	public Staff updateStaff(Staff staff) {
		Staff s=entityManager.find(Staff.class,staff.getId());
		s.setName(staff.getName());
		s.setDate(staff.getDate());
		s.setContact(staff.getContact());
		
		entityTransaction.begin();
		entityManager.merge(s);
		entityTransaction.commit();
		
		return s;
	}
	
	public boolean deleteStaff(int id) {
		Staff staff=entityManager.find(Staff.class,id);
		if(staff!=null) {
			entityTransaction.begin();
			entityManager.remove(staff);
			entityTransaction.commit();
			System.out.println("details deleted");
			return true;
		}else {
			System.out.println("details not deleted");
			return false;
		}
	}
	
	public List<Staff>getAllStaff(){
		String sql="Select s from Staff s";
		Query query=entityManager.createQuery(sql);
		List<Staff> staffs=query.getResultList();
		return staffs;
	}

}
