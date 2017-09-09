package searching;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchDemo {

	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(11);
		ll.add(22);
		ll.add(13);
		ll.add(23);
		System.out.println("element 13 found:" + linearSearch(ll,13));
		
	}
	
	private static boolean linearSearch(List<Integer> ll, int x){
		
		for(Integer i:ll) {
			System.out.println("Checking :" + i);
			if(x == i)
				return true;
		}
		
		return false;
		
	}

}
