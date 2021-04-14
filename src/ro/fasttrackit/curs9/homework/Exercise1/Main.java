package ro.fasttrackit.curs9.homework.Exercise1;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.infoProduct(1000, "TV", "Samsung", 5);
        Cosmetics cosmetics=new Cosmetics(12,"Paco Rabanne","1 Million",14);
        cosmetics.infoCosmetics("yellow", 44);
        Electronics electronics = new Electronics(699, "PC CASE", "Middle Tower", 3);
        electronics.infoElectronics("PC component", 50, 22, 42, 4);
        Fridge fridge = new Fridge(1999, "Bosch","KIR41AF30", 4);
        fridge.infoElectronics("A++",50,225,180,70);
        fridge.infoFridge(5);
    }
}
