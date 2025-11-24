package br.edu.unifei.ecot12.marinelife;

public class App {
    public static void main(String[] args) {
        Ecosystem eco = new Ecosystem();
        Environment e = eco.createEnvironment(2);
        Human h1S = eco.createHuman(e, 1);
        Human h2B = eco.createHuman(e, 2);
        Human h3F = eco.createHuman(e, 3);

        Vehicle v1 = eco.createVehicle(e, 1, 3, 5);
        h1S.setVehicle(v1);
        v1.getPassengers().add(h1S);
        Vehicle v2 = eco.createVehicle(e, 2, 5, 70);
        Vehicle v3 = eco.createVehicle(e, 3, 8, 3);
        h2B.setVehicle(v2);
        v2.getPassengers().add(h2B);
        h3F.setVehicle(v3);
        v3.getPassengers().add(h3F);

        Dolphin d1 = eco.createDolphin(e);
        Shark s1 = eco.createShark(e);
        Dolphin d2 = eco.createDolphin(e);

        d1.feed();

        Coral c = eco.createCoral(e);

        Seaweed st1 = eco.createSeaweed(e);

        Starfish sf = eco.createStarfish(e);

        Fish f1 = eco.createFish(e);
        Fish f2 = eco.createFish(e);

        f1.setBreedingPartner(f2);
        Fish f3 = f1.breed();

        d2.setFood(f1);
        d2.feed();

        f3.swim();

        f2.setResidence(c);

        st1.photosynthesis();

        f2.setFood(st1);

        s1.foodTarget(f3);
        
        Starfish sf2 = sf.clone();
        sf2.feed();
    }
}
