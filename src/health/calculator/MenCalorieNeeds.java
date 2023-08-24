package health.calculator;

import java.util.Scanner;

public class MenCalorieNeeds {
    Scanner scan = new Scanner(System.in);

    public MenCalorieNeeds() {
        calculateCaloricNeeds("man", 88.362, 13.397, 4.799, 4.677);
    }

    private void calculateCaloricNeeds(String gender, double baseA, double baseB, double baseC, double baseD) {
        int intensity, age;
        boolean valid = false;
        float DailyCaloricNeeds = 0;
        float height, weight;

        System.out.println("What is your height (in cm)?");
        height = scan.nextFloat();
        System.out.println("What is your weight (in kg)?");
        weight = scan.nextFloat();
        System.out.println("How old are you?");
        age = scan.nextInt();

        System.out.println("\n How many times do you exercise per week?\n"
                + "For little or no exercise, enter 0:\n"
                + "For light exercise (1-3 days a week), enter 1:\n"
                + "For moderate exercise (3-5 days a week), enter 2:\n"
                + "For intense exercise (6-7 days a week), enter 3:\n"
                + "For very intense exercise, heavy physical work, or twice-a-day training, enter 4:");

        do {
            System.out.println("Select your level of physical activity:");
            System.out.println("0 - Little or no exercise");
            System.out.println("1 - Light exercise (1-3 days per week)");
            System.out.println("2 - Moderate exercise (3-5 days per week)");
            System.out.println("3 - Intense exercise (6-7 days per week)");
            System.out.println("4 - Very intense exercise or heavy physical work");
            intensity = scan.nextInt();

            switch (intensity) {
                case 0:
                    valid = true;
                    DailyCaloricNeeds = calculateCaloricNeeds(baseA, baseB, baseC, baseD, weight, height, age, 1.2);
                    break;
                case 1:
                    valid = true;
                    DailyCaloricNeeds = calculateCaloricNeeds(baseA, baseB, baseC, baseD, weight, height, age, 1.375);
                    break;
                case 2:
                    valid = true;
                    DailyCaloricNeeds = calculateCaloricNeeds(baseA, baseB, baseC, baseD, weight, height, age, 1.55);
                    break;
                case 3:
                    valid = true;
                    DailyCaloricNeeds = calculateCaloricNeeds(baseA, baseB, baseC, baseD, weight, height, age, 1.725);
                    break;
                case 4:
                    valid = true;
                    DailyCaloricNeeds = calculateCaloricNeeds(baseA, baseB, baseC, baseD, weight, height, age, 1.9);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid option (0-4):");
            }
        } while (!valid);

        System.out.println("Your estimated daily caloric needs: " + DailyCaloricNeeds + " calories");
        System.out.println("Remember, the final result is an estimate of the number of calories needed daily"
                + " based on the provided information using the Harris-Benedict Equation.");
    }

    private float calculateCaloricNeeds(double baseA, double baseB, double baseC, double baseD, float weight,
            float height, int age, double activityFactor) {
        return (float) ((baseA + (baseB * weight) + (baseC * height) - (baseD * age)) * activityFactor);
    }
}
