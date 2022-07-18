package BT;

public class Product {
    private String name;
    private int ID;
    private double price;
    private static int idIncrease = 0;

    public Product() {
    }
    public Product(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Product(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        increaseID();
    }
    public static void increaseID(){
        idIncrease++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", price=" + price +
                '}';
    }
}
