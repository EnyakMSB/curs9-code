package ro.fasttrackit.curs9.homework.Exercise1;

public class Cosmetics extends Product {
    private String color;
    private int weight;

    protected Cosmetics(double price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }
    protected void infoCosmetics(String color, int weight){
        infoProduct(price, name, description, quantity);
        System.out.println("Cosmetics info - color is: " + color + ", weight : " + weight );
    }
}
