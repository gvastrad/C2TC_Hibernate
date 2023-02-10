package com.tnsif.client;

import javax.persistence.EntityManager;

import com.tnsif.dao.JPAUtil;
import com.tnsif.entities.Employee;
import com.tnsif.entities.Manager;

public class Client {

	public static void main(String[] args) {
      EntityManager em=JPAUtil.getEntityManager(); 
		
        em.getTransaction().begin();
        
        Employee emp1=new Employee(); 
        emp1.setName("Sharmila");
        emp1.setSalary(10000);
        em.persist(emp1);
        
        Manager manager1=new Manager();
		manager1.setName("Madhu");
		manager1.setSalary(100000);
		manager1.setDepartmentName("C2C");
		em.persist(manager1);
        em.getTransaction().commit();
        System.out.println("Added one employee and manager to database.");

	}

}
