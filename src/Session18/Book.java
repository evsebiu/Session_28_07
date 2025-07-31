package Session18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer numPages;
    private String isbn;

    public Book(String title, String author, Integer numPages, String isbn) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title)
                && Objects.equals(author, book.author) && Objects.equals(numPages, book.numPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, numPages);

    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numPages=" + numPages +
                ", isbn='" + isbn + '\'' +
                ']';
    }
}

class Box <T>{
    private T item;

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item=item;
    }
}

class pair<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }
    public void setKey(){
        this.key=key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(){
        this.value=value;
    }

    public pair(K key, V value){
        this.key=key;
        this.value=value;

    }
}



class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Clean code", "Robert C. Marti", 464, "123456");
        Book b2 = new Book("Clean code", "Rovert C. Marti", 464, "123456");
        Book b3 = new Book("Effective Java", "Jeshue Bloch", 422, "987654");

        System.out.println("b1 equals b2? : " + b1.equals(b2));
        System.out.println("b1 equals b3? : " + b1.equals(b3));

        System.out.println("hashcode b1: " + b1.hashCode());
        System.out.println("hascode b2: " + b2.hashCode());
        System.out.println("hashcode b3: " + b3.hashCode());

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        Book b4 = new Book("A", "B", 12, "128921");
        Book b5 = new Book("B", "C", 21, "3927832");

        Box<Book> bookBox = new Box<>();
        bookBox.setItem(b1);
        System.out.println("\nBox with book: " + bookBox.getItem());


        System.out.println();
        pair<String, Integer> bookScore = new pair<>("Clean code", 9);
        System.out.println("Book score: " + bookScore.getValue() + bookScore.getKey());


        Book b6 = new Book("Apocalipsa", "S.K", 1000, "@1212121");
        pair<String, Book> favoriteBook = new pair<>("Apocalipsa", b6);
        System.out.println("My favorite book: " + favoriteBook);

        Map<Book, Integer> inventory = new HashMap<>();
        inventory.put(b1, 10);
        inventory.put(b3, 4);
        inventory.put(b2, 15);
        System.out.println("------------------------");
        System.out.println(inventory);

        System.out.println("\n");
        for (Map.Entry<Book, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " cu hashcode " + entry.getKey().hashCode() + " are vasta " + entry.getValue());

        }
    }
}
