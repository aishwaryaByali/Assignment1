package ineuron.assignment;

public class PatternPgm4 {

	public static void main(String[] args) {
		int n=15;
		System.out.println("Question 4");
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
