package Day30;

public class Item {
      int id;
      String name;
      double price;
      int quantity;

      public Item(String name, double price, int quantity) {
          this.name = name;
          this.price = price;
          this.quantity = quantity;
      }

      public void displayItem() {
          System.out.println("ID: " + id);
          System.out.println("Name: " + name);
          System.out.println("Price: " + price + "$");
          System.out.println("Quantity: " + quantity);
          System.out.println("------------------");
      }

      public void helloWorld() {
          System.out.println("Hello world");
      }

  }
