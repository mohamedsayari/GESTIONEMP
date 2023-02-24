package tn.teams.fromzero.dto;

import java.util.List;

import org.springframework.beans.BeanUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.teams.fromzero.entities.Mission;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MissionDtoSavemany {
	private Long id; 
	private String name;
	private String period;
    private List<Long> employeId ;
    
	
	public static MissionDtoSavemany fromentitie(Mission mission) {
		MissionDtoSavemany missiondto = new MissionDtoSavemany();
		 BeanUtils.copyProperties(mission, missiondto);
		 
		 return missiondto; 
	}
	public static  Mission toentitie(MissionDtoSavemany dto) {
		Mission mission = new Mission();
		BeanUtils.copyProperties(dto, mission);
		return mission;
		
	}
}
