package br.edu.unifei.ecot12.marinelife;

public abstract class MarineAnimal extends Organism{
    private boolean breathesWater;

    public boolean isBreathesWater() {
        return breathesWater;
    }

    public void setBreathesWater(boolean breathesWater) {
        this.breathesWater = breathesWater;
    }
}
