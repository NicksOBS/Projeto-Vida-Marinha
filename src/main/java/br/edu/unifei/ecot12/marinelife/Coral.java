package br.edu.unifei.ecot12.marinelife;

import java.util.ArrayList;
import java.util.List;

public class Coral extends Fauna{
    private String color;
    private List<Herbivore> residents = new ArrayList<Herbivore>();
    private int maxCapacity; 
    private int quantityOrganisms;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Herbivore> getResidents() {
        return residents;
    }

    public void setResidents(List<Herbivore> resident) {
        this.residents = resident;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getQuantityOrganisms() {
        return quantityOrganisms;
    }

    public void setQuantityOrganisms(int quantityOrganisms) {
        this.quantityOrganisms = quantityOrganisms;
    }
}
