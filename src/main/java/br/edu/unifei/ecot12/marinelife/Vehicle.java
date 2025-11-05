package br.edu.unifei.ecot12.marinelife;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private int capacity;
    private List<Human> passengers = new ArrayList<>();

    public List<Human> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Human> passengers) {
        this.passengers = passengers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
