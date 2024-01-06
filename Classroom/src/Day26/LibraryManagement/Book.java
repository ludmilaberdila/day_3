package Day26.LibraryManagement;

public class Book {

    String title;
    String author;
    int pages;
    int year;
    boolean isAvailable = true;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }


}
