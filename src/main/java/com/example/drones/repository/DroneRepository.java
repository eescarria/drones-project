package com.example.drones.repository;

import com.example.drones.domain.Drone;
import com.example.drones.domain.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DroneRepository extends JpaRepository<Drone,Long> {

}
