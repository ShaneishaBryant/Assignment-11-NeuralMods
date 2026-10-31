import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        // Primary Sort: processing speed (lowest to highest)
        int speedComparison = Double.compare(this.speed, otherMod.speed);
        if (speedComparison != 0){
            return speedComparison;
        }

        //Second Sort Category: compatibility rating (highest to lowest)
        int compatibilityComparison = Integer.compare(otherMod.compatibility, this.compatibility);
        if (compatibilityComparison != 0) {
            return compatibilityComparison;
        }

        //Third Sort Category: alphabetical by name
        return this.name.compareTo(otherMod.name);
    }







    //method for natural order (speed)
    public static void sortRegistry(){
        Collections.sort(registry);
    }

    //method to accept custom comparator - lambda
    public static void sortRegistry(Comparator<NeuralMod> comparator){
        registry.sort(comparator);
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

    public void setName(String name){this.name = name;}
    public void setSpeed(double speed){this.speed = speed;}
    public void setCompatibility(int compatibility){this.compatibility = compatibility;}

    //toString() method
    @Override
    public String toString(){
        return "Name = " + name + ", Speed = " + speed + " GHz, Compatibility = " + compatibility + "%";
    }
}
