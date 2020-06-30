import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = new int[] {
				3,33,2,67,23,25,1,999
		};
		
		for(int j = 0; j < arr.length; ++j) {
			boolean isSorted = true;
			for(int i = 0; i<arr.length - 1 - j; ++i) {
				if(arr[i] > arr[i + 1]) {
					int c = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = c;
					isSorted = false;
				}
			}
			if(isSorted) break;
		}
		
		
		
		int element = new Scanner(System.in).nextInt();
		
		
		while(element != -1) {
			int index = search(arr,element);
			
			System.out.println(index);
			element = new Scanner(System.in).nextInt();
		}
		
		
	
		for(int i=0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int search(int[] arr,int element) {
		int start  = 0;
		int end = arr.length - 1;
				
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == element) {
				return mid;
			} else if(arr[mid] > element) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	

}
