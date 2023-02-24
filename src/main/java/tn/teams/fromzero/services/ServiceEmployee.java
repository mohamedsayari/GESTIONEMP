package tn.teams.fromzero.services;

import tn.teams.fromzero.dto.EmployeeDTO;

import java.util.List;

public interface ServiceEmployee {

 
    void delete(Long id);
    EmployeeDTO findById(Long id);
    List<EmployeeDTO> findAllEmployees();
    Integer countEmployeesByAge(Integer age);
	EmployeeDTO save(EmployeeDTO dto, Long id);
	void addMissiontoEmployee (String nameMission , String nameEmployee);
}
