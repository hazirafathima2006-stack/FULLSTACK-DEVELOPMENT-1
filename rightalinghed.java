package patten3;

public class rightalinghed {
	public class HollowRightAlignedTriangle {
	    public static void main(String[] args) {
	        int n = 5;

	        for (int i = 1; i <= n; i++) {

	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                if (i == n || j == 1 || j == i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}

}
