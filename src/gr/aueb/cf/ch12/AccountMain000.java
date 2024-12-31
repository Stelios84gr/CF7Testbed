package gr.aueb.cf.ch12;

public class AccountMain000 {

    public static void main(String[] args) {
        Account000 alice = new Account000(1, "GR12345", "Alice", "W.", "R123", 100);

        try {
            alice.deposit(900);
            System.out.println("Successful deposit");

            alice.withdraw(500, "R123");
            System.out.println("Successful withdrawal");

            System.out.println("Alice account balance: " + alice.getAccountBalance());
            System.out.println(alice.getAccountState());

            alice.withdraw(100, "T456");
            System.out.println("Successful withdrawal");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
