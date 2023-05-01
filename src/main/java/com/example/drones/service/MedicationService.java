package com.example.drones.service;

import com.example.drones.domain.Medication;
import com.example.drones.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {
    private MedicationRepository medicationRepository;

    @Autowired
    public MedicationService(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    public Medication saveMedication(Medication medication){
        return medicationRepository.save(medication);
    }

    public List<Medication> getMedications(){
        return medicationRepository.findAll();
    }
}
