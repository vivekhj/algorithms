package searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6};
		System.out.println("element 7 found:" + binarySearch(arr,6));
	}

	private static boolean binarySearch(int[] ll, int x) {
		
		int low,mid,high;
		boolean isFound = false;
		low=0;
		high=ll.length-1;
		while(!isFound) {
			mid=low +(high-low)/2;
			if(low>high)
			{
				isFound = false;
				break;
			}
			System.out.println("checking for " + ll[mid]);
			if(ll[mid]==x) {
				isFound=true;
			}
			else if(ll[mid]>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		
		return isFound;
	}

}
