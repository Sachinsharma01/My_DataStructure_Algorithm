import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Question2 {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("Competitive Programming"));
    }

    public static boolean checkWhetherStringIsUnique(String string) {
        Map<Character, Boolean> characters = new HashMap<>();
        return UniqueString.isStringUnique(characters, string);
    }

    private static class UniqueString {
        String string;
        static boolean isUnique = false;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UniqueString that = (UniqueString) o;
            return Objects.equals(string, that.string);
        }

        @Override
        public int hashCode() {
            return Objects.hash(string);
        }

        @Override
        public String toString() {
            return "UniqueString{" +
                    "string='" + string + '\'' +
                    '}';
        }
        public static boolean isStringUnique(Map<Character, Boolean> map, String st){
            // Write your code here...
            for (char i: st.toCharArray()) {
                if (i == ' ')
                    continue;
                else if (!map.containsKey(i))
                    map.put(i, true);
                else
                    return isUnique;
            }
            return true;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public UniqueString(String string) {
            this.string = string;
        }
    }
}
/*

}
 */


















