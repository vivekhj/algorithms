package searching;

public class ExponentialSearchDemo {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println("element found:" + exponentialSearch(arr,12));

	}

	private static boolean exponentialSearch(int[] arr, int x) {
		
		int n = arr.length;
		int step = 1;
		
		int prev = 0;
		while(arr[Math.min(step, n)-1]<x) {
			prev = step;
			step=getNewStep(step);
			if(prev>=n)
				return false;
		}
		
		//Linear search
		while(arr[prev]<x) {
			prev++;
			if(prev==Math.min(step, n)) {
				return false;
			}
		}
		
		if(arr[prev]==x) {
			return true;
		}
		
		return false;
	}
	
	private static int getNewStep(int oldStep) {
		// Find range for binary search by
        // repeated doubling
		return oldStep * 2;
	}

}
