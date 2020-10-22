package base;

import java.lang.String;
import java.util.ArrayList;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Throwable {
        String d = "1";
        System.out.println(Double.parseDouble(d));
        System.out.println(Double.parseDouble("1."));
        System.out.println(Double.parseDouble("23.2132132131232132132132132121321312"));
        System.out.println(Double.parseDouble(".321321321"));
        //System.out.println(Double.parseDouble("1.0k"));

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
                System.out.println("<" + s + "> -> brackets are correct.");
            else
                System.out.println("<" + s + "> -> brackets are wrong!");
        }

        // minify expressions by removing whitespaces and expression index number
        for(int i = 0; i < expression.size(); i++)
            expression.set(i, ExpressionMinifier.returnMinifiedExpression(expression.get(i)));

        for(String s: expression){
            SolveExpressionIfLegal result = new SolveExpressionIfLegal(s);
            System.out.println(s + " = " + result.solveExpression());
        }

    }
}
