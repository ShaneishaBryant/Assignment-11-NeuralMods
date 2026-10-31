import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClinicRegistry {

    //ArrayList to store the list of mods
    private static ArrayList<NeuralMod> registry = new ArrayList<>();

    //Registry Management Method
    public static void registerMod(NeuralMod mod){
        registry.add(mod);
    }

    //method for natural order (speed)
    public static void sortRegistry(){
        Collections.sort(registry);
    }

    //method to accept custom comparator - lambda
    public static void sortRegistry(Comparator<NeuralMod> comparator){
        registry.sort(comparator);
    }

    //Protected Encapsulation: returns an unmodifiable view of the list
    public static List<NeuralMod> getRegistry(){
        return Collections.unmodifiableList(registry);
    }

    //Print Registry
    public static void printRegistry(){
        System.out.println("====Neural Mods Registry====");
        for (NeuralMod mod : registry){
            System.out.println(mod);
        }
    }

}
