package com.example.humanresorce.controller;

import com.example.humanresorce.domain.Department;
import com.example.humanresorce.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/department")
public class DepartmentController{

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> displayDepartment(){
        return departmentService.displayAllDepartment();
    }

    @GetMapping("/{id}")
    public Optional<Department> displayDepartmentById(@PathVariable Long id){
        return departmentService.displayDepartmentById(id);
    }

    @PostMapping
    public Department insertDepartment(@RequestBody Department department){
        return departmentService.insertDepartment(department);
    }

    @PostMapping("/multiple")
    public List<Department> insertMultipleDepartment(@RequestBody List<Department> departmentList){
       return departmentService.insertMultipleDepartment(departmentList);
    }

    @DeleteMapping
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
    }

    @PutMapping
    public ResponseEntity<Department> updateDepartment(@RequestParam("id") Long id, @RequestBody Department department) {
        if (id!= department.getId()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(departmentService.updateDepartment(department),HttpStatus.OK);
    }
}
