package br.edu.unifei.ecot12.marinelife;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private int waterSalinity;
    private float depth;
    private float temperature;
    private double oxygenLevel;
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Organism> organisms = new ArrayList<>();

    public int entitiesQuantity(){
        return organisms.size();
    }

    public void removeOrganismFromEnvironment(Organism oragnism){
        organisms.remove(oragnism);
    }

    public List<Organism> getOrganisms() {
        return organisms;
    }

    public void setOrganisms(List<Organism> organisms) {
        this.organisms = organisms;
    }

    public int getWaterSalinity() {
        return waterSalinity;
    }

    public void setWaterSalinity(int waterSalinity) {
        this.waterSalinity = waterSalinity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
