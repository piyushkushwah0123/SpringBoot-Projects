package com.app.piyush.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.piyush.entity.Student;

public interface StudentRepository 
       extends JpaRepository<Student,Integer> {

}