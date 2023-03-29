package com.life87.drone.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.life87.drone.models.Drone;
import com.life87.drone.models.Medication;

@Component
public class DroneLoader {
	private Map<String,Drone> drones = new HashMap<>();
	
	public void addLoad(String serial,Medication m) {
		if(drones.containsKey(serial)) {
			
		}
	}
}
