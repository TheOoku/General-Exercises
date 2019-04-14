package hl.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortStringByLength {
    public static void main(String[] args) {
        // Sortowanie długości Stringów
        String[] stringArray = new String[]{
                "Trąbka",
                "Ul",
                "Długopis",
                "Ok",
                "Słoń",
                "Koń",
                "Osa",
                "Konstantynopol",
                "Kosa",
                "Pompka"
        };
        Map<Integer, List> stringMap = new HashMap<Integer, List>();
        for (int i = 0; i < stringArray.length; i++) {
            int key = stringArray[i].length();
            if(stringMap.containsKey(key)){
                List<String> listToUpdate = stringMap.get(key);
                listToUpdate.add(stringArray[i]);
                stringMap.put(key, listToUpdate);
            }
            else{
                List<String> stringList = new ArrayList<String>();
                stringList.add(stringArray[i]);
                stringMap.put(key, stringList);
            }
        }
        for (Map.Entry<Integer, List> entryElement : stringMap.entrySet()) {
            List<String> stringList = entryElement.getValue();
            for (String s : stringList) {
                System.out.println(s);
            }

        }
    }
}
