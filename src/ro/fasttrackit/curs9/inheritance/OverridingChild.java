package ro.fasttrackit.curs9.inheritance;

import ro.fasttrackit.curs9.inheritance.Parent;

public class OverridingChild extends Parent {
    public OverridingChild() {
        super("overriding");
    }

    @Override
    public void publicMethod() {
        System.out.println("My new implememntation of child");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Child implementation");
        super.protectedMethod();
    }

}
