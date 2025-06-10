import java.util.*;

class Book implements Comparable<Book> {
    public String title;
    public int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }


    @Override
    public int compareTo(Book y) {
        return Integer.compare(this.year, y.year);
    }

}

public class Task_2 {

    static void printList(LinkedList<Book> books) {
        for (Book book : books) {
            System.out.println(book.title + "\t Year:" + book.year);
        }
    }

    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book("Metro 2033", 2007));
        books.add(new Book("S.T.A.L.K.E.R", 1972));
        books.add(new Book("1984", 1949));
        books.add(new Book("Harry Potter and the Philosopher's Stone", 1997));
        books.add(new Book("Harry Potter and the Prisoner of Azkaban", 1999));

        System.out.println("Books before sorting:");

        printList(books);

        Collections.sort(books);

        System.out.println("Books after sorting:");

        printList(books);

    }
}