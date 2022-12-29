package ineuron.assignment;

public class PatternPgm5 {

	public static void main(String[] args) {
		int n=10;
		System.out.println("question 5");
		for(int i=0; i<n/2; i++) {
			System.out.print("*");
		}
		for(int i=0; i<n/2; i++) {
			for(int j=n/2; j>=i; j--) {
				if( j>i) System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<n/2;i++) {
			for(int j=0; j<n/2; j++) {
				if(j<=i) System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<n; i++) {
			System.out.print("*");
		}
	}
}
