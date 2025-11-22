package br.edu.unifei.ecot12.marinelife;

public class App {
    public static void main(String[] args) {
        Environment e = new Environment();
        Ecosystem eco = new Ecosystem();
        e = eco.createEnvironment(2);
        Human h1 = eco.createHuman(e, 1);
        Shark s = eco.createShark(e);
        Starfish st = eco.createStarfish(e);
        Starfish st1 = st.clone();
        Fish f1 = eco.createFish(e);
        System.out.println(eco.organismsList(e));
        s.feed();
        s.foodTarget(f1);
        s.feed();
        System.out.println(eco.organismsList(e));
    }
}
