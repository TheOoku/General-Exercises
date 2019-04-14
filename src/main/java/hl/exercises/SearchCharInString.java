package hl.exercises;

import java.util.ArrayList;
import java.util.List;

public class SearchCharInString {
    public static void main(String[] args) {
        String string = "Abrakadabra";
        char ch = 'a';

        char[] chars = string.toLowerCase().toCharArray();
        List<Integer> xPositions = new ArrayList<Integer>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch){
                xPositions.add(i);
            }
        }
        System.out.print("Odnaleziono " + ch + " " + xPositions.size() + " razy, na pozycjach: ");
        for (int i = 0; i < xPositions.size(); i++) {
            System.out.print(xPositions.get(i) + " ");

        }
    }
}
