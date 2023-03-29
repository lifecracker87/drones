package com.life87.drone.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.life87.drone.models.Medication;

public interface MedicationRepo extends JpaRepository<Medication, Long>{

}
