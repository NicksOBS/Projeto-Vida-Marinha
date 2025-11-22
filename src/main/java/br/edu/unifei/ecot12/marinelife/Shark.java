package br.edu.unifei.ecot12.marinelife;

public class Shark extends Carnivore{
    private int toothQuantity;
    public float getSenseAccuracy() {
        return senseAccuracy;
    }

    public void setSenseAccuracy(float senseAccuracy) {
        this.senseAccuracy = senseAccuracy;
    }

    private float senseAccuracy;

    public int getToothQuantity() {
        return toothQuantity;
    }

    public void setToothQuantity(int toothQuantity) {
        this.toothQuantity = toothQuantity;
    }
}
