package com.tnsif.service;

import com.tnsif.dao.StudentDao;
import com.tnsif.dao.StudentDaoImpl;
import com.tnsif.entities.Student1;

public class StudentServiceImpl implements StudentService{

	 private StudentDao studentdao;
		
		public StudentServiceImpl()
		{
			studentdao=new StudentDaoImpl();
		}
	@Override
	public Student1 findStudentById(int id) {
		
		Student1 student=studentdao.getStudentById(id);
		return student;
	}

	@Override
	public void addStudent(Student1 student) {
		studentdao.beginTransaction();
		studentdao.addStudent(student);
		studentdao.commitTransaction();	
		
	}

	@Override
	public void removeStudent(Student1 student) {
		
		studentdao.beginTransaction();
		studentdao.removeStudent(student);
		studentdao.commitTransaction();	
	}

	@Override
	public void updateStudent(Student1 student) {
		studentdao.beginTransaction();
		studentdao.updateStudent(student);
		studentdao.commitTransaction();	
		
	}

}
