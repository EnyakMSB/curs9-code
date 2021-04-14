package ro.fasttrackit.curs9.homework.Exercise1;

public class Product {
    public double price;
    public String name;
    public String description;
    public int quantity;


    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public Product() {

    }

    protected void infoProduct(double price, String name, String description, int quantity){
        System.out.println("Product info: " + name + " price : " + price + " quantity : " + quantity + " description : " +
                "" + description );
    }
}