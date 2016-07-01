package Ch16;

import java.util.Stack;

public class BalanceParenthensies {
	
    public static void main(String args[]) {

        System.out.println(balancedParenthensies("[]{}()"));
        System.out.println(balancedParenthensies("{(a,b)}"));
        System.out.println(balancedParenthensies("{)(a,b}"));
    }

    public static boolean balancedParenthensies(String s) {
    	
        Stack<Character> stack  = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
            	System.out.println(c);
                stack.push(c);
                System.out.println(stack);

            }else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '[') return false;

            }else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') return false;

            }else if(c == '}') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}

