package Traficlight;
import java.util.Scanner;
public class Traficlinght {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter traffic light color: ");
	        String light = sc.nextLine();

	        if (light.equals("Red")) {
	            System.out.println("Stop");
	        }
	        else if (light.equals("Yellow")) {
	            System.out.println("Ready");
	        }
	        else if (light.equals("Green")) {
	            System.out.println("Go");
	        }
	        else {
	            System.out.println("Invalid Traffic Light");
	        }

	        sc.close();
	    }
	}
