import java.util.HashMap;
import java.util.Map;

class Question2 {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("Competitive Programming"));
    }

    public static boolean checkWhetherStringIsUnique(String string) {
        UniqueString.string = string;
        return UniqueString.isStringUnique();
    }
    private static class UniqueString {
        private static String string;
        private static boolean isUnique = true;

        public UniqueString() {
        }

        @Override
        public String toString() {
            return "UniqueString{}";
        }

        public static String getString() {
            return string;
        }

        public static void setString(String string) {
            UniqueString.string = string;
        }
        static boolean isStringUnique() {
            Map<Character, Boolean> characters = new HashMap<>();
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (string.codePointAt(i) <= MAX_UNICODE) {
                    if (!Character.isWhitespace(c)) {
                        if (characters.put(c, true) != null); {
                            isUnique = false;
                            return isUnique;
                        }
                    }
                }
                else {
                    System.out.println("Invalid Character");
                    isUnique = false;
                    return isUnique;
                }
            }
            return isUnique;
        }
    }
}