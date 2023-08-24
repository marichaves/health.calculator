package health.calculator;

import java.util.HashMap;
import java.util.Map;

public class MyMenu {
    private static final Map<String, int[]> foodData = new HashMap<>();

    static {
        foodData.put("abacate", new int[]{100, 100, 2, 45, 80, 1}); // 100g, Kcal, Protein, Spoon g, Spoon kcal, Spoon protein
        foodData.put("iogurte", new int[]{100, 100, 2, 15, 80, 1}); // 100g, Kcal, Protein, Spoon g, Spoon kcal, Spoon protein
        // Add more food data as needed
    }

    public static int[] getFoodData(String food, boolean useSpoon) {
        int[] data = foodData.get(food.toLowerCase());
        if (data != null && useSpoon) {
            return new int[]{data[3], data[4], data[5]}; // Spoon data
        }
        return new int[]{data[0], data[1], data[2]}; // Regular data
    }
}
