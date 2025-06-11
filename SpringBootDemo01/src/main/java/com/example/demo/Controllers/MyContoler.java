package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ModelorEntity.Employee;

@RestController
public class MyContoler {
	ArrayList<Employee> emp = new ArrayList<Employee>();
	public MyContoler() 
	{
	      emp.add(new Employee(1, "John", 30, 50000, "Developer"));
	      emp.add(new Employee(2, "Jane", 28, 60000, "Tester"));
	      emp.add(new Employee(3, "Modi", 78, 90000, "PM"));
	 }
 
	 @GetMapping("getAllEmployee")
	 public List<Employee> getEmployees() {
	      return emp;
	 }
	 @GetMapping("/getEmployee/{id}")
	 public Employee getEmployeeById(@PathVariable int id) {
	     for (Employee e : emp) {
	         if (e.getId() == id) {
	             return e;
	         }
	     }
	     return null; // or return a custom message or throw exception if needed
	 }
	 
	 @GetMapping("/getEmployeeByName/{name}")
	 public String getEmployeeByName(@PathVariable String name) {
	     for (Employee e : emp) {
	         if (e.getName().equalsIgnoreCase(name)) {
	             return "Employee Found: " + e.toString(); // or format it as needed
	         }
	     }
	     return "Employee not available with name: " + name;
	 }

	 
	 @PostMapping("addEmployee")
	  public String addEmployee(@RequestBody Employee employee) {
		 emp.add(employee);
	    return "Employee added successfully!";
	  }
	 @DeleteMapping("/deleteEmployee/{id}")
	 public String deleteEmployeeById(@PathVariable int id) {
	     for (Employee e : emp) {
	         if (e.getId() == id) {
	             emp.remove(e);
	             return "Employee with ID " + id + " deleted successfully!";
	         }
	     }
	     return "Employee with ID " + id + " not found!";
	 }	
	 @PutMapping("/updateEmployee/{id}")
	 public ResponseEntity<String> updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
	     for (Employee e : emp) {
	         if (e.getId() == id) {
	             e.setName(updatedEmployee.getName());
	             e.setAge(updatedEmployee.getAge());
	             e.setSalary(updatedEmployee.getSalary());
	             e.setDesig(updatedEmployee.getDesig());
	             return ResponseEntity.ok("Employee with ID " + id + " updated successfully!");
	         }
	     }
	     return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                          .body("Employee with ID " + id + " not found!");
	 }
	
}
