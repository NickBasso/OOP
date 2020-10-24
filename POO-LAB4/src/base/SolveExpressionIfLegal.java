package base;

import java.util.Stack;

import static java.lang.StrictMath.*;

 class SolveExpressionIfLegal {
    private static char[] chars;
    private static int[] priority;
    private static String expression;
    private static Object Error;

     SolveExpressionIfLegal(String expression){
        this.expression = expression;

        priority = new int[255];

        for(int i = 0; i < 10; i++)
            priority[i + '0'] = 0;

        priority['('] = 1;
        priority['*'] = priority['/'] = priority['^'] = 2;
        priority['+'] = priority['-'] = 3;
    }

     boolean isExpressionLegal() throws Exception {
        return  LegalCharacterChecker.areCharactersLegal(expression) &&
                BracketsChecker.areBracketsCorrect(expression) &&
                ArithmeticOperatorChecker.areOperatorsCorrect(expression);
    }

     double solveExpression() throws Throwable {
        return calculatePart(expression);
    }

    private static double calculatePart(String part){
        //System.out.println(part);

        if(part.length() == 0)
            return 0;

        int highestPriorityIndex = 0;
        int highestPriorityLevel = priority[part.charAt(0)];
        char highestPriorityCharacter = part.charAt(0);

        int balance = 0;
        for(int i = 0; i < part.length(); i++){
            char c = part.charAt(i);

            if(c == '(')
                balance++;
            else if(c == ')')
                balance--;

            if(balance == 0 && priority[c] >= highestPriorityLevel){
                highestPriorityIndex = i;
                highestPriorityLevel = priority[c];
                highestPriorityCharacter = c;
            }
        }

        //System.out.println(highestPriorityIndex + " " + highestPriorityCharacter + " " + highestPriorityLevel);

        String rightPart = part.substring(highestPriorityIndex + 1, part.length());
        switch(highestPriorityCharacter){
            case '+' :
                return
                        calculatePart(part.substring(0, highestPriorityIndex))
                        +
                        calculatePart(rightPart);

            case '-' :
                return
                        calculatePart(part.substring(0, highestPriorityIndex))
                        -
                        calculatePart(rightPart);

            case '*' :
                return
                        calculatePart(part.substring(0, highestPriorityIndex))
                        *
                        calculatePart(rightPart);

            case '/' :
                return
                        calculatePart(part.substring(0, highestPriorityIndex))
                        /
                        calculatePart(rightPart);

            case '^' :
                return
                        pow(calculatePart(part.substring(0, highestPriorityIndex)),
                            (int)calculatePart(rightPart));
        }

        if(highestPriorityCharacter == '('){
            return calculatePart(part.substring(1, part.length() - 1));
        }

        else if(isAlgebraicFunction(part)){
            return calculateAlgebraicExpression(part);
        }

        else if(isDigit(highestPriorityCharacter) == true){
                return Double.parseDouble(part);
        }

        // obviously should not happen
        return -666666666;
    }

     static boolean isDigit(char c){
        Character ch = c;
        return "0123456789".contains(ch.toString());
    }

     static boolean isAlgebraicFunction(String s){
        if(s.charAt(0) == 's' && s.charAt(1) == 'q' && s.charAt(2) == 'r' && s.charAt(3) == 't'){
            return true;
        }
        if(s.charAt(0) == 's' && s.charAt(1) == 'i' && s.charAt(2) == 'n'){
            return true;
        }
        else if(s.charAt(0) == 'c' && s.charAt(1) == 'o' && s.charAt(2) == 's'){
            return true;
        }
        else if(s.charAt(0) == 't' && s.charAt(1) == 'a' && s.charAt(2) == 'n'){
            return true;
        }
        else if(s.charAt(0) == 'c' && s.charAt(1) == 'o' && s.charAt(2) == 't'){
            return true;
        }
        else{
            return false;
        }
    }

     static double calculateAlgebraicExpression(String s){
        if(s.charAt(0) == 's' && s.charAt(1) == 'q' && s.charAt(2) == 'r' && s.charAt(3) == 't'){
            return sqrt(calculatePart(s.substring(4)));
        }
        if(s.charAt(0) == 's' && s.charAt(1) == 'i' && s.charAt(2) == 'n'){
            return sin(calculatePart(s.substring(3)));
        }
        else if(s.charAt(0) == 'c' && s.charAt(1) == 'o' && s.charAt(2) == 's'){
            return cos(calculatePart(s.substring(3)));
        }
        else if(s.charAt(0) == 't' && s.charAt(1) == 'a' && s.charAt(2) == 'n'){
            return tan(calculatePart(s.substring(3)));
        }
        else if(s.charAt(0) == 'c' && s.charAt(1) == 'o' && s.charAt(2) == 't'){
            return cos(calculatePart(s.substring(3))) / sin(calculatePart(s.substring(3)));
        }

        return 0;
    }
}
