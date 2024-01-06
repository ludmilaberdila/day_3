//package LibraryOOP;
//
//import java.util.ArrayList;
//
//public class Library {
//    ArrayList<LibraryItem> libraryItems = new ArrayList<>();
//
//    public void addItem(LibraryItem item){
//       //item.id = libraryItems.size()+1;
//        libraryItems.add(item);
//        System.out.println(item.title + " was added");
//    }
//    public void displayItems(){
//        System.out.println("items in the library");
//        for(LibraryItem item : libraryItems);
//        System.out.println("Title" + item.title);
//        System.out.println("ID" + item);
//        if(item instanceof Book){
//            System.out.println("Autor" + ((Book)item).author);
//        }
//        else{
//            System.out.println("Director" + ((DVD)item).director);
//        }
//        System.out.println("----------------------");
//    }
//    public void updateItem(int id, String title){
//        boolean found = false;
//        for(int i = 0; i < libraryItems.size(); i++){
//            if(libraryItems.get(i).id == id){
//                libraryItems.remove(i);
//                found = true;
//            }
//        }
//        if(found){
//            System.out.println("updated items with" + "id");
//        }
//        else {
//
//            System.out.println("failed to update" + "id");
//        }
//    }
//        public  void removeItem(int id){
//        for()
//        }

