public class Main {
    public static void main(String[] args) {

        ClinicRegistry.registerMod(new NeuralMod("Apex-1", 4.2, 85));
        ClinicRegistry.registerMod(new NeuralMod("Zenith-X", 5.8, 70));
        ClinicRegistry.registerMod(new NeuralMod("Nova-Core",4.2, 92 ));
        ClinicRegistry.registerMod(new NeuralMod("Soma-Link", 3.1, 98));
        ClinicRegistry.registerMod(new NeuralMod("Pulse-7", 5.8, 60));
        ClinicRegistry.registerMod(new NeuralMod("Alpha-Mod", 4.2,85));
        ClinicRegistry.registerMod(new NeuralMod("CoCo-P", 5.8,70));
        ClinicRegistry.registerMod(new NeuralMod("Fox-Trot",3.1,67));

        //sort registry automatically by speed
        ClinicRegistry.sortRegistry();

        //sort using lambda expression by compatibility (highest to lowest)
        //NeuralMod.sortRegistry((m1, m2) -> Integer.compare(m2.getCompatibility(), m1.getCompatibility()));

        ClinicRegistry.printRegistry();


    }
}
