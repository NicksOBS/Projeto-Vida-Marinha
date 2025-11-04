package br.edu.unifei.ecot12.marinelife;

import java.util.ArrayList;
import java.util.List;

public class Fish extends Herbivore{
    private float swimmingSpeed;
    private List<Fish> school = new ArrayList<Fish>();

    public void swim(){
        this.getEnvironment().setOxygenLevel(this.getEnvironment().getOxygenLevel()-0.005); //decreases the oxygen level of the environment
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public List<Fish> getSchool() {
        return school;
    }

    public void setSchool(List<Fish> school) {
        this.school = school;
    }
    
}
