package behavioral.interpreter;

import java.util.Stack;

public class InterpreterClient {

    public static void main(String[] args) {
        String postfix = "543-2+*";

        String OPERATORS = "+-*/";

        Stack<Exp> stack = new Stack<>();
        for (char c: postfix.toCharArray()) {
            Exp resultExp;
            if (OPERATORS.indexOf(c) == -1) {
                //resultExp = new Number(c - 48);
                stack.push(new Number(c - 48));
            }
            else {
                Exp right = (Exp) stack.pop();
                Exp left = (Exp) stack.pop();

                switch(c) {
                    case '+':
                        resultExp = new AddExp(left, right);
                        break;
                    case '-':
                        resultExp = new SubstractExp(left, right);
                        break;
                    case '*':
                        resultExp = new MultiplyExp(left, right);
                        break;
                    case '/':
                        resultExp = new DivideExp(left, right);
                        break;
                    default:
                        resultExp = new Number(0);
                }
                stack.push(new Number(resultExp.evaluate()));
            }
        }
        System.out.println("Result: " + ((Exp)stack.pop()).evaluate());
    }
}
