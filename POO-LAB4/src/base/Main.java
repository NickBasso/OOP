package base;

import java.lang.String;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws IOException {
	    File inputFile = new File("three_expressions.txt");
	    Scanner scanner = new Scanner(inputFile);

	    StringBuilder input = new StringBuilder();
	    ArrayList<String> expression = new ArrayList<>();

	    while(scanner.hasNextLine()){
	        StringBuilder s = new StringBuilder(scanner.nextLine());

            expression.add(s.toString());

	        s.append("\n");
            input.append(s);
        }

        System.out.println("All input expressions:\n" + input);

        System.out.println("Check all expressions for parantheses correctness:");
	    for(String s: expression)
	        Main.checkParentheses(s);
    }

    private static void checkParentheses(String expression){
        int parenthesesBalance = 0;

        int i = 0 ;
        for(; i < expression.length(); i++){
            if(expression.charAt(i) == '(')
                parenthesesBalance++;
            else if(expression.charAt(i) == ')' && parenthesesBalance < 1)
                break;
            else if(expression.charAt(i) == ')')
                parenthesesBalance--;
        }

        if(i == expression.length() && parenthesesBalance == 0)
            System.out.println(expression + " " + " -> parentheses are correct.");
        else
            System.out.println(expression + " " + " -> parentheses are wrong!");
    }
}
