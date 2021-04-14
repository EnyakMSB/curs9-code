package ro.fasttrackit.curs9.ro.fasttrackit.curs9.polymorphism;

public class CompanyTransport {
    private Car companyCar;
    private int clientCount;

    public void goToClient(){
        System.out.println("starting my clent meeting");

        companyCar.drive(50,3);

        System.out.println("arrived at my client meeting");
        clientCount++;
        System.out.println("Cient done!" + clientCount);
    }
}
