public class BankTest {
	public static final int N_ACCOUNTS = 5;
	public static final int INIT_BALANCE = 1000;


	public static void main(String args[]) {
		Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
		Transfer[] transfer = new Transfer[N_ACCOUNTS];
		Thread[] thread = new Thread[N_ACCOUNTS]; 
	
		// COMPLETE
		for(int i = 0; i < N_ACCOUNTS; i++){
			transfer[i] = new Transfer(bank, i, INIT_BALANCE);
		}

		for(int j = 0; j < N_ACCOUNTS; j++){
			thread[j] = new Thread(transfer[j]);
			thread[j].start();
		}
		
	}
}