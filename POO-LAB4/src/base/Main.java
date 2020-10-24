/*
    Solves any correct algebraic expression which consists
    of such operators as +, -, *, /, ^(exponentiation of double base to integer power),
    trigonometric operations as sin, cos, tan, cot & sqrt;
    The numbers themselves and results of mathematical functions
    must be in range of values allowed by type 'double'.
 */

package base;

import java.util.ArrayList;

import static java.lang.StrictMath.sin;

class Main {
    public static void main(String[] args) throws Throwable {
        System.out.println(sin(6.28));

        System.out.println();

        // get data from the input file
        Input input = new Input("three_expressions.txt");
        String data = input.returnInputFromFileAsString();
        ArrayList<String> expression = input.returnExpressionArrayList();

        // print data from the file
        System.out.println("All input expressions:\n" + data);

        // check parentheses correctness
        System.out.println("Check all expressions for parentheses correctness:");
        for(String s: expression) {
            if(BracketsChecker.areBracketsCorrect(s) == true)
                System.out.println("'" + s + "' -> brackets are correct.");
            else
                System.out.println("'" + s + "' -> brackets are wrong!");
        }

        System.out.println();

        // minify expressions by removing whitespaces and expression index number
        System.out.println("Minified version of the expressions:");
        for(int i = 0; i < expression.size(); i++)
            expression.set(i, ExpressionMinifier.returnMinifiedExpression(expression.get(i)));

        System.out.println();

        // print expression solution or is illegal
        System.out.println("Expression results:");
        for(String s: expression){
            SolveExpressionIfLegal result = new SolveExpressionIfLegal(s);

            if(result.isExpressionLegal() == true)
                System.out.println(s + " = " + result.solveExpression());
            else
                System.out.println("'" + s + "' is an illegal expression!");
        }

    }
}
