import java.util.Random;

// COMPLETE
//
// "Transfer" threads select a random amount of money in [0, max_amount]
// and transfer it to a random account in the bank.
//

public class Transfer implements Runnable{
	Random random = new Random();
	public Transfer(Bank bank, int from, int max_amount) {
		bank_ = bank;
		from_ = from;
		max_ = max_amount;
	}

	// COMPLETE

	private Bank bank_;
	private int from_;
	private int max_;

	public void run(){
		while(true){
			int to_ = random.nextInt(BankTest.N_ACCOUNTS);
			int amount = random.nextInt(this.max_);
    		this.bank_.transfer(this.from_, to_, amount);
		  }
	}


}