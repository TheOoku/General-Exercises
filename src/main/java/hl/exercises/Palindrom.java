package hl.exercises;

public class Palindrom {
    public static void main(String[] args) {
        // Podaj String do testowania:
        String s = "Może jutro ta dama da tortu jeżom";

        boolean isPalindrom = true;

        // "\\s" usuwa wszystkie białe spacje (spacje, taby itd.), ale z samą spacją też działa :P
        char[] chArray = s.toLowerCase().replaceAll(" ", "").toCharArray();
        int lenght = (chArray.length / 2);  // podłoga z połowy długości tablicy, dla ilości iteracji w pętli

        // kontrolnie wypisuje tablice charów
        /*for (int i = 0; i < chArray.length; i++) {
            System.out.print(chArray[i]);
        }
        System.out.println();*/

        // porównujemy znaki z obu końców i zbliżamy się do środka
        for (int i = 0; i < lenght; i++) {
            if (chArray[i] == chArray[(chArray.length - i - 1)]){   // -1, bo index jest o 1 mniejszy od długości (przez index 0)
                continue;
            } else {
                isPalindrom = false;
                break;
            }
        }

        // wszystkie metody wykonane na Stringu "s" nie wpłynęły na obiekt, na który wskazuje, bo nie zostały przypisane
        System.out.println(s);
        System.out.println("Czy to palindrom? " + isPalindrom);
    }
}
