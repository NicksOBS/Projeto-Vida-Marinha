package br.edu.unifei.ecot12.marinelife;

public abstract class Fauna extends Organism{
    private float size;

    public void photosynthesis(){
       this.getEnvironment().setOxygenLevel(this.getEnvironment().getOxygenLevel()+0.01); //increses the oxygen level of the environment
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
