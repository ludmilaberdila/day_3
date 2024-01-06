package Day30;

public class StoreMain {
    public static void main(String[] args) {
            Store fashionOutlet = new Store("Fashion Outlet",
                    "5220 Fashion Outlets Way", "Rosemont",
                    "IL", 60018);

            Item tShirt = new Item("NIKE T-SHIRT", 15, 50);
            Item pants = new Item("Pants",25, 40);
            Item cap = new Item("Cap", 20, 30);

            // access inventory ArrayList directly
//        fashionOutlet.inventory.add(tShirt);
            // access inventory ArrayList through method
            fashionOutlet.addItem(tShirt);

            fashionOutlet.addItem(pants);
            fashionOutlet.addItem(cap);

            System.out.println(fashionOutlet.inventory.size());
            fashionOutlet.displayItems();
        }
    }

/* create a store class and do following :
crate instance vatiable : String name, String addres, Stri
 */