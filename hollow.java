package patten2;

public class hollow {
	public class VerySimpleHourglass {
	    public static void main(String[] args) {
	        int n = 7;
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < i; j++) System.out.print(" ");
	            for (int j = 0; j < (n - 2 * i); j++) {
	                if (i == 0 || j == 0 || j == (n - 2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        for (int i = 2; i >= 0; i--) {

	            for (int j = 0; j < i; j++) System.out.print(" ");
	            for (int j = 0; j < (n - 2 * i); j++) {
	                if (i == 0 || j == 0 || j == (n - 2 * i - 1)) {
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
