package ro.fasttrackit.curs9.inheritance;

import ro.fasttrackit.curs9.inheritance.other.OtherPackageChild;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent("parent-instance");
        Parent parentChild = new SamePackageChild();
        SamePackageChild samePackageChild = new SamePackageChild();
        Parent otherParentChild = new OtherPackageChild("pc1");
        OtherPackageChild otherPackageChild = new OtherPackageChild("pc2");

        parent.publicMethod();
        parent.protectedMethod();
        parent.defaultMetod();
        //parent.privateMethod();

        parentChild.publicMethod();
        parentChild.protectedMethod();
        parentChild.defaultMetod();
        //parentChild.privateMethod();
        //parentChild.childMethod();

        otherParentChild.publicMethod();
        otherParentChild.protectedMethod();
        otherParentChild.defaultMetod();
        //otherParentChild.privateMethod();
        //otherParentChild.otherChildMethod();

        otherPackageChild.publicMethod();
        otherPackageChild.protectedMethod();
        //otherPackageChild.defaultMethod();
        //otherPackageChild.privateMethod();
        otherPackageChild.othherChildMethod();

    }
}
