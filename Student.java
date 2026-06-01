package Student;

import java.util.Scanner;
public class Student {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter student mark: ");
	        int mark = sc.nextInt();

	        if (mark >= 90) {
	            System.out.println("Excellent");
	        }
	        else if (mark >= 75) {
	            System.out.println("Good");
	        }
	        else if (mark >= 50) {
	            System.out.println("Average");
	        }
	        else {
	            System.out.println("Needs Improvement");
	        }

	        sc.close();
	    }
	}
