public class Main {

    public static void main(String[] args) {

        // Array sorted alphabetically by title
        Book[] books = {
                new Book(101, "Computer Networks", "Andrew"),
                new Book(102, "DBMS", "Korth"),
                new Book(103, "Java Programming", "Herbert Schildt"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Python Basics", "Guido")
        };

        String title = "Java Programming";

        // Linear Search
        Book result1 =
                LibrarySearch.linearSearch(books, title);

        if (result1 != null) {
            System.out.println("Linear Search Found:");
            System.out.println(result1);
        } else {
            System.out.println("Book not found.");
        }

        // Binary Search
        Book result2 =
                LibrarySearch.binarySearch(books, title);

        if (result2 != null) {
            System.out.println("\nBinary Search Found:");
            System.out.println(result2);
        } else {
            System.out.println("Book not found.");
        }
    }
}