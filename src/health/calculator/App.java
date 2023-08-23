package health.calculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int calculator;
		 do {
	            System.out.println("What do you want to do today? Enter the corresponding number:\n "
	                    + "1 - Calculate BMI\n" 
	                    + " 2 - Calculate daily calorie needs\n"
	                    + " 3 - Calculate daily required protein amount\n"
	                    + " 0 - Exit");

	            calculator = scan.nextInt();

	            if (calculator == 1) {
	    			 BMI bmiCalculator = new BMI();;
	    			break;
	    		}
	    		if (calculator == 2) {
	    			System.out.println("Voce vai calcular o 1");
	    			break;
	    		}
	    		if (calculator == 3) {
	    			System.out.println("Voce vai calcular o 1");
	    			break;
	    		
	            }
	        } while (true);
	}

}
