package hl.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intList.add(1 + random.nextInt(100));
        }

        int lookedForInt = intList.get(7);

        System.out.println("Liczby prosto z listy: ");
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }

        System.out.println("\nPosortowane rosnąco: ");
        Collections.sort(intList);
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }

        System.out.println("\nPosortowane malejąco: ");
        Collections.reverse(intList);
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }

        System.out.println("\nPozycja na, której jest liczba " + lookedForInt + ": " + intList.indexOf(lookedForInt));
    }
}
