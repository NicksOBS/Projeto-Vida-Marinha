package br.edu.unifei.ecot12.marinelife;

public abstract class Herbivore extends MarineAnimal {
    private int amountOfAlgaeConsumed;
    private Seaweed food;
    private String defenseType;
    private Coral residence;

    public void changeResidence(Coral c){
    if(residence == c)
        System.out.println("SAME RESIDENCE");
    else if(c.getQuantityOrganisms() >= c.getMaxCapacity()){
        setResidence(c);
        c.getResidents().add(this);
        System.out.println("RESIDENCE CHANGED");
    }
    System.out.println("MAX CAPACITY ACHIEVED");
    }


    public Seaweed getFood() {
        return food;
    }

    public Coral getResidence() {
        return residence;
    }

    public void setResidence(Coral residence) {
        this.residence = residence;
    }

    public void setFood(Seaweed food) {
        this.food = food;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

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
