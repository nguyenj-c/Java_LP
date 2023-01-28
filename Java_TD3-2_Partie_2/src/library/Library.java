package library;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    public static final int MAX_BOOKS = 100;

    private String name;
    private String address;

    private Book[] books;

    public Library(String name, String address, Book[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public void displayBooks() {
        System.out.println(books);
    }

    public void displayCommonBooks(Library other) {
        System.out.println(books.retainAll(other.getBooks()));
    }

    public void addBook(Book book) {
        if (books.size() < MAX_BOOKS)
            books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeDuplicates() {
        Set<Book> set = new LinkedHashSet<>(books);
        books.clear();
        books.addAll(set);
    }

    public void sortByAuthor() {
        this.books.sort(new AuthorBookComparator());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}
