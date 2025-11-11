package br.edu.unifei.ecot12.marinelife;

public abstract interface Prototype <T extends Prototype<T>>{
    public abstract T clone();
}