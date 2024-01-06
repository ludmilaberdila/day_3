package Day30;
import java.util.ArrayList;

    public class Store {
    String name;
    String address;
    String city;
    String state;
    int postalCode;

    ArrayList<Item> inventory = new ArrayList<>();

    public Store(String n, String a, String c, String s, int p){
        this.name = n;
        this.address = a;
        this.city = c;
        this.state = s;
        this.postalCode = p;
    }

    public void addItem(Item item){
        item.id = inventory.size()+1;
        inventory.add(item);
        System.out.println(inventory.size());
        System.out.println("Store: "+name);
        System.out.println(item.name + " is added to the inventory!");
        System.out.println("Price: "+ item.price + "$, Quantity: " + item.quantity);
        System.out.println("-----------------------");
    }

    public void displayItems(){
        System.out.println(name + " ITEMS");
        for (Item i: inventory) {
            i.displayItem();
        }
    }
}
