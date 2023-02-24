package tn.teams.fromzero.dto;

import java.util.List;

import org.springframework.beans.BeanUtils;

import lombok.Builder;
import lombok.Data;
import tn.teams.fromzero.entities.Mission;



@Data
public class MissionDTO {
	
	private Long id; 
	private String name;
	private String period;
    //private List<Integer> employeId ;
    
	
	public static MissionDTO fromentitie(Mission mission) {
		 MissionDTO missiondto = new MissionDTO();
		 BeanUtils.copyProperties(mission, missiondto);
		 
		 return missiondto; 
	}
	public static  Mission toentitie(MissionDTO dto) {
		Mission mission = new Mission();
		BeanUtils.copyProperties(dto, mission);
		return mission;
		
	}
}

