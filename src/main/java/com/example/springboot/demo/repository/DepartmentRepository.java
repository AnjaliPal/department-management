package com.example.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
