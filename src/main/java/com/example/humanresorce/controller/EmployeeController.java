package com.example.humanresorce.controller;

import com.example.humanresorce.service.EmployeeService;
import com.example.humanresorce.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> showEmployee(){
        return employeeService.showAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> showEmployeeById(@PathVariable Long id){
        return employeeService.showEmployeeById(id);
    }

    @PostMapping
    public Employee insertEmployee(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping
    public ResponseEntity<Employee> updateEmployee(@RequestParam("id") Long id,@RequestBody Employee employee){
        if (id!=employee.getId()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(employeeService.updateEmployee(employee),HttpStatus.OK);
    }

    @PostMapping("/multiple")
    public String createMultipleEmployee(@RequestBody List<Employee> employeeList){
        employeeService.createMultipleEmployee(employeeList);
        return "successful";
    }
}
