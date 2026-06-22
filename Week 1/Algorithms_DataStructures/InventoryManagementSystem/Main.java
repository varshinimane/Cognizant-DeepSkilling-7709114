public class Main {
    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Mouse", 50, 800);

        manager.addProduct(p1);
        manager.addProduct(p2);

        System.out.println("\nInventory:");
        manager.displayProducts();

        manager.updateProduct(101, "Laptop", 15, 53000);

        System.out.println("\nAfter Update:");
        manager.displayProducts();

        manager.deleteProduct(102);

        System.out.println("\nAfter Deletion:");
        manager.displayProducts();
    }
}