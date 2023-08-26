package health.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
  public BMI(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's calculate your BMI (Body Mass Index)!");
        System.out.println("Enter your weight (kg): ");
        double weight = scan.nextDouble();

        System.out.println("Enter your height (cm): ");
        double heightCm = scan.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);
        
        // Format the BMI to show only two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedBMI = decimalFormat.format(bmi);

        System.out.println("Your BMI is: " + formattedBMI);	
        
        if (bmi < 18.5) {
            System.out.println("Your BMI is less than 18.5, indicating Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is between 18.5 and 24.9, indicating Normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Your BMI is between 25 and 29.9, indicating Overweight.");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Your BMI is between 30 and 34.9, indicating Obesity class I.");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Your BMI is between 35 and 39.9, indicating Obesity class II.");
        } else {
            System.out.println("Your BMI is greater than 40, indicating Obesity class III.");
        }
        
      

        
  }
}


