package health.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalKcalAndProteinCalculator {
    Scanner scan = new Scanner(System.in);

    private Map<String, int[]> foodMap;

    public PersonalKcalAndProteinCalculator() {
        foodMap = new HashMap<>();
        foodMap.put("abacate", MyMenu.getFoodData("abacate", false));
        foodMap.put("tomate cereja", MyMenu.getFoodData("tomate cereja", false));
        foodMap.put("tomate holandês", MyMenu.getFoodData("tomate holandês", false));
        foodMap.put("banana prata", MyMenu.getFoodData("banana prata", false));
        foodMap.put("manga", MyMenu.getFoodData("manga", false));
        foodMap.put("uva", MyMenu.getFoodData("uva", false));
        foodMap.put("jaca", MyMenu.getFoodData("jaca", false));
        foodMap.put("maçã", MyMenu.getFoodData("maçã", false)); 
        foodMap.put("pequi", MyMenu.getFoodData("pequi", false));
        foodMap.put("jatobá", MyMenu.getFoodData("jatobá", false));
        foodMap.put("cagaita", MyMenu.getFoodData("cagaita", false));
        foodMap.put("araçá", MyMenu.getFoodData("araçá", false));
        foodMap.put("baru", MyMenu.getFoodData("baru", false));
        foodMap.put("murici", MyMenu.getFoodData("murici", false));
        foodMap.put("guavira", MyMenu.getFoodData("guavira", false));
        foodMap.put("araticum", MyMenu.getFoodData("araticum", false));
        foodMap.put("frango", MyMenu.getFoodData("frango", false));
        foodMap.put("carne de vaca", MyMenu.getFoodData("carne de vaca", false));
        foodMap.put("salmão", MyMenu.getFoodData("salmão", false));
        foodMap.put("tilápia", MyMenu.getFoodData("tilápia", false));
        foodMap.put("porco", MyMenu.getFoodData("porco", false));
        foodMap.put("iogurte", MyMenu.getFoodData("iogurte", false));
        foodMap.put("feijão", MyMenu.getFoodData("feijão", false));
        foodMap.put("arroz", MyMenu.getFoodData("arroz", false));
        foodMap.put("farofa", MyMenu.getFoodData("farofa", false));
        foodMap.put("coxinha", MyMenu.getFoodData("coxinha", false));
        foodMap.put("açaí", MyMenu.getFoodData("açaí", false));
        foodMap.put("pastel", MyMenu.getFoodData("pastel", false));
        foodMap.put("brigadeiro", MyMenu.getFoodData("brigadeiro", false));

        
    }
        
        public void calculate() {
            float totalKcal = 0;
            float totalProtein = 0;

            System.out.print("How many foods do you want to add? ");
            int numFoods = scan.nextInt();
            scan.nextLine(); // Consumir a quebra de linha após o próximo inteiro

            for (int i = 1; i <= numFoods; i++) {
                System.out.println("Food #" + i);
                String food = scan.nextLine();

                int[] selectedFood = foodMap.get(food.toLowerCase());
                if (selectedFood == null) {
                    System.out.println("Food not found in MyMenu or invalid choice.");
                    continue;
                }

                System.out.println("Choose an option for " + food + ":");
                System.out.println("1. Calculate using Spoon/ Fruta ou o gomo dela (ex: gomo de jaca) ");
                System.out.println("2. Calculate using 100g");
                int choice = scan.nextInt();

                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid choice.");
                    continue;
                }

                boolean useSpoon = (choice == 1);

                System.out.print("Enter the quantity: ");
                int quantity = scan.nextInt();

                float kcal = (float) selectedFood[1] * quantity;
                float protein = (float) selectedFood[2] * quantity;

                System.out.println("Calories: " + kcal + " Kcal");
                System.out.println("Protein: " + protein + " g");

                totalKcal += kcal;
                totalProtein += protein;

                scan.nextLine(); // Consume the newline character
            }

            System.out.println("Total Calories: " + totalKcal + " Kcal");
            System.out.println("Total Protein: " + totalProtein + " g");
        }
    
}
