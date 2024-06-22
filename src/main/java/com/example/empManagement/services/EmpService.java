package com.example.empManagement.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.empManagement.EmpEntity;
import com.example.empManagement.models.Employee;
import com.example.empManagement.repositories.EmpRepository;

@Service
public class EmpService implements EmpServiceInterface{

    private final EmpRepository empRepository;

    public EmpService(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public String createEmp(Employee emp) {
        empRepository.save(emp);
        return "Employee created!";
    }

    @Override
    public List<Employee> getAllEmp() {
        return empRepository.findAll();
    }

    @Override
    public Employee getEmpById(Long empId) {
        return empRepository.findById(empId).get();
    }

    @Override
    public boolean deleteEmp(Long empId) {
        empRepository.deleteById(empId);
        return true;
    }

    @Override
    public String updateEmp(Employee emp, Long empId) {
        empRepository.save(emp);
        return "Employee Updated!";
    }
    
}
