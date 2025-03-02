package myanimals;

public class Dog extends Animal {
    private final String name;

    // Constructor calls the super class (Animal) constructor and sets the name
    public Dog(String name) {
        super(); // Increment numOfAnimals and print the current count
        this.name = name;
    }

    // A simple method for the Dog to bark
    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}
