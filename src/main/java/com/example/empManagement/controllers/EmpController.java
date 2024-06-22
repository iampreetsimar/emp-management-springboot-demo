package com.example.empManagement.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.empManagement.models.Employee;
import com.example.empManagement.services.EmpService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EmpController {

    private final EmpService empService;

    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee emp) {
        return empService.createEmp(emp);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmp();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return empService.getEmpById(id);
    }
    

    @DeleteMapping("/employees/{id}")
    public boolean deleteEmployee(@PathVariable Long id) {
        return empService.deleteEmp(id);
    }
    
    @PutMapping("/employees/{id}")
    public String updateEmployee(@RequestBody Employee emp, @PathVariable Long empId) {
        return empService.updateEmp(emp, empId);
    }
    
}
