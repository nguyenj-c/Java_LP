package library;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private String editor;
    private int pageNumber;

    public Book(String author, String title, String editor, int pageNumber) {
        this.author = author;
        this.title = title;
        this.editor = editor;
        this.pageNumber = pageNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageNumber == book.pageNumber &&
                author.equals(book.author) &&
                title.equals(book.title) &&
                editor.equals(book.editor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, editor, pageNumber);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author: '" + author + '\'' +
                ", title: '" + title + '\'' +
                ", editor: '" + editor + '\'' +
                ", pageNumber: " + pageNumber +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
