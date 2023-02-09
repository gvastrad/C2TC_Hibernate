package com.tnsif.dao;

import com.tnsif.entities.Student1;

public interface StudentDao {
	public abstract Student1 getStudentById(int id);
	public abstract void addStudent(Student1 student);
	public abstract void removeStudent(Student1 student);
	public abstract void updateStudent(Student1 student);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
