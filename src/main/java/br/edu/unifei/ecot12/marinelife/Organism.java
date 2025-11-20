package br.edu.unifei.ecot12.marinelife;

public abstract class Organism {
    private float age;
    private String species;
    private Environment environment;
    private boolean gender; //gender == true, male. gender == false, female
    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Environment getEnvironment() {
        return environment;
    }
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
