package br.edu.unifei.ecot12.marinelife;

public abstract class MarineAnimal extends Organism{
    private boolean breathesWater;
    private int maxDiveDepth;

    public int getMaxDiveDepth() {
        return maxDiveDepth;
    }

    public void setMaxDiveDepth(int maxDiveDepth) {
        this.maxDiveDepth = maxDiveDepth;
    }

    public boolean isBreathesWater() {
        return breathesWater;
    }

    public void setBreathesWater(boolean breathesWater) {
        this.breathesWater = breathesWater;
    }
}
