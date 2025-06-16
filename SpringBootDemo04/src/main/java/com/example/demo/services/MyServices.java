package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Model.Employee;
import com.example.demo.Repos.MyRepo;
import com.example.demo.exceptions.EmployeeNotFoundException;

@Service
public class MyServices {

	@Autowired
	private MyRepo repo;
	
	 public List<Employee> getAllEmployee() {
	        return repo.findAll();
	    }

	    public Employee getEmployeeById(int id) {
	        return repo.findById(id)
	          .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
	    }

	   
	    public String addEmployee(Employee employee) {
	        repo.save(employee);
	        return "Employee added successfully!";
	    }

	    public String updateEmployee(int id, Employee updatedEmployee) {
	        Optional<Employee> existingEmp = repo.findById(id);
	        if (existingEmp.isPresent()) {
	            Employee emp = existingEmp.get();
	            emp.setName(updatedEmployee.getName());
	            emp.setAge(updatedEmployee.getAge());
	            emp.setSalary(updatedEmployee.getSalary());
	            emp.setDesig(updatedEmployee.getDesig());
	            repo.save(emp);
	            return "Employee updated successfully!";
	        } else {
	            return "Employee not found with ID: " + id;
	        }
	    }

	    public String deleteEmployee(int id) {
	        if (repo.existsById(id)) {
	            repo.deleteById(id);
	            return "Employee deleted successfully!";
	        } else {
	            throw new EmployeeNotFoundException("Employee not found with ID: " + id);
	        }
	    }

	    public String deleteAllEmployees() {
	        repo.deleteAll();
	        return "All Data Deleted ....!";
	    }
	
	
}
