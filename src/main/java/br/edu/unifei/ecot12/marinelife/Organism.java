package br.edu.unifei.ecot12.marinelife;

public abstract class Organism {
    private float idade;
    private String especie;

    public float getIdade() {
        return idade;
    }
    public void setIdade(float idade) {
        this.idade = idade;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
