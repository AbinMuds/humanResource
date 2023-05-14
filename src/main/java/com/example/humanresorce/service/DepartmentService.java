package com.example.humanresorce.service;

import com.example.humanresorce.domain.Department;
import com.example.humanresorce.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    public List<Department> displayAllDepartment() {
        return departmentRepository.findAll();
    }

    public Optional<Department> displayDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    public Department insertDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> insertMultipleDepartment(List<Department> departmentList) {
        departmentRepository.saveAll(departmentList);
        return departmentList;
    }

    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

    public Department updateDepartment(Department department){
        return departmentRepository.save(department);
    }
}
