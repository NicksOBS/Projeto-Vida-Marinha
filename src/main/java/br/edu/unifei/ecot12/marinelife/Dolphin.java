package br.edu.unifei.ecot12.marinelife;

public class Dolphin extends Carnivore{
    private float inteligenceLevel;
    public float getCommunicationSkills() {
        return communicationSkills;
    }

    public void setCommunicationSkills(float communicationSkills) {
        this.communicationSkills = communicationSkills;
    }

    private float communicationSkills;

    public float getInteligenceLevel() {
        return inteligenceLevel;
    }

    public void setInteligenceLevel(float inteligenceLevel) {
        this.inteligenceLevel = inteligenceLevel;
    }
}
