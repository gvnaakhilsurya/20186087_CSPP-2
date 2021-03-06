import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dir = scan.nextLine();
		File folder = new File(dir);
		File[] files = folder.listFiles();
		if (files.length == 0) {
			System.out.println("empty directory");
			return;
		}
		for (File files1 : files) {
			// File dir = new File("")
			for (File files2 : files) {
				Distance map1 = new Distance(files1);
				// System.out.println(map1.getNumOfLines() + " lines  ");
				double sum1 = map1.ecludian();
				// E:/CSPP2/6019_CSPP2/cspp2-assignments/m23/HW-4 Document Distance/src/verne.txt
				// System.out.println(map1.getNumOfWords() + " words  ");
				// System.out.println(map1.getNumOfDistinctWords() + " distinct words");
				// System.out.println(map1.norm() + " Euclidean norm\n");
				// map1.file();
				HashMap<String, Integer> value1 = map1.name;
				// System.out.println(map1.name);
				List<Integer> values = new ArrayList<Integer>(map1.name.values());
				List<String> keys = new ArrayList<String>(map1.name.keySet());
				Distance map2 = new Distance(files2);
				// System.out.println(map2.getNumOfLines() + " lines  ");
				// System.out.println(map2.getNumOfWords() + " words  ");
				// System.out.println(values);
				double sum2 = map2.ecludian();
				HashMap<String, Integer> value2 = map2.name;
				// System.out.println(map2.getNumOfDistinctWords() + " distinct words");
				// System.out.println(map2.norm() + " Euclidean norm\n");
				List<Integer> values3 = new ArrayList<Integer>(map2.name.values());
				double sum = 0;
				// System.out.println(values3);
				int size = 0;
				for (String i :value1.keySet()) {
					if(value2.containsKey(i)){
						sum = sum+value1.get(i)*value2.get(i);
					}
					
				}
				double per = (sum / (Math.sqrt(sum1) * Math.sqrt(sum2)))*100;
				System.out.println(Math.round(per));
			}
		}


		/*                   EXPECTED OUTPUT
		1057 lines
		8943 words
		2154 distinct words
		886.5624625484659 Euclidean norm

		15996 lines
		182357 words
		8539 distinct words
		22206.41589721313 Euclidean norm

		1.7962605E7 inner product
		0.4217057138495239 angle
		*/

	}
}