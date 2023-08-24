package health.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalKcalAndProteinCalculator {
    Scanner scan = new Scanner(System.in);

    private Map<String, int[]> foodMap;

    public PersonalKcalAndProteinCalculator() {
        foodMap = new HashMap<>();
      
        
        //Frutas
        foodMap.put("abacate", MyMenu.getFoodData("abacate", false)); // Use 100g data by default
        foodMap.put("tomate", MyMenu.getFoodData("tomate", false)); 
        foodMap.put("banana", MyMenu.getFoodData("banana", false)); 
        foodMap.put("manga", MyMenu.getFoodData("manga", false)); 
        foodMap.put("uva", MyMenu.getFoodData("uva", false)); 
        foodMap.put("jaca", MyMenu.getFoodData("jaca", false)); 
        foodMap.put("maça", MyMenu.getFoodData("maça", false)); 
        
        //Carnes 
        foodMap.put("frango", MyMenu.getFoodData("frango", false));
        foodMap.put("vaca", MyMenu.getFoodData("vaca", false));
        foodMap.put("salmao", MyMenu.getFoodData("salmao", false));
        foodMap.put("tilapia", MyMenu.getFoodData("tilapia", false));
        foodMap.put("porco", MyMenu.getFoodData("porco", false));
        //Others
        foodMap.put("iogurte", MyMenu.getFoodData("iogurte", false)); 
        foodMap.put("chocolate", MyMenu.getFoodData("chocolate", false)); 
        
        
        
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
            //Do next:
            //Colocar a parte da comida dentro de um loop e somar, sair do loop com o total da soma.
            
        }
    }
}

