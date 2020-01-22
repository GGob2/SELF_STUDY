package book;

import java.util.ArrayList;

public class Book {
    private String bookname;
    private String author;
    private ArrayList booklist;

    public Book(ArrayList booklist) {
        this.booklist = booklist;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
