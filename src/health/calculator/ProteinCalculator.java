package health.calculator;

import java.util.Scanner;
//Eu confirmei o calculo com o site da adidas: https://www.runtastic.com/blog/pt/calculadora-de-proteinas/
public class ProteinCalculator {
    Scanner scan = new Scanner(System.in);
    float  weight;
    int  goal;

    public ProteinCalculator() {
        boolean valid = true;

        System.out.println("Enter your weight in kg: ");
        weight = scan.nextFloat();


        do {
            System.out.println("What is your goal? Enter the corresponding number:\n"
                    + " 1 - Gain weight: \r\n"
                    + " 2 - Maintain weight: \r\n"
                    + " 3 - Lose weight:  ");
            goal = scan.nextInt(); 
            switch (goal) {
                case 1: // Gain weight
                    valid = true;
                    float minProteinGain = weight * 1.2f;  // Minimum protein for gain (grams)
                    float maxProteinGain = weight * 1.5f;  // Maximum protein for gain (grams)
                    System.out.println("Protein range for weight gain: " + minProteinGain + "g - " + maxProteinGain + "g");
                    break;
                case 2: // Maintain weight
                    valid = true;
                    float minProteinMaintain = weight * 0.8f;  // Minimum protein for maintenance (grams)
                    float maxProteinMaintain = weight * 1.2f;  // Maximum protein for maintenance (grams)
                    System.out.println("Protein range for weight maintenance: " + minProteinMaintain + "g - " + maxProteinMaintain + "g");
                    break;
                case 3: // Lose weight
                    valid = true;
                    float minProteinLose = weight * 1.2f;  // Minimum protein for weight loss (grams)
                    float maxProteinLose = weight * 1.5f;  // Maximum protein for weight loss (grams)
                    System.out.println("Protein range for weight loss: " + minProteinLose + "g - " + maxProteinLose + "g");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid option (1-3):");
                    break;
            }
        } while (!valid);
    }
}