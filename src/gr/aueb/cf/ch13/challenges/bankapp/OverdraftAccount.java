package gr.aueb.cf.ch13.challenges.bankapp;

import gr.aueb.cf.ch13.exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.exceptions.SsnNotValidException;

/**
 * Defines an {@link OverdraftAccount class} that
 * allows withdrawals that exceed the current account
 * balance to be made.
 *
 * @author Stelios Fridakis
 * @version 0.1
 * @since 0.1
 */
public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;


    public OverdraftAccount() {

    }

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    /**
     * Deposits a certain amount of money.
     * @param amount                    the amount of money to be deposited
     * @throws NegativeAmountException  if the amount of money to be deposited is negative or zero
     */
    public void deposit (double amount) throws NegativeAmountException {
        try {
            if (amount <= 0) {
                throw new NegativeAmountException(amount);
            }

            balance += amount;
            System.out.printf("Withdrawal successful: " + amount);

        } catch (NegativeAmountException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }

    }

    /**
     *
     * @param amount                    the amount of money to be withdrawn; case of amount being larger than
     *                                  current account balance is ignored
     * @param Ssn                       the given ssn
     * @throws SsnNotValidException     if the ssn inserted is not correct
     * @throws NegativeAmountException  if the amount of money to be withdrawn is negative or zero
     */
    public void withdraw (double amount, String Ssn) throws SsnNotValidException, NegativeAmountException {
        try {
            if (!isSsnValid(Ssn)) {
                throw new SsnNotValidException(Ssn);
            }

            if (amount <= 0) {
                throw new NegativeAmountException(amount);
            }
        } catch (SsnNotValidException | NegativeAmountException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link OverdraftAccount}
     *
     * @return the account's balance
     */
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
        return "ID: " + id + "\n" + "IBAN: " + iban + "\n" + "First Name: " + firstname + "\n" + "Last Name: " + lastname + "\n" + "SSN: " + ssn + "\n" + "Account Balance: " + balance;
    }



    // Internals

    private boolean isSsnValid (String Ssn) {
        return this.ssn.equals(Ssn);
    }
}
