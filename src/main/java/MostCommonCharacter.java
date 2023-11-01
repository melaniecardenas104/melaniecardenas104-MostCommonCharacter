import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for(char c : str.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0) +1);
        }
        int maxCount = 0;
        char maxChar = 0;

        for(HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }

        }
        return maxChar;
    }
}
