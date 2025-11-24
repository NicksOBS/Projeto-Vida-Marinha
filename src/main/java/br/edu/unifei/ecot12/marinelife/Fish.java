package br.edu.unifei.ecot12.marinelife;

public class Fish extends Herbivore{
    private float swimmingSpeed;
    private Fish breedingPartner;
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Fish breed(){
        if(breedingPartner == null){
            System.out.println("NO PARTNER FOUND");
            return null;
        }
        else if(breedingPartner.isGender() != this.isGender()){
            getEnvironment().setOxygenLevel(getEnvironment().getOxygenLevel() - 0.05);
            System.out.println("THE BREED WAS A SUCCESS");
            Fish fish = new Ecosystem().createFish(this.getEnvironment());
            getEnvironment().getOrganisms().add(fish);
            return fish;
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
