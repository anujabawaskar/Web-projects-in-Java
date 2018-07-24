package com.anuja.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.anuja.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
