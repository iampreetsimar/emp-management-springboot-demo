package com.example.empManagement.services;

import java.util.List;

import com.example.empManagement.models.Employee;

public interface EmpServiceInterface {
    String createEmp(Employee emp);

    List<Employee> getAllEmp();

    boolean deleteEmp(Long empId);

    String updateEmp(Employee emp, Long empId);
    
    Employee getEmpById(Long empId);
} 
