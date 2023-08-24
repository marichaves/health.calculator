package health.calculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int calculator;
		 do {
	            System.out.println("What do you want to do today? Enter the corresponding number:\n "
	                    + "1 - Calculate BMI(Body Mass Index) \n" 
	                    + "2 - Calculate daily calorie needs\n"
	                    + "3 - Calculate daily required protein amount\n"
	                    + "4 - o teu negócio \n"
	                    + "0 - Exit");

	            calculator = scan.nextInt();

	            if (calculator == 1) {
	                BMI bmiCalculator = new BMI();
	            } else if (calculator == 2) {
	                KcalNeeds calorieNeeds = new KcalNeeds();
	            } else if (calculator == 3) {
	            	ProteinCalculator proteinCalculator = new ProteinCalculator();
	            } else if (calculator == 4) {
	            	PersonalKcalAndProteinCalculator personalKcalAndProteinCalculator = new PersonalKcalAndProteinCalculator();
	            } else if (calculator == 0) {
	                System.out.println("Exiting...");
	            } else {
	                System.out.println("Invalid option.");
	            }
	        } while (calculator != 0);
	}

}
