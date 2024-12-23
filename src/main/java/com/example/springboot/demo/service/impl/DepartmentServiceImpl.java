package com.example.springboot.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.demo.entity.Department;
import com.example.springboot.demo.repository.DepartmentRepository;
import com.example.springboot.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getDepartmentById(Integer departmentId) {
        return departmentRepository.findById(departmentId);
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> updateDepartment(Department department, Integer departmentId) {
        if (departmentRepository.findById(departmentId).isPresent()) {
            Department updatedDepartment = new Department();
            updatedDepartment.setDepartmentName(department.getDepartmentName());
            updatedDepartment.setDepartmentAddress(department.getDepartmentAddress());
            updatedDepartment.setDepartmentCode(department.getDepartmentCode());
            return Optional.of(departmentRepository.save(updatedDepartment));

        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteDepartment(Integer departmentId) {
        departmentRepository.deleteById(departmentId);

    }

}
