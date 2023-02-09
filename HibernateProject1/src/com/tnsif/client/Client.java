package com.tnsif.client;

import com.tnsif.entities.Student1;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
    StudentService studentService=new StudentServiceImpl();
		
		Student1 student=new Student1();
		
		/*
		 * //Insert operation student.setSid(101); student.setSname("Gayatri");
		 * studentService.addStudent(student);
		 * 
		 * student.setSid(101); student.setSname("Gayatri");
		 * studentService.addStudent(student);
		 */
        
        
        
      //Retrieval operation
        Student1 student2=studentService.findStudentById(102);
        System.out.println(student2);
        
		
		  //Update Operation 
          student2.setSname("M S Dhoni");
		  studentService.updateStudent(student2);
		  
		  studentService.removeStudent(student2);
		 

	}

}
