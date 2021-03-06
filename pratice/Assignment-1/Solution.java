import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    //your code goes here...
    //Good luck :-)
    
    private int[] set;
    private int size;

    public Set() {
    	this.set =new int[20];
    	this.size =0;
    }

    public Set(int x) {
    	this.set = new int[x];
    	this.size = 0;

    }

    public int size() {
    	return size;
    }
    private void resize() {
    	set = Arrays.copyOf(set, 2 * size);
    }


    public Boolean contains(int item) {
    	for(int i = 0; i < size; i++) {
    		if(item == (set[i])) {
    			return true;
    		}
    		
    	}
    	return false;
    }

    public void add(int item) {
    	if(size == set.length) {
    		resize();
    	}
    	if (contains(item) == false) {

    		set[size++] = item;
    }
    	}

    public String toString() {

    	if(size == 0) {
    		return "{}";
    	}
    	String str = "{";
    	for(int i = 0; i < size - 1; i++) {
    		str = str + set[i] + ", ";
    	}return str + set[size - 1] + "}";
    }

    public void add(int[] newArray) {

    	for (int i = 0; i < newArray.length; i++) {
    		add(newArray[i]);
    	}
    }

    public int get(int index) {
    	if (index >= 0 && index < size) {
    		return set[index];
    	}
    	return -1;
    }

    public Set intersection(Set newset) {
    	int[] newArray = newset.set;
    	Set s1 = new Set();
    	for (int i=0; i<size; i++) {
    		for (int j = 0; j<newset.size; j++) {
    			if (set[i] == newArray[j]) {
    				s1.add(newArray[j]);
    			}
    			
    		}
    			
    		}	
    		return s1;
    }
	 public Set retainAll(int[] newArray) {
	 	Set s1 = new Set();
    	for (int i=0; i<size; i++) {
    		for (int j = 0; j<newArray.length; j++) {
    			if (set[i] == newArray[j]) {
    				s1.add(newArray[j]);
    			}
    			
    		}
    			
    		}	
    		return s1;

	}
	public int[][] cartesianProduct(Set newset) {
		int[][] result = new int[size*newset.size()][2];
        int k = 0;
        if (size == 0 || newset.size() == 0) {
            return null;
        }
        for (int i=0; i<size; i++) {
            for (int j=0; j<newset.size(); j++) {
                result[k][0] = set[i];
                result[k][1] = newset.get(j);
                k++;
            }
        }
        return result;
	}
}

/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}



