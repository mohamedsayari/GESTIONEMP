package tn.teams.fromzero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.teams.fromzero.entities.Mission;

public interface MissionRepository extends JpaRepository<Mission, Long> {

	Mission findByName(String name);
	
	
	
}
