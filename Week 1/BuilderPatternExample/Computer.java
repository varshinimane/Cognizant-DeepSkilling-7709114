public class Computer {

    // Attributes
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
    }

    // Display method
    public void display() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("GPU: " + gpu);
        System.out.println();
    }

    // Static nested Builder class
    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private String gpu;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        // Build method
        public Computer build() {
            return new Computer(this);
        }
    }
}