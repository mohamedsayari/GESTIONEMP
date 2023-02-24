package tn.teams.fromzero.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.teams.fromzero.dto.EmployeeDTO;
import tn.teams.fromzero.services.ServiceEmployee;

@RestController 
@RequestMapping("Api/v1/employee")

public class EmployeeController {
private ServiceEmployee serviceemployee;

@PostMapping("/save/{idemp}")
public EmployeeDTO save(@RequestBody EmployeeDTO dto, @PathVariable(name = "idemp") Long id) {
	
	return serviceemployee.save(dto,id);
}


@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id ) {
	serviceemployee.delete(id);
}

@GetMapping("/findbyid/{id}")
public EmployeeDTO findById(@PathVariable Long id) {
	return serviceemployee.findById(id);
}


@GetMapping("/lister")
public List<EmployeeDTO> findAllEmployees() {
	return serviceemployee.findAllEmployees();
}

@GetMapping("/liste-age/{age}")
public Integer countEmployeesByAge(@PathVariable Integer age) {
	return serviceemployee.countEmployeesByAge(age);
}


public EmployeeController(ServiceEmployee serviceemployee) {
	super();
	this.serviceemployee = serviceemployee;
}

}
