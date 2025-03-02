package myanimals;

public class Cat extends Animal {
    private final String name;

    // Constructor calls the super class (Animal) constructor and sets the name
    public Cat(String name) {
        super(); // Increment numOfAnimals and print the current count
        this.name = name;
    }

    // A simple method for the Cat to meow
    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
