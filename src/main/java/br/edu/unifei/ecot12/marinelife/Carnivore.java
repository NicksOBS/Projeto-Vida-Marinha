package br.edu.unifei.ecot12.marinelife;

public class Carnivore extends MarineAnimal{
    private float agressivenessLevel;
    private int amountOfMarineAnimalConsumed;
    private MarineAnimal food;

    public int getAmountOfMarineAnimalConsumed() {
        return amountOfMarineAnimalConsumed;
    }
    public void setAmountOfMarineAnimalConsumed(int amountOfMarineAnimalConsumed) {
        this.amountOfMarineAnimalConsumed = amountOfMarineAnimalConsumed;
    }
    public void foodTarget(MarineAnimal food){
    this.food = food;
    }
    public void feed(){
    if(food == null)
        System.out.println("NO TARGET FOUNDED");
    else{
        this.getEnvironment().removeOrganismFromEnvironment(food);
        this.getEnvironment().setOxygenLevel(this.getEnvironment().getOxygenLevel()-0.01);
        amountOfMarineAnimalConsumed++;
        }
    }
    public MarineAnimal getFood() {
        return food;
    }

    public void setFood(MarineAnimal food) {
        this.food = food;
    }

    public float getAgressivenessLevel() {
        return agressivenessLevel;
    }

    public void setAgressivenessLevel(float agressivenessLevel) {
        this.agressivenessLevel = agressivenessLevel;
    }
}
