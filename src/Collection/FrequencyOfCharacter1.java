package Collection;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter1 {
    public static void calculateFrequencyOfCharacter(String string) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (map.containsKey(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            } else {
                map.put(string.charAt(i), 1);
            }
        }
        System.out.println(map);
    }


    public static void main(String[] args) {

        calculateFrequencyOfCharacter("OrionTechAutomation");

        }
}


