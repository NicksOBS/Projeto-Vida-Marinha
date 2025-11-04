package br.edu.unifei.ecot12.marinelife;

public abstract class Herbivore extends MarineAnimal {
    private int amountOfAlgaeConsumed;
    private Seaweed food;

    public void foodTarget(Seaweed food){
        this.food = food;
    }

    public void feed(){
        if(food == null)
            System.out.println("NO TARGET FOUNDED");
        else{
            this.getEnvironment().removeOrganismFromEnvironment(food);
            this.getEnvironment().setOxygenLevel(this.getEnvironment().getOxygenLevel()-0.01);
            amountOfAlgaeConsumed++;
        }
    }


    public int getAmountOfAlgaeConsumed() {
        return amountOfAlgaeConsumed;
    }
    public void setAmountOfAlgaeConsumed(int amountOfAlgaeConsumed) {
        this.amountOfAlgaeConsumed = amountOfAlgaeConsumed;
    }
}
