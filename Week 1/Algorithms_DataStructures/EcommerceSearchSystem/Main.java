public class Main {

    public static void main(String[] args) {

        // Sorted array by productId
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Headphones", "Accessories"),
                new Product(105, "Speaker", "Accessories")
        };

        int searchId = 104;

        // Linear Search
        Product result1 = SearchOperations.linearSearch(products, searchId);

        if (result1 != null)
            System.out.println("Linear Search Found:");
        else
            System.out.println("Product Not Found");

        System.out.println(result1);

        // Binary Search
        Product result2 = SearchOperations.binarySearch(products, searchId);

        if (result2 != null)
            System.out.println("\nBinary Search Found:");
        else
            System.out.println("Product Not Found");

        System.out.println(result2);
    }
}