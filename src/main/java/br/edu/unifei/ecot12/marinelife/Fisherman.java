package br.edu.unifei.ecot12.marinelife;

import java.util.ArrayList;
import java.util.List;

public class Fisherman extends Profession {
    private int numberOfFishCaught;
    private List<Herbivore> catches = new ArrayList<>();

    public int getNumberOfFishCaught() {
        return numberOfFishCaught;
    }

    public void setNumberOfFishCaught(int numberOfFishCaught) {
        this.numberOfFishCaught = numberOfFishCaught;
    }

    public List<Herbivore> getCatches() {
        return catches;
    }

    public void setCatches(List<Herbivore> catches) {
        this.catches = catches;
    }
}
