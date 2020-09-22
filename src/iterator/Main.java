package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("One"));
        bookShelf.appendBook(new Book("Two"));
        bookShelf.appendBook(new Book("Three"));
        bookShelf.appendBook(new Book("Four"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();

            System.out.println(book);
        }
    }
}
