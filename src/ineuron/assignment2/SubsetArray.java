package ineuron.assignment2;

public class SubsetArray {
	static boolean subset (int[] arr1, int[] arr2, int len1, int len2) {
		for(int i=0; i<len2; i++) {
			for(int j=0; j<len1; j++) {
				if(arr2[i] == arr1[j])
					break;
				if(j==len2)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr1 = {2,4,1,3,7,2,3,4};
		int[] arr2 = {4,1,9};
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		if(subset(arr1, arr2, len1, len2)) {
			System.out.println("the given array is subset of arr1");
		} else {
			System.out.println("the given array is not a subset");
		}

	}

}

