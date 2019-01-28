public class User {
	String name;
	Wallet[] wallet;
	int size;
	int newamount = 1000;
	public User(int num) {
		this.name = name;
		wallet = new Wallet[num];
		size = 0;
	}
	public void setName(String name){
		this.name = name;
	}
	public void addWallet(Wallet obj) {
		for (int i = 0; i < wallet.length; i++) {
			if (wallet[i] == null) {
				wallet[i] = obj;
				wallet[i].setAmount(newamount);
				size++;
				break;
			}
		}
	}
	public void credit(String name, int amount) {
		int x = 0;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				if (amount < 0) {
					System.out.println("Negative amount");
				}
				// System.out.println(wallet[i].getAmount());
				x = wallet[i].getAmount() + amount;
				wallet[i].setAmount(x);
				break;
			}
		}
	}
	public void debit(String name, int amount) {
		boolean flag = true;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				if (wallet[i].getAmount() < amount) {
					System.out.println("Insufficient funds");
					break;
				}
				if (amount < 0) {
					System.out.println("Negative amount");
					break;
				}

			}
		}
		if(flag != true){
			int x = 0;
			for (int i = 0; i < size; i++) {
				if (wallet[i].getName().equals(name)) {
					x = wallet[i].getAmount() - amount;
					wallet[i].setAmount(x);
					break;
				}
			}

		}
	}
	public void balance(String name) {
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(name)) {
				System.out.println((float)wallet[i].getAmount());
				break;
			}
		}
	}
	public void transfer(String user1, String user2, int amount) {
		int x = 0;
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(user1)) {
				if (wallet[i].getAmount() < amount) {
					System.out.println("Insufficient funds");
				}
				if (wallet[i].getAmount() < 0) {
					System.out.println("Negative amount");
				}
				x = wallet[i].getAmount() - amount;
				wallet[i].setAmount(x);
				break;
			}
		}
		for (int i = 0; i < size; i++) {
			if (wallet[i].getName().equals(user2)) {
				x = wallet[i].getAmount() + amount;
				wallet[i].setAmount(x);
				break;
			}
		}

	}
}