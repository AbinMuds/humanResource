package com.example.humanresorce.Employee.service;


import com.example.humanresorce.Employee.domain.Employee;
import com.example.humanresorce.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee insertEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> showAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> showEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    public void createMultipleEmployee(List<Employee> employeeList) {
        employeeRepository.saveAll(employeeList);
    }
}
