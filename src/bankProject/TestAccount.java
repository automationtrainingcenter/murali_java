package bankProject;

public class TestAccount {
public static void main(String[] args) {
	Account account = new SavingsAccount(987123, "surya", 987654320l, 1100, 20000);
	System.out.println(account);
}
}
