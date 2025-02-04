package gr.aueb.cf.test;

public class test {

    public static void main(String[] args) {

        int id = 12347;
        String iban = "GR 00 111 222 333 5000";
        String firstname1 = "Stelios";
        String lastname1 = "Fridakis";
        String ssn1 = "1234567890";
        String firstname2 = "John";
        String lastname2 = "Wayne";
        String ssn2 = "0123456789";
        double balance = 4500.00;

        System.out.println("Id: " + id + "\n" + "IBAN: " + iban + "\n" + "First Name (1): " + firstname1 + "\n" + "Last Name (1): " + lastname1 + "\n" + "SSN (1): " + ssn1 + "\n" + "First Name (2): " + firstname2 + "\n" + "Last Name (2): " + lastname2 + "\n" + "SSN (2): " + ssn2 + "\n" + "Account Balance: " + balance);
    }
}