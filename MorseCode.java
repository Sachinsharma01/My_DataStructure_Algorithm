class MorseCode {
    final static String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","...."
            ,"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","..."
            ,"-","..-","...-",".--","-..-","-.--","--.."};
    final static String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String convertStringToMorseCode(String message) {
        String s = "";
        for (int i = 0; i < message.length(); i++) {
            s += morseCode[al.indexOf(message.charAt(i))] + " ";
        }
        return s;
    }
    public static String morseToString(String morse) {
        String s = "";
        String[] morseArray = morse.split(" ");
        for (int i = 0; i < morseArray.length; i++) {
            for (int k = 0; k < morseCode.length; k++) {
                if (morseArray[i].equals(morseCode[k]))
                    s += al.charAt(k);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(convertStringToMorseCode("CANTEEN"));
        System.out.println(morseToString("-.-. .- -. - . . -."));

    }
}
