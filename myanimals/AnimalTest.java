package myanimals;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers");
        Dog dog1 = new Dog("Buddy");
        Cat cat2 = new Cat("Luna");

        cat1.meow();
        dog1.bark();
        cat2.meow();
    }
}