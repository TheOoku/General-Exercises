package hl.exercises;

public class SearchWordInString {

    public static void main(String[] args) {
        String string = "W tym zdaniu chce znalezc slowo=KoCImiętka-ukryte posrod innych slow";
        boolean test = string.toLowerCase().contains("kocimiętka");
        System.out.println("Czy zawiera słowo? " + test);
    }
}
