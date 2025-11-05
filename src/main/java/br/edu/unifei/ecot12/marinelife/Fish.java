package br.edu.unifei.ecot12.marinelife;

public class Fish extends Herbivore{
    private float swimmingSpeed;
    private Fish breedingPartner;

    public Fish breed(Fish breedingPartner){
        if(breedingPartner.isGender() != this.isGender()){
            getEnvironment().setOxygenLevel(getEnvironment().getOxygenLevel() - 0.05);
            System.out.println("THE BREED WAS A SUCCESS");
            return new Fish();
        }
        else{
            System.out.println("THE BREED FAILED");
            return null;
        }
    }

    public void swim(){
        this.getEnvironment().setOxygenLevel(this.getEnvironment().getOxygenLevel()-0.005); //decreases the oxygen level of the environment
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Fish getBreedingPartner() {
        return breedingPartner;
    }

    public void setBreedingPartner(Fish breedingPartner) {
        this.breedingPartner = breedingPartner;
    }

}
