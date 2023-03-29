package com.life87.drone.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.life87.drone.models.Drone;
import com.life87.drone.models.Medication;

@Component
public class DroneService {
	
	private int fleetLimit = 10;
	
	private Map<String,Drone> fleet = new HashMap<>();
	private Map<String,Drone.State> dstatus = new HashMap<>();
	
	public void getIdleDrones() {
		
	}
	
	public void loadDrone(Drone d,Medication m) {
		if(fleet.containsKey(d.getSerialno())){
			if((d.getCurrentWt()+m.getWeight())<=d.getWeightlimit()) {
				d.loadMedication(m);
				if(d.getCurrentWt()==d.getWeightlimit()) {
					d.setState(Drone.State.LOADED);
				}
				d.setState(Drone.State.LOADING);
			}
		}else {
			//get drone Details from database
			
		}
	}
}
