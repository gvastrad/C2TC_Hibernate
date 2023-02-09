package com.tnsif.client;

import javax.persistence.EntityManager;

import com.tnsif.dao.JPAUtil;
import com.tnsif.entities.Address;
import com.tnsif.entities.Student;

public class Client {

	public static void main(String[] args) {
       EntityManager em=JPAUtil.getEntityManager(); 
		
        em.getTransaction().begin();
        Student student = new Student();
		student.setName("Aditya");
		
        Address homeAddress = new Address();
		
		homeAddress.setStreet("RSC 132");
		homeAddress.setCity("Mumbai");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("400064");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
				
		System.out.println("Added one student with address to database.");

	}

}
