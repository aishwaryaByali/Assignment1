package ineuron.assignment;

public class PatternPgm3 {

	public static void main(String[] args) {
		int n=10;
		System.out.println("program 3 complete");
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print("*");
			}
			for(int k=0; k<(i*2); k++) {
					System.out.print(" ");
			}
			for(int l=n; l>i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n+1; i<n*2; i++) {
			for(int j=0; j<n*2; j++) {
				if(j==0 || i==(n*2)-1 || j==(n*2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
