import java.util.*;

public class CompleteMeal {
    public static void main(String[] args) {
        StringBuilder testCaseL1 = new StringBuilder("5 3"); // input
        Set<Integer> foodCategorySet = new HashSet<Integer>();
        int minFoodCategoryNum = (int) testCaseL1.charAt(testCaseL1.length() - 1) - 48;
        StringBuilder foodCategory = new StringBuilder("1 1 2 2 1"); // input
        for (int i = 0; i < foodCategory.length(); i++) {
            int num = (int) foodCategory.charAt(i) - 48;
            if (num > 0) {
                foodCategorySet.add(num);
            }
        }
        // impossible test case
        if (minFoodCategoryNum > foodCategorySet.size()) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

    }
}
