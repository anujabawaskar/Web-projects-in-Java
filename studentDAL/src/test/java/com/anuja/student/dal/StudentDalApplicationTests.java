package com.anuja.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.anuja.student.dal.entities.Student;
import com.anuja.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student entity = new Student();
		entity.setName("John");
		entity.setCourse("Dance");
		entity.setFee(100);
		studentRepository.save(entity);
	}
	
	@Test
	public void testFindStudentByID() {
		Optional<Student> student = studentRepository.findById(1);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudentByID() {
		Student student = studentRepository.findById(1).get();
		student.setFee(600);
		studentRepository.save(student);
		//System.out.println(student);
	}
	
	
	@Test
	public void testDeleteStudentByID() {
		Student student = studentRepository.findById(1).get();
		//student.setFee(600);
		studentRepository.delete(student);
		//System.out.println(student);
	}
	
}
