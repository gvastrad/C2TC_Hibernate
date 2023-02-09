package com.tnsif.service;

import com.tnsif.entities.Student1;

public interface StudentService {
	public abstract Student1 findStudentById(int id);
	public abstract void addStudent(Student1 student);
	public abstract void removeStudent(Student1 student);
	public abstract void updateStudent(Student1 student);
}
