package ineuron.assignment2;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9, 5, 2, 1, 4, 5, 8, 0, -2, -1};
		bubbleSort(arr);
		System.out.println("Bubble Sort " + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int len = arr.length;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
