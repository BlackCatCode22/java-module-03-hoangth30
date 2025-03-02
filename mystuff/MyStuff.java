package mystuff;

public class MyStuff {
    // Instance variables representing attributes of a Bicycle
    private String type;
    private String brand;
    private String color;
    private double price;

    // Constructor to initialize the Bicycle object
    public MyStuff(String type, String brand, String color, double price) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display the Bicycle information
    public void displayInfo() {
        System.out.println("Item Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}
