public class Main {

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Alice", 1200),
                new Order(102, "Bob", 4500),
                new Order(103, "Charlie", 2500),
                new Order(104, "David", 1800)
        };

        Order[] orders2 = {
                new Order(101, "Alice", 1200),
                new Order(102, "Bob", 4500),
                new Order(103, "Charlie", 2500),
                new Order(104, "David", 1800)
        };

        System.out.println("Bubble Sort:");

        SortingOperations.bubbleSort(orders1);
        SortingOperations.display(orders1);

        System.out.println("\nQuick Sort:");

        SortingOperations.quickSort(orders2, 0, orders2.length - 1);
        SortingOperations.display(orders2);
    }
}