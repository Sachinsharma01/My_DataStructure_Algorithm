package Leetcode;

import java.util.Stack;

public class Leetcode_20 {
    public boolean isValid(String s) {
        Stack<Integer> st =new Stack<Integer>();
        char a[]=s.toCharArray();
        int comp=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && !st.isEmpty()){comp=st.peek();}
            st.push((int) a[i]);
            if(comp!=0 && !st.isEmpty() && st.size()>1){
                if((comp==91 && st.peek()==93)||(comp==123 && st.peek()==125)||(comp==40 && st.peek()==41)){
                    st.pop();st.pop();}
            }
        }
        return st.isEmpty();
    }
}
