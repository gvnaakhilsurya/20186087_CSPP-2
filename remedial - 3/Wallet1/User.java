class User{
	Wallet[]warray;
	String uname;
	int wsize;
	int newamount = 1000;

	public User(int num){
		this.warray = new Wallet[num];
		this.uname = uname;
	}
	Wallet wt = new Wallet();
	public void setUname(String name){
		this.uname = name;

	}
	public void addWallet(String wname){
		// for (int i = 0;i < warray.length;i++) {
		// 	if (warray[i]==null) {
		// 		warray[i] = new Wallet(wname);
		// 		wsize++;
		// 		break;
		// 	}
			
		// }
		wt.setName(wname);
		wt.setamount(newamount);

	}
	public void credit(String wname, long amount){
		if (amount < 0) {
			System.out.println("Negative amount");
		}else{
			long x = amount + wt.getamount();
			System.out.println((float)x);
		}

	}
	public void debit(String wname, long amount){
		if (amount < 0) {
			System.out.println("Negative amount");
		} else{
			if (amount > wt.getamount()) {
				System.out.println("Insufficient funds");
			}
		}

	}

	public void availBalance(){
		wt.getamount();
		System.out.println((float)wt.getamount());
		// for (int j = 0;j < warray.length;j++) {
		// 	if (warray[j].getName().equals(wname)) {
		// 		long y = warray[j].getamount();
		// 		System.out.println(y);
		// 	}
			
		// }
		

	}
	public void transfer(String dname,String cname ,long amount){
		if (amount < 0) {
			System.out.println("Negative amount");
		}else{
			for (int i = 0;i < warray.length;i++) {
				if (dname.equals(warray[i].getName())) {
					if (amount > warray[i].getamount()) {
						System.out.println("Insufficient funds");
						
					}
					
				}
				
			}
		}

	}
}