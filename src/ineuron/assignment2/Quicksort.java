package ineuron.assignment2;

import java.util.Arrays;

public class Quicksort {
	
	public static void main(String[] args) {
		int[] array = {9, 5, 2, 1, 4, 5, 8, 0};
		int len = array.length-1;
		quickSort(array, 0, len);
		System.out.println("quick Sort : " + Arrays.toString(array));
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(arr.length ==0) {
			return;
		}
		if(low >= high) {
			return;
		}
		
		int mid = (low + high)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		while(i<=j) {
			while(arr[i]<pivot) i++;
			while(arr[j]>pivot) j--;
			
			if(i <=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		if(low < j) {
			quickSort(arr, low, j);
		}
		if(high > i) {
			quickSort(arr, i, high);
		}
	}
}
