package com.example.humanresorce.repository;

import com.example.humanresorce.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    @Query( value = "select * from employee where lastName=?1", nativeQuery = true)
@Query("select e from Employee e where e.firstName=?1 or e.lastName=?1")
    public List<Employee> findByLastNameOrFirstName(String name);
}
