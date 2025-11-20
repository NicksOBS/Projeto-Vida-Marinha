package br.edu.unifei.ecot12.marinelife;

public abstract class Profession {
    private String description;
    private float salary;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

}
