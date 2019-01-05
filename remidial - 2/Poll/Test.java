import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<Integer,Integer> h = new Hashtable<Integer,Integer>();

		h.put( 0,1 );
		h.put( 1,5 );
		h.put( 2,3 );
		h.put( 3,5 );
		h.put( 4,2 );
		h.put( 5,1 );
		int max = Collections.max(h.values());
		System.out.println(max);
		Collection<Double> values = hashTable.values();
          Double maxValue = Collections.max(values);
          Enumeration<Object> keys = hashTable.keys();
          while(keys.hasMoreElements()){
              Object key = keys.nextElement();
              if((hashTable.get(key)).equals(maxValue))
                  System.out.println(key);
          }


	}
}