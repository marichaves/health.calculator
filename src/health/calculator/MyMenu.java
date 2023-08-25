package health.calculator;

import java.util.HashMap;
import java.util.Map;

public class MyMenu {
	   private static final Map<String, int[]> foodData = new HashMap<>();

    static {
    	// Alimentos de frutas // 100g, Kcal, Protein, Spoon g/ peça de fruta, Spoon kcal/peça de fruta, Spoon/peça de fruta protein
    	foodData.put("tomate cereja", new int[]{100, 18, 0, 4, 4, 0});
    	foodData.put("tomate holandês", new int[]{100, 74, 0, 12, 12, 0});
    	foodData.put("banana prata", new int[]{100, 96, 1, 105, 105, 1});
    	foodData.put("manga", new int[]{100, 60, 1, 135, 135, 1});
    	foodData.put("uva", new int[]{100, 69, 0, 2, 2, 0});
    	foodData.put("jaca", new int[]{100, 95, 2, 90, 90, 2});
    	foodData.put("maçã", new int[]{100, 52, 0, 95, 95, 0});
    	 foodData.put("abacate", new int[]{100, 100, 2, 45, 80, 1}); 
    	 foodData.put("pequi", new int[]{100, 210, 2, 23, 23, 0}); 
    	 foodData.put("jatobá", new int[]{100, 113, 1, 12, 12, 0}); 
    	 foodData.put("cagaita", new int[]{100, 45, 1, 6, 6, 0}); 
    	 foodData.put("araçá", new int[]{100, 60, 1, 7, 7, 0}); 
    	 foodData.put("baru", new int[]{100, 177, 3, 20, 20, 0}); 
    	 foodData.put("murici", new int[]{100, 48, 1, 6, 6, 0}); 
    	 foodData.put("guavira", new int[]{100, 58, 1, 7, 7, 0}); 
    	 foodData.put("araticum", new int[]{100, 72, 1, 8, 8, 0});

       
    	// Alimentos de carnes // 100g, Kcal, Protein, Spoon g/ peça de fruta, Spoon kcal/peça de fruta, Spoon/peça de fruta protein
    	 foodData.put("frango", new int[]{100, 165, 31, 25, 25, 4});
    	 foodData.put("carne de vaca", new int[]{100, 250, 26, 37, 37, 3});
    	 foodData.put("salmão", new int[]{100, 206, 25, 31, 31, 3});
    	 foodData.put("tilápia", new int[]{100, 96, 20, 14, 14, 3});
    	 foodData.put("porco", new int[]{100, 143, 21, 21, 21, 3});
    	 foodData.put("ovo", new int[]{100, 155, 13, 23, 23, 1});

    	 // Outros alimentos // 100g, Kcal, Protein, Spoon g, Spoon kcal, Spoon protein
    	 // A tabela possui informações aproximadas, apenas com numeros naturais. 
    	 foodData.put("iogurte", new int[]{100, 100, 2, 15, 80, 1}); 
    	 foodData.put("feijão", new int[]{100, 70, 3, 10, 0, 0}); 
    	 foodData.put("arroz", new int[]{100, 130, 2, 20, 0, 0}); 
    	 foodData.put("farofa", new int[]{100, 300, 3, 45, 0, 0}); 
    	 foodData.put("coxinha", new int[]{100, 260, 10, 39, 0, 1}); 
    	 foodData.put("açaí", new int[]{100, 70, 1, 10, 0, 0}); 
    	 foodData.put("pastel", new int[]{100, 300, 6, 45, 0, 1}); 
    	 foodData.put("brigadeiro", new int[]{100, 380, 2, 57, 0, 0});

       
    }
    public static int[] getFoodData(String food, boolean useSpoon) {
        int[] data = foodData.get(food.toLowerCase());
        if (data != null && useSpoon) {
            return new int[]{data[3], data[4], data[5]}; // Spoon data
        }
        return new int[]{data[0], data[1], data[2]}; // Regular data
    }
}

