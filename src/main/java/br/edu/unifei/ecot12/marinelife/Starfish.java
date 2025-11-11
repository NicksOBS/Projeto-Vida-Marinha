package br.edu.unifei.ecot12.marinelife;

public class Starfish extends Herbivore implements Prototype<Starfish> {
    private String color;

    public Starfish clone(){
        Starfish sf = new Starfish();
        getEnvironment().getOrganisms().add(sf);
        return sf;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}