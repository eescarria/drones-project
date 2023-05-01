package com.example.drones.service;

import com.example.drones.domain.Drone;
import com.example.drones.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DroneService {
    private DroneRepository droneRepository;

    @Autowired
    public DroneService(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }

    public Drone saveDrone(Drone drone){
        return droneRepository.save(drone);
    }

    public Optional<Drone> getDrone(Long id){
        return droneRepository.findById(id);
    }
}
