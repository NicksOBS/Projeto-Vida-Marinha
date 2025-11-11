package br.edu.unifei.ecot12.marinelife;

public abstract class Fauna extends Organism{
    private float size;
    private String healthyLevel;

    public void photosynthesis(){
       this.getEnvironment().setOxygenLevel(this.getEnvironment().getOxygenLevel()+0.01); //increses the oxygen level of the environment
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getHealthyLevel() {
        return healthyLevel;
    }

    public void setHealthyLevel(String healthyLevel) {
        this.healthyLevel = healthyLevel;
    }
}
