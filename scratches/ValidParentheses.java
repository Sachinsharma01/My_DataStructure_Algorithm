import java.util.Stack;

class validParentheses {
    public static boolean isValid(String string) {
        boolean valid = true;
        Stack<Character> s = new Stack<>();
        for (char i : string.toCharArray()) {
            if (i == '(' || i == '[' || i == '{')
                s.push(i);
            else {
                if (s.empty())
                    valid = false;
                else {
                    char a;
                    switch(i) {
                        case ')':
                            a = s.pop();
                            if (a != '(')
                                valid = false;
                            break;
                        case ']':
                            a = s.pop();
                            if (a != '[')
                                valid = false;
                            break;
                        case '}':
                            a = s.pop();
                            if (a != '{')
                                valid = false;
                            break;
                    }
                }
            }
        }
        System.out.println(s.empty());
        return valid;
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        if (isValid(s))
            System.out.println("Valid!");
        else
            System.out.println("Not Valid!!");
    }
}