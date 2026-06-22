public class LibrarySearch {

    // Linear Search
    public static Book linearSearch(Book[] books, String target) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(target)) {
                return book;
            }
        }

        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String target) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison =
                    books[mid].title.compareToIgnoreCase(target);

            if (comparison == 0) {
                return books[mid];
            }

            else if (comparison < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }
}