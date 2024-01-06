package Day33;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Duck", 1);

        Animal dog = new Animal("Dog", 2);

        System.out.println(duck.name);
        System.out.println(duck.age);

        System.out.println(dog.name);
        System.out.println(dog.age);

    }
}
