package ro.fasttrackit.curs9.homework.Exercise2;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person ();
        System.out.println (person.fullName ("Mircea", "Radu"));
        person.calculateAge (1968, 11, 15);
    }
}
