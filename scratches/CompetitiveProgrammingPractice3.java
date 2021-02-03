import java.util.HashMap;
import java.util.Map;

class Duplicates {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        var resultMap = new HashMap<Character, Integer>();
        // write your code here ...
        for (int i = 0; i < string.length(); i++) {
            if (!resultMap.containsKey(string.charAt(i)))
                resultMap.put(string.charAt(i), 1);
            else
                resultMap.put(string.charAt(i), resultMap.get(string.charAt(i)) + 1);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}