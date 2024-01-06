package LibraryOOP;

public class LibraryItem {
    String title;
    int id;
//    int item;
    static int numberOfItems;


    public LibraryItem(String title){
        numberOfItems++;
        this.title = title;
        id = numberOfItems;
    }
}
