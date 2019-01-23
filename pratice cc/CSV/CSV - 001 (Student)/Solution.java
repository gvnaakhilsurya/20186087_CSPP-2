import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Csvreader csvr = new Csvreader();
		String[]data = sc.nextLine().split("q");
		// System.out.println(data.length);
			for (int i = 0;i < data.length;i++) {
				String[]templist = data[i].split(",");
				// System.out.println(Arrays.toString(templist));
				csvr.additem(new Csvreader(templist));
			}
		// System.out.println(csvr.size());`
		int tcases = Integer.parseInt(sc.nextLine());
		// System.out.println(testcases);
		for (int j = 0;j < tcases;j++) {
			String line = sc.nextLine();
			String[]tokens = line.split(" ");
			switch(tokens[0]){

				case "rowCount":
				if (csvr.size()==0) {
					System.out.println(0);
				}else{
					System.out.println(csvr.size()-1);
				}
				break;
				case "fieldCount":
					String[] words = data[0].split(",");
					if (words.length == 1) {
						System.out.println(0);
					}else{
						System.out.println(words.length);
					}
				break;
				case "getFieldName":
					String[] names = data[0].split(",");
					// System.out.println(names.length);
					if (Integer.parseInt(tokens[1])>names.length-1) {
						System.out.println("Field Not Found Exception");
					}else{
					System.out.println(names[Integer.parseInt(tokens[1])]);
					}
				break;
				case "getRow":
						// System.out.println(Integer.parseInt(tokens[1]));
					csvr.getrow(Integer.parseInt(tokens[1]));
				break;
			}

			
		}

	}
}