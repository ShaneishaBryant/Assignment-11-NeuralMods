import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NeuralMod implements Comparable<NeuralMod>{
    private String name;
    private double speed;
    private int compatibility;


    //constructor with validation checks to ensure data integrity
    public NeuralMod(String name, double speed, int compatibility){
        if(speed < 0){
            throw new IllegalArgumentException("Speed cannot be negative.");
        }
        if (compatibility < 0 || compatibility > 100){
            throw new IllegalArgumentException("Compatibility rating must be between 0 and 100%");
        }
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
