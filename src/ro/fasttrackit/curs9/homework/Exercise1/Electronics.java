package ro.fasttrackit.curs9.homework.Exercise1;

public class Electronics extends Product {
    public String type;
    public int length;
    public int width;
    public int height;
    public int weight;

    protected Electronics(double price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    @Override
    protected void infoProduct(double price, String name, String description, int quantity) {
        super.infoProduct(price, name, description, quantity);
    }

    protected String infoElectronics(String type, int length, int width, int height, int weight){
        infoProduct(price, name, description, quantity);
        System.out.println("Electronics info - type : " + type + " length :" + length + " width : "+ width + " height "
                + height + " weight " + weight);
        return "";
    }
}
