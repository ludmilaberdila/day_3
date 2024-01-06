//package Day26.LibraryManagement;
//
//public class Student {
//    String name;
//    int age;
//    String gender;
//    Book currentlyReading;
//
//    public Student(String name, int age, String gender){
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public void startReading(Book book) {
//        if (book.isAvailable == false) {
//            System.out.println(name + " can't read" + book.title + " becouse is occupied");
//        } else if (currentlyReading == null) ;
//        currentlyReading = book;
//        currentlyReading.isAvailable = false;
//        System.out.println(name + "started reading" + currentlyReading.title);
//    }
//     else{
//     System.out.println(name + " first needs to finish" + currentlyReading.title);
//    }
//    public void stopReading(){
//        if(currentlyReading == null) {
//            System.out.println(name + "dasen't have a book");
//        }
//        else{
//            currentlyReading.isAvailable = true;
//            currentlyReading = null;
//        }
//
//    }
//}
