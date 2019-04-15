package hl.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//
// Sito Eratostenesa
public class PrimeNumbers {
    public static void main(String[] args) {
        int range = 100;
        int lookedFor = 15;
        int counter = 0;
        List<Boolean> primeNbList = new ArrayList<Boolean>();

        boolean[] primeNumberArray = new boolean[range];
        primeNumberArray[0] = false;
        primeNumberArray[1] = false;
        for (int i = 2; i < primeNumberArray.length; i++) {
            primeNumberArray[i] = true;
        }

        for (int i = 2; i < primeNumberArray.length; i++) {
            if (primeNumberArray[i]){
                for (int j = i + i; j < primeNumberArray.length; j = j + i) {
                    primeNumberArray[j] = false;
                }
            }
        }

        for (int i = 0; i < primeNumberArray.length; i++) {
            if (primeNumberArray[i]){
                primeNbList.add(primeNumberArray[i]);
            }
        }

        for (int i = 2; i < primeNumberArray.length; i++) {
            if (primeNumberArray[i]){
                ++counter;
                if (counter == lookedFor){
                    System.out.println(lookedFor + " liczba pierwsza to: " + i);
                }
            }
        }

        /*for (int i = 0; i < primeNumberArray.length; i++) {
            System.out.println(i + " czy jest l. pierwszą: " + primeNumberArray[i]);
        }*/

    }

    private static void findSpecificNumer(int index, int range) {
        boolean[] primeNumberArray = new boolean[range];
        for (int i = 0; i < primeNumberArray.length; i++) {
            primeNumberArray[i] = true;
        }

        int test;

        for (int i = 2; i < primeNumberArray.length; i++) {
            for (int j = i + i; j < primeNumberArray.length; j = j + i) {
                test = j / i;
                if ( test != 0 ){
                    primeNumberArray[i] = false;
                }
            }

        }

        for (int i = 0; i < primeNumberArray.length; i++) {
            System.out.println("Index " + (i + 1) + " jest: " + primeNumberArray[i]);
        }

    }
}
