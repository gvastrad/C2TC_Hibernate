package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entities.Student1;

public class StudentDaoImpl implements StudentDao {

    EntityManager entityManager;
	
	public StudentDaoImpl()
	{
	entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public Student1 getStudentById(int id) {
		Student1 student=entityManager.find(Student1.class, id);
		return student;
	}

	@Override
	public void addStudent(Student1 student) {
		entityManager.persist(student);
	}

	@Override
	public void removeStudent(Student1 student) {	
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student1 student) {
		entityManager.merge(student);	
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

}
