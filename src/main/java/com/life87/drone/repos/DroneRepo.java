package com.life87.drone.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.life87.drone.models.Drone;

public interface DroneRepo extends JpaRepository<Drone, Long>{
	
}
