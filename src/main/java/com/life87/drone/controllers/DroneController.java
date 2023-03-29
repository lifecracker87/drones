package com.life87.drone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.life87.drone.models.Drone;
import com.life87.drone.services.DroneService;

@RestController
@RequestMapping("drone")
public class DroneController {
	@Autowired
	DroneService ds;
	
	@GetMapping("register")
	public String registerDrone(@RequestBody Drone drone){
		return "";
	}
}
