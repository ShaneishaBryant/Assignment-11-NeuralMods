public class Main {
    public static void main(String[] args) {

        NeuralMod.registry(new NeuralMod("Apex-1", 4.2, 85));
        NeuralMod.registry(new NeuralMod("Zenith-X", 5.8, 70));
        NeuralMod.registry(new NeuralMod("Nova-Core",4.2, 92 ));
        NeuralMod.registry(new NeuralMod("Soma-Link", 3.1, 98));
        NeuralMod.registry(new NeuralMod("Pulse-7", 5.8, 60));
        NeuralMod.registry(new NeuralMod("Alpha-Mod", 4.2,85));
        NeuralMod.registry(new NeuralMod("CoCo-P", 5.8,70));

        //sort registry automatically by speed
        NeuralMod.sortRegistry();

        //sort using lambda expression by compatibility (highest to lowest)
        //NeuralMod.sortRegistry((m1, m2) -> Integer.compare(m2.getCompatibility(), m1.getCompatibility()));

        NeuralMod.printRegistry();


    }
}
