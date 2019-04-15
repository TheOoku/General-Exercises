package hl.exercises;

import java.util.ArrayList;
import java.util.List;

// Ciąg liczb Fibonacciego
public class Fibonacci {

    public static void main(String[] args) {
        int searchedElement = 7;
        long nextElement;
        List<Long> fibonacciList = new ArrayList<Long>();
        fibonacciList.add(0L);
        fibonacciList.add(1L);

        for (int i = 1; i < searchedElement; i++) {
            nextElement = fibonacciList.get(i - 1) + fibonacciList.get(i);
            fibonacciList.add(nextElement);
        }

        for (int i = 0; i < fibonacciList.size(); i++) {
            System.out.println("Index: " + i + ", wartość: " + fibonacciList.get(i));
        }
    }

}
