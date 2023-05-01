package com.example.drones.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "drones")
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer serialNumber;
    private Model model;
    private Double weightLimit;
    private Double batteryCapacity;
    private State state;
    @OneToMany(mappedBy = "drone", fetch = FetchType.LAZY)
    private Set<Medication> medications = new HashSet<>();

    public Drone() {
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
}
