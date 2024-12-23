package com.example.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.springboot.demo.entity.Department;

public interface DepartmentService {

    List<Department> getDepartmentList();

    Optional<Department> getDepartmentById(Integer departmentId);

    Department addDepartment(Department department);

    Optional<Department> updateDepartment(Department department, Integer departmentId);

    void deleteDepartment(Integer departmentId);

}
