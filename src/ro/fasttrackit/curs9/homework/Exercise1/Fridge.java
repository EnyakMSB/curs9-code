package ro.fasttrackit.curs9.homework.Exercise1;

public class Fridge extends Electronics{
    public int temperature;

    protected Fridge(double price, String name, String description, int quantity) {
        super(price, name, description, quantity);
    }

    @Override
    protected void infoProduct(double price, String name, String description, int quantity) {
        super.infoProduct(price, name, description, quantity);
    }

    @Override
    protected String infoElectronics(String type, int length, int width, int height, int weight) {
        return super.infoElectronics(type, length, width, height, weight);
    }

    void infoFridge(int temperature){
        System.out.println("Fridge's temperature is: " + temperature);
    }
}
