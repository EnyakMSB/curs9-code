package ro.fasttrackit.curs9.homework.Exercise2;

import java.util.Date;

public abstract class Employee extends Person {
    public Date dateOfEmployment;
    public String position;

    public abstract void getSalary();
}
