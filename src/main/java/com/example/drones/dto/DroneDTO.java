package com.example.drones.dto;

import com.example.drones.domain.Model;
import com.example.drones.domain.State;

import java.util.Set;

public class DroneDTO {
    private Long id;
    private Integer serialNumber;
    private Model model;
    private Double weightLimit;
    private Double batteryCapacity;
    private State state;
    private Set<MedicationDTO> medications;

    public DroneDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(Double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<MedicationDTO> getMedications() {
        return medications;
    }

    public void setMedications(Set<MedicationDTO> medications) {
        this.medications = medications;
    }
}
