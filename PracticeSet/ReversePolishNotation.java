package PracticeSet;

import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";

        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = new String[] {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));  // Output: 9
    }
}
