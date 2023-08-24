package health.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalKcalAndProteinCalculator {
    Scanner scan = new Scanner(System.in);

    private Map<String, int[]> foodMap;

    public PersonalKcalAndProteinCalculator() {
        foodMap = new HashMap<>();
        foodMap.put("abacate", MyMenu.getFoodData("abacate", false)); // Use 100g data by default
        foodMap.put("iogurte", MyMenu.getFoodData("iogurte", false)); // Use 100g data by default
        // Add more foods to the map as needed
        
        System.out.println("What did you eat today? Add the name of the consumed food, followed by the quantity in grams. Press 0 to calculate.");
        while (true) {
            String food = scan.nextLine();
            if (food.equals("0")) {
                break;
            }

            int[] selectedFood = foodMap.get(food.toLowerCase());
            if (selectedFood == null) {
                System.out.println("Food not found in MyMenu or invalid choice.");
                continue;
            }

            System.out.println("Choose an option for " + food + ":");
            System.out.println("1. Calculate using Spoon");
            System.out.println("2. Calculate using 100g");
            int choice = scan.nextInt();
            
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice.");
                continue;
            }

            boolean useSpoon = (choice == 1);
            selectedFood = MyMenu.getFoodData(food.toLowerCase(), useSpoon);

            System.out.print("Enter the quantity: ");
            int quantity = scan.nextInt();

            float kcal = (float) selectedFood[1] * quantity ;
            float protein = (float) selectedFood[2] * quantity ;

            System.out.println("Calories: " + kcal + " Kcal");
            System.out.println("Protein: " + protein + " g");

            scan.nextLine(); // Consume the newline character
        }
    }
}

