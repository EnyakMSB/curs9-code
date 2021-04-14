package ro.fasttrackit.curs9.homework.Exercise2;

import java.time.LocalDate;
import java.util.Date;

public interface PersonInfo {

    String fullName(String firstName, String lastName);

    public void calculateAge(int year,int month,int day);
}
