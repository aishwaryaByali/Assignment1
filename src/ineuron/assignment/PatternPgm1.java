package ineuron.assignment;

public class PatternPgm1 {

	public static void main(String[] args) {
		// q1: INEURON
				int n=6;
				System.out.println("Question1");
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) { //I
						if(i==0 || i== n-1 || j==(n-1)/2)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					for(int j=0; j<n; j++) {
						if(j==0 || j==n-1 || i==j) 
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					for(int j=0; j<n; j++) {
						if(i==0 || j==0 || i==n-1 || i==(n-1)/2) 
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");

					for(int j=0; j<n; j++) {
						if(j==0 || j==n-1 || (i==n-1 && j>0 && j<n-1)) 
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					for(int j=0; j<n; j++) { 
						if(j==0 || 
								(i==(n-1)/2 && j==(n-1)/2) || 
								(j==(n-1) && i<(n-1)/2) || 
								(i==j && i>(n-1)/2) || 
								(i==0 && j<n-1) ||
								(i==(n-1)/2 && j<n-1)
								)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					for(int j=0; j<n; j++) {
						if(i==0 || i==n-1 || j==0 || j==n-1 )
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.print(" ");
					for(int j=0; j<n; j++) {
						if(j==0 || j==n-1 || i==j) 
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
	}

}
