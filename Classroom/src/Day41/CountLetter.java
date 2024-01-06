package Day41;

import java.util.HashMap;

public class CountLetter {
    public static void main(String[] args) {
        String str = "batchgood";

        System.out.println("Output for str: " + countLetters(str));
    }
    public static HashMap<Character, Integer> countLetters(String input) {
        HashMap<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

                // if (Character.isLetter(currentChar)) {
               // letterCountMap.put(currentChar, letterCountMap.getOrDefault(currentChar, 0) + 1);

                if (letterCountMap.containsKey(currentChar)) {
                    int count = letterCountMap.get(currentChar);
                    letterCountMap.put(currentChar, count + 1);
                } else {
                    letterCountMap.put(currentChar, 1);
                }
            }
        return letterCountMap;
    }
}
