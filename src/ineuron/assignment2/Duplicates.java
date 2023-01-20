package ineuron.assignment2;

public class Duplicates {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		int len = arr.length;
		System.out.println("Duplicates present in an array");
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate element is: " + arr[i]);
				}
			}
		}
	}

}
