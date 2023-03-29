package com.life87.drone.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="drones")
public class Drone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="seraialno")
	private String serialno;
	
	@Enumerated(EnumType.STRING)
	private Model model;
	
	@Column(name="weightlimit")
	private int weightlimit;
	
	@Column(name="batterycapicity")
	private int batterycapicity;
	
	@Enumerated(EnumType.STRING)
	private State state;
	
	public enum State {IDLE, LOADING, LOADED, DELIVERING, DELIVERED, RETURNING}
	public enum Model {Lightweight, Middleweight, Cruiserweight, Heavyweight}
	
	private int currentWt;
	
	private List<Medication> medications;
	
	public void loadMedication(Medication m) {
		currentWt +=m.getWeight();
		if(medications == null) {
			medications = new ArrayList<>();
		}
		medications.add(m);
	}
	
	public int getCurrentWt() {
		return this.currentWt;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public int getWeightlimit() {
		return weightlimit;
	}
	public void setWeightlimit(int weightlimit) {
		this.weightlimit = weightlimit;
	}
	public int getBatterycapicity() {
		return batterycapicity;
	}
	public void setBatterycapicity(int batterycapicity) {
		this.batterycapicity = batterycapicity;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
