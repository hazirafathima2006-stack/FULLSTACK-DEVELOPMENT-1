package patten;

public class patten3 {
	    public static void main(String[] args) {
	        int n = 3;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j)
	                    System.out.print("1 ");
	                else
	                    System.out.print("0 ");
	            }
	            System.out.println();
	        }
	    }
	}
