package com.example.empManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empManagement.models.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
    
} 
