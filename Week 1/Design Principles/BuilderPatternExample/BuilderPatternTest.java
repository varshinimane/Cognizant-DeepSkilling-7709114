public class BuilderPatternTest {

    public static void main(String[] args) {

        // Gaming Computer
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4090")
                .build();

        // Office Computer
        Computer officePC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .setGPU("Integrated Graphics")
                .build();

        System.out.println("Gaming PC Configuration:");
        gamingPC.display();

        System.out.println("Office PC Configuration:");
        officePC.display();
    }
}