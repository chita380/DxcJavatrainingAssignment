package com.assignment.springboot.mongo.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springboot.mongo.model.Employee;
import com.assignment.springboot.mongo.service.Employeeservice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Swagger2DemoRestController")
@RestController
//@RequestMapping(value = "/api/mongo/emp")
public class Employeecontroller {

	@Autowired
	Employeeservice employeeService;

	@ApiOperation(value = "Get list of Employee in the System ", response = Iterable.class, tags = "getEmployees")
	@ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	
	@PostMapping(value = "/create")
	public String create(@RequestBody List<Employee> emp) {

		employeeService.createEmployee(emp);
		return "Employee records created.";
	}

	@GetMapping(value = "/getall")
	public Collection<Employee> getAll() {

		return employeeService.getAllEmployees();
	}

	@GetMapping(value = "/getbyid/{employee-id}")
	public Optional<Employee> getById(@PathVariable(value = "employee-id") int id) {

		return employeeService.findEmployeeById(id);
	}

	@PutMapping(value = "/update/{employee-id}")
	public String update(@PathVariable(value = "employee-id") int id, @RequestBody Employee e) {
		e.setId(id);
		employeeService.updateEmployee(e);
		return "Employee record for employee-id= " + id + " updated.";
	}

	@DeleteMapping(value = "/delete/{employee-id}")
	public String delete(@PathVariable(value = "employee-id") int id) {
		employeeService.deleteEmployeeById(id);
		return "Employee record for employee-id= " + id + " deleted.";
	}

	@DeleteMapping(value = "/deleteall")
	public String deleteAll() {
		employeeService.deleteAllEmployees();
		return "All employee records deleted.";
	}
}