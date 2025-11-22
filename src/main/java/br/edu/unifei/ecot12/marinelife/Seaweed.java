package br.edu.unifei.ecot12.marinelife;

public class Seaweed extends Fauna{
    private String type;
    public boolean isToxicity() {
        return toxicity;
    }

    public void setToxicity(boolean toxicity) {
        this.toxicity = toxicity;
    }

    private boolean toxicity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
