package ro.fasttrackit.curs9.inheritance;

public class OverridingMain {
    public static void main(String[] args) {

        Parent parentChild = new OverridingChild();
        OverridingChild overridingChild = new OverridingChild();

        System.out.println("--- parent parentChild");
        parentChild.publicMethod();
        parentChild.protectedMethod();
        parentChild.defaultMetod();

        System.out.println();

        System.out.println("--- OverridingChild overridingChild");

        overridingChild.publicMethod();
        overridingChild.protectedMethod();
        overridingChild.defaultMetod();

    }

}
