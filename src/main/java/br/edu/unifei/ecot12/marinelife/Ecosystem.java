package br.edu.unifei.ecot12.marinelife;

import java.util.Scanner;

public class Ecosystem {
    private <T extends Organism> T createOrganism(Environment e, Class<T> clazz){
    Scanner s = new Scanner(System.in);

    try {
        T o = clazz.getDeclaredConstructor().newInstance();

        if(o instanceof Human)
            o.setSpecies("Homo Sapiens");
        else{
            System.out.println("SPECIES: ");
            o.setSpecies(s.nextLine());
        }

        System.out.println("AGE: ");
        o.setAge(s.nextFloat());

        System.out.println("GENDER (TRUE=MALE / FALSE=FAMALE): ");
        o.setGender(s.nextBoolean());

        e.getOrganisms().add(o);
        o.setEnvironment(e);

        return o;

    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }
}

    public Environment createEnvironment(int preSet){
        Environment e = new Environment();
        switch (preSet) {
            case 1:
                e.setDepth(100);
                e.setTemperature(30);
                e.setOxygenLevel(8.8);
                e.setWaterSalinity(9);
                break;
            case 2:
                e.setDepth(50);
                e.setTemperature(16);
                e.setOxygenLevel(6.5);
                e.setWaterSalinity(7);
                break;
            case 3: 
                e.setDepth(200);
                e.setTemperature(2.5f);
                e.setOxygenLevel(5.7);
                e.setWaterSalinity(4);
                break;
            default:
                break;
        }
        return e;
    }
    
    public Vehicle createVehicle(Environment e, int type, int capacity, int vehicleConfig){
        switch (type) {
            case 1:
                Boat v1 = new Boat();
                v1.setCapacity(capacity);
                v1.setPower(vehicleConfig);
                e.getVehicles().add(v1);
                return v1;
            case 2:
                Submarine v2 = new Submarine();
                v2.setCapacity(capacity);
                v2.setMaximumDepth(vehicleConfig);
                e.getVehicles().add(v2);
                return v2;
            case 3:
                Raft v3 = new Raft();
                v3.setCapacity(capacity);
                v3.setNumberOfOars(vehicleConfig);
                e.getVehicles().add(v3);
                return v3;
            default:
                return null;
        }
    }

    public Human createHuman(Environment e, int profession){
        System.out.println("*****CREATING A HUMAN******");
        Human h = createOrganism(e, Human.class);
        Scanner s = new Scanner(System.in);

        System.out.println("NAME: ");
        h.setName(s.nextLine());

        switch (profession) {
            case 1:
                Scientist scientist = new Scientist();
                scientist.setDescription("STUDY THE ENVIRONMENT");
                scientist.setSalary(1000);
                scientist.setStudy(e);
                scientist.setStudyTime(0);
                h.setProfession(scientist);
                break;
            case 2:
                Biologist biologist = new Biologist();
                biologist.setDescription("STUDY THE ORGANISMS");
                biologist.setSalary(1300);
                biologist.setStudyObjective("RESEARCHING FOR A NEW SPECIE");
                h.setProfession(biologist);
            case 3:
                Fisherman fisherman = new Fisherman();
                fisherman.setDescription("TO FISH");
                fisherman.setSalary(700);
                fisherman.setNumberOfFishCaught(0);
                h.setProfession(fisherman);
                break;
            default:
                break;
        }
        return h;
    }

    public int organismsList(Environment e){
        int human = 0, starFish = 0, fish = 0, shark = 0, dolphin = 0, coral = 0, seaweed = 0;
        for(Organism o : e.getOrganisms()){
            if(o instanceof Human) human++;
            if(o instanceof Starfish) starFish++;
            if(o instanceof Fish) fish++;
            if(o instanceof Shark) shark++;
            if(o instanceof Dolphin) dolphin++;
            if(o instanceof Coral) coral++;
            if(o instanceof Seaweed) seaweed++;
        }
        System.out.println("HUMAN: " + human + "\nSTARFISH: " + starFish + "\nFISH: " + fish + "\nSHARK: " + shark+
        "\nDOLPHIN: " + dolphin + "\nCORAL: " + coral + "\nSEAWEED: " + seaweed);
        return e.getOrganisms().size();
    }

    public Shark createShark(Environment e){
        System.out.println("*****CREATING A SHARK******");
        Scanner s = new Scanner(System.in);
        Shark shark = createOrganism(e, Shark.class);
        shark.setAmountOfMarineAnimalConsumed(0);
        System.out.println("TEETH QUANTITY(int): ");
        shark.setToothQuantity(s.nextInt());
        System.out.println("SENSE ACURACCY(float, EX: 4,5): ");
        shark.setSenseAccuracy(s.nextFloat());
        System.out.println("SHARK CREATED. SET THE OTHERS PARAMETERS");
        return shark;
    }

    public Starfish createStarfish(Environment e){
        System.out.println("*****CREATING A STARFISH******");
        Scanner s = new Scanner(System.in);
        Starfish st = createOrganism(e, Starfish.class);
        st.setAmountOfAlgaeConsumed(0);
        System.out.println("COLOR: ");
        st.setColor(s.nextLine());
        System.out.println("STARFISH CREATED. SET THE OTHERS PARAMETERS");
        return st;
    }

    public Dolphin createDolphin(Environment e){
        System.out.println("*****CREATING A DOLPHIN******");
        Scanner s = new Scanner(System.in);
        Dolphin d = createOrganism(e, Dolphin.class);
        d.setAmountOfMarineAnimalConsumed(0);
        System.out.println("INTELIGENCE LEVEL(int): ");
        d.setInteligenceLevel(s.nextInt());
        System.out.println("COMMUNICATION SKILLS(float): ");
        d.setCommunicationSkills(s.nextFloat());
        System.out.println("DOLPHIN CREATED. SET THE OTHERS PARAMETERS");
        return d;     
    }

    public Fish createFish(Environment e){
        System.out.println("*****CREATING A FISH******");
        Scanner s = new Scanner(System.in);
        Fish f = createOrganism(e, Fish.class);
        f.setAmountOfAlgaeConsumed(0);
        System.out.println("SWIMMING SPEED(float): ");
        f.setSwimmingSpeed(s.nextFloat());
        System.out.println("WEIGHT(float): ");
        f.setWeight(s.nextFloat());
        System.out.println("FISH CREATED. SET THE OTHERS PARAMETERS");
        return f;  
    }

    public Coral createCoral(Environment e){
        System.out.println("*****CREATING A CORAL******");
        Scanner s = new Scanner(System.in);
        Coral c = createOrganism(e, Coral.class);
        c.setQuantityOrganisms(0);
        System.out.println("COLOR(Sting): ");
        c.setColor(s.nextLine());
        System.out.println("MAX CAPACITY(int): ");
        c.setMaxCapacity(s.nextInt());
        System.out.println("HEALTH STATUS(String): ");
        System.out.println("CORAL CREATED. SET THE OTHERS PARAMETERS");
        return c;  
    }

    public Seaweed createSeaweed(Environment e){
        System.out.println("*****CREATING A Seaweed******");
        Scanner s = new Scanner(System.in);
        Seaweed sea = createOrganism(e, Seaweed.class);
        System.out.println("TOXICITY(true/false): ");
        sea.setToxicity(s.nextBoolean());
        System.out.println("TYPE(String): ");
        sea.setType(s.nextLine());
        System.out.println("SEAWEED CREATED. SET THE OTHERS PARAMETERS");
        return sea;  
    }
}
