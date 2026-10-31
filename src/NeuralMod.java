import java.util.ArrayList;
import java.util.Collections;

public class NeuralMod implements Comparable<NeuralMod>{
    private String name;
    private double speed;
    private int compatibility;

    //ArrayList to store the list of mods
    private static ArrayList<NeuralMod> registry = new ArrayList<>();


    //constructor
    public NeuralMod(String name, double speed, int compatibility){
        this.name = name;
        this.speed = speed;
        this.compatibility = compatibility;
    }



    //Implement Comparable Interface
    @Override
    public int compareTo(NeuralMod otherMod){
        return Double.compare(this.speed, otherMod.speed);
    }

    public static void sortRegistry(){
        Collections.sort(registry);
    }



    //Registry Management Method
    public static void registry(NeuralMod mod){
        registry.add(mod);
    }

    public static ArrayList<NeuralMod> getRegistry(){
        return registry;
    }

    public static void printRegistry(){
        System.out.println("====Neural Mods Registry====");
        for (NeuralMod mod : registry){
            System.out.println(mod);
        }
    }

    //getter and setters
    public String getName(){return name;}
    public double getSpeed(){return speed;}
    public int getCompatibility(){return compatibility;}

    public void setName(){this.name = name;}
    public void setSpeed(){this.speed = speed;}
    public void setCompatibility(){this.compatibility = compatibility;}

    //toString() method
    @Override
    public String toString(){
        return "Name = " + name + ", Speed = " + speed + " GHz, Compatibility = " + compatibility + "%";
    }
}
