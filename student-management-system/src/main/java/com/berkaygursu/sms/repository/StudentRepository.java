package com.berkaygursu.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berkaygursu.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
