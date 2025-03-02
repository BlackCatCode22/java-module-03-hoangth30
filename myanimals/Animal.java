package myanimals;

public class Animal {
    // Static variable to count the number of Animal objects created
    protected static int numOfAnimals = 0;

    // Constructor increments the count and prints the current number of animals
    public Animal() {
        numOfAnimals++;
        System.out.println("Number of animals so far: " + numOfAnimals);
    }
}
