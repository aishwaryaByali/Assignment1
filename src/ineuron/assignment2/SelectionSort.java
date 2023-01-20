package ineuron.assignment2;

import java.util.Arrays;

public class SelectionSort {
	void selectionSort(int array[]) {
	    int size = array.length;

	    for (int k = 0; k < size - 1; k++) {
	      int min = k;

	      for (int i = k + 1; i < size; i++) {
	        if (array[i] < array[min]) {
	          min = i;
	        }
	      }
	      int temp = array[k];
	      array[k] = array[min];
	      array[min] = temp;
	    }
	}
	public static void main(String[] args) {
		int[] data = { 20, -12, 10, 15, 2 };
	    SelectionSort ss = new SelectionSort();
	    ss.selectionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	}

}
