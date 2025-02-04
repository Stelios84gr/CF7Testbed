package gr.aueb.cf.ch13.challenges.bankapp;

public class Main {

    public static void main(String[] args) {
        OverdraftAccount overdraftAccount = new OverdraftAccount(123, "GR 111 222 333 5000", "Stelios", "Fridakis", "1234567890", 4500);

        JointAccount jointAccount = new JointAccount(123, "GR 111 222 333 5000", "Stelios", "Fridakis", "1234567890", "John", "Wayne", "0123456789", 7800);

        try {
            overdraftAccount.deposit(400);
            System.out.println("Deposit Successful");

            overdraftAccount.deposit(-120);

            overdraftAccount.withdraw(300, "1234567890");
            System.out.println("Withdrawal Successful");

            overdraftAccount.withdraw(4600, "1234567890");
            System.out.println("Withdrawal Successful");

            overdraftAccount.withdraw(300, "1122334455");

            overdraftAccount.withdraw(4600, "1122334455");

            System.out.println("Account Balance: " + overdraftAccount.getAccountBalance());

            System.out.println(overdraftAccount.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            jointAccount.deposit(300);
            System.out.println("Deposit Successful");

            jointAccount.deposit(-200);

            jointAccount.withdraw("1234567890", 200);
            System.out.println("Withdrawal Successful");

            jointAccount.withdraw("0123456789", 150);
            System.out.println("Withdrawal Successful");

            jointAccount.withdraw("1234567891", 200);

            jointAccount.withdraw("1234567890", -120);

            jointAccount.withdraw("0123456789", -120);

            jointAccount.withdraw("1122334455", -150);

            jointAccount.withdraw("1122334455", 180);

            System.out.println("Account Balance: " + jointAccount.getAccountBalance());

            System.out.println(jointAccount.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
