package Real_Example_Java8;

@FunctionalInterface
public interface AccountFactory {

	public abstract BankAccount getBankAccount(int id, double balance, String accountName);

}
