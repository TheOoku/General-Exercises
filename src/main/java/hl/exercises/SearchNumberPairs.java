package hl.exercises;

import java.util.ArrayList;
import java.util.List;

public class SearchNumberPairs {

    public static void main(String[] args) {
        int[] nbArray1 = new int[]{1, 3, 8, 10, 12, 15, 3};
        int[] nbArray2 = new int[]{0, 6, 12, 10, 5, 3};
        int sume = 15;
        List<String> pairsList = new ArrayList<String>();

        searchForPairs(nbArray1, nbArray2, sume, pairsList);
        printPairs(pairsList);
    }

    private static void printPairs(List<String> pairsList) {
        for (int i = 0; i < pairsList.size(); i++) {
            System.out.println(pairsList.get(i) + " ");
        }
    }

    private static void searchForPairs(int[] nbArray1, int[] nbArray2, int sume, List<String> pairsList) {

        for (int i = 0; i < nbArray1.length; i++) {
            for (int j = 0; j < nbArray2.length; j++) {
                if (sume == (nbArray1[i] + nbArray2[j])){
                    pairsList.add(String.valueOf(nbArray1[i]) + " | " + String.valueOf(nbArray2[j]));
                }
            }
        }
    }


}
