public class Wallet {
	String name;
	int amount;
	Wallet() {
	}
	Wallet(String name) {
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return this.name;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(int newamount) {
		this.amount = newamount;
	}
	public String toString() {
		return this.name+" "+this.amount;
	}
}