import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int c = 0;
		int num = Integer.parseInt(s.nextLine());
		User u = new User(num);
		u.setUname(name);
		for (int i = 0; i < num; i++) {
			u.addWallet(s.nextLine());
		}
		c = 0;
		int flag = 0;
		while (s.hasNext()) {
			String operation = s.nextLine();
			if (operation.equals("quit")) {
				System.out.println("Thank you");
				break;
			}
			switch (operation) {
				//Please complete the code for credit,debit,transfer and balance operations 
			case "credit":
				String line1 = s.nextLine();
				String[]tokens1 = line1.split(" ");
				u.credit(tokens1[0],Long.parseLong(tokens1[1]));
				break;
			case "transfer":
				String line3 = s.nextLine();
				String[]tokens3 = line3.split(" ");
				u.transfer(tokens3[0],tokens3[1],Long.parseLong(tokens3[2]));

				break;

			case "debit":
				String line2 = s.nextLine();
				String[]tokens2 = line2.split(" ");
				u.debit(tokens2[0],Long.parseLong(tokens2[1]));
				break;
			case "balance":
				String line4 = s.nextLine();
				u.availBalance();
				break;

			}
		}
	}
}
