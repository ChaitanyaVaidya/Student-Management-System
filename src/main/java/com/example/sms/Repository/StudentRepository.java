package com.example.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
