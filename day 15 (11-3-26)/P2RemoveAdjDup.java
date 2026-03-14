// 1047 - Remove All Adjacent Duplicates In String

import java.util.*;
public class P2RemoveAdjDup {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();  // to convert stack to string

        for(char c : stack){
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        P2RemoveAdjDup obj = new P2RemoveAdjDup();
        String s = "abbaca";
        System.out.println(obj.removeDuplicates(s));
    }
}
