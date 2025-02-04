package gr.aueb.cf.ch13.challenges.bankapp;

import gr.aueb.cf.ch13.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch13.exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.exceptions.SsnNotValidException;

/**
 * Defines a {@link JointAccount class}
 * that has two joint account holders.
 *
 * @author Stelios Fridakis
 * @version 0.1
 * @since 0.1
 */
public class JointAccount {
    private int id;
    private String iban;
    private String firstname1;
    private String lastname1;
    private String ssn1;
    private String firstname2;
    private String lastname2;
    private String ssn2;
    private double balance;

    public JointAccount() {

    }

    public JointAccount(int id, String iban, String firstname1, String lastname1, String ssn1, String firstname2, String lastname2, String ssn2, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname1 = firstname1;
        this.lastname1 = lastname1;
        this.ssn1 = ssn1;
        this.firstname2 = firstname2;
        this.lastname2 = lastname2;
        this.ssn2 = ssn2;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     * Public API
     */

    public void deposit (double amount) throws NegativeAmountException {
        try {
            if (amount <= 0) {
                throw new NegativeAmountException(amount);
            }

            balance += amount;
            System.out.println("Amount: " + amount + "Successful deposit.");

        } catch (NegativeAmountException e) {
            System.err.println("Error: Amount has to be greater than zero");
            throw e;
        }
    }

    public void withdraw (String ssn, double amount) throws SsnNotValidException, InsufficientBalanceException, NegativeAmountException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }

            if (amount <= 0) {
                throw new NegativeAmountException(amount);
            }

            balance += amount;
            System.out.println("Withdrawal successful: " + amount);

        } catch (SsnNotValidException | InsufficientBalanceException | NegativeAmountException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public double getAccountBalance() {
        System.out.println("Account balance returned.");
        return getBalance();
    }

    /**
     * Returns a string representation of the account state.
     *
     * @return the string-based format of the state of the account
     */
    public String accountToString() {
        return "ID: " + id + "\n" + "IBAN: " + iban + "\n" + "First Name (1): " + firstname1 + "\n" + "Last Name (1): " + lastname1 + "\n" + "SSN (1): " + ssn1 + "\n" + "First Name (2): " + firstname2 + "\n" + "Last Name (2): " + lastname2 + "\n" + "SSN (2): " + ssn2 + "\n" + "Account Balance: " + balance;
    }

    // Internals

    private boolean isSsnValid(String ssn) {
        return this.ssn1.equals(ssn) || this.ssn2.equals(ssn);
    }
}
