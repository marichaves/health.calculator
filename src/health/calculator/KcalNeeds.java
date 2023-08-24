package health.calculator;

import java.util.Scanner;

class KcalNeeds {
	Scanner scan = new Scanner(System.in);

	public KcalNeeds() {
		System.out.println("\n What is your gender? Enter F for female and M for male: ");
		char gender = scan.next().charAt(0);

		if (gender == 'F' || gender == 'f') {
			WomanCalorieNeeds wCalories = new WomanCalorieNeeds();
		} else if (gender == 'M' || gender == 'm') {
			MenCalorieNeeds mCalories = new MenCalorieNeeds();
		} else {
			System.out.println("Invalid input.");
		}
	}
}