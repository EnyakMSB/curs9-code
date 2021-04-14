package ro.fasttrackit.curs9.inheritance;

public class Parent {
    //constanta in JAVA
    private static final String CONST = "test";
    public String publicString;
    protected int protectedInt;
    int defaultInt;
    private String privateString;

    public Parent(String name) {
        this.publicString = name;
    }

    public void publicMethod() {
        System.out.println("Parent public metod");
    }

    protected void protectedMethod() {
        System.out.println("Parent protected method");
    }

    void defaultMetod() {
        System.out.println("Parent protected method");
    }

    private void privatedMetod() {
        System.out.println("Parent protected method");
    }

    public final void finalMethod() {
        System.out.println("final method");
    }
}
