package base;

import java.util.Stack;

public class SolveExpressionIfLegal {
    private static char[] chars;
    private static int[] priority;
    private static String expression;
    private static Object Error;

    public SolveExpressionIfLegal(String expression){
        this.expression = expression;

        priority = new int[255];

        for(int i = 0; i < 10; i++)
            priority[i] = -1;

        priority['+'] = priority['-'] = 0;
        priority['*'] = priority['/'] = 1;
        priority['{'] = priority['}'] = 2;
        priority['['] = priority[']'] = 3;
        priority['('] = priority[')'] = 4;
    }

    public static boolean isExpressionLegal() throws Exception {
        return  LegalCharacterChecker.areCharactersLegal(expression) &&
                BracketsChecker.areBracketsCorrect(expression) &&
                ArithmeticOperatorChecker.areOperatorsCorrect(expression);
    }

    public static double solveExpression() throws Throwable {
        if(isExpressionLegal() == true)
            return calculatePart(expression);
        else
            throw (Throwable) Error;
    }

    private static double calculatePart(String part){
        int highestPriorityIndex = 0;
        int highestPriorityLevel = priority[part.charAt(0)];
        char highestPriorityCharacter = part.charAt(0);

        int[] matchingBracketIndex = new int[512];

        for(int i = 0; i < part.length(); i++){
            char c = part.charAt(i);

            if(priority[c] > highestPriorityLevel){
                highestPriorityIndex = i;
                highestPriorityLevel = priority[c];
                highestPriorityCharacter = c;
            }
        }

        if(isDigit(highestPriorityCharacter) == true)
            return Double.parseDouble(expression);

        char ch = highestPriorityCharacter;
        if(ch == '(' || ch == '[' || ch == '{'){
            /*Stack<Character> brackets = new Stack<Character>();
            brackets.push(expression.charAt(highestPriorityIndex));

            int i = 0;
            while(!brackets.empty() && i < expression.length()){
                Character c = expression.charAt(i);

                if(isBracket(c)){
                    if(isOpeningBracket(c) == true)
                        brackets.push(c);
                    else if(isClosingBracket(c) && brackets.size() > 0 && doBracketsMatch(c, brackets.peek())
                            == true)
                        brackets.pop();
                }

                i++;
            }*/

            int i = expression.length() - 1;
            while(i > 0 && doBracketsMatch(expression.charAt(i), ch) == false)
                i--;


            System.out.println(highestPriorityIndex + " " + highestPriorityCharacter + "\n" +  expression);
            return calculatePart(expression.substring(highestPriorityIndex + 1, i));
        }

        switch(highestPriorityCharacter){
            case '+' :
                return
                        Double.parseDouble(expression.substring(0, highestPriorityIndex))
                        +
                        Double.parseDouble(expression.substring(highestPriorityIndex + 1, expression.length()));

            case '-' :
                return
                        Double.parseDouble(expression.substring(0, highestPriorityIndex))
                        -
                        Double.parseDouble(expression.substring(highestPriorityIndex + 1, expression.length()));

            case '*' :
                return
                        Double.parseDouble(expression.substring(0, highestPriorityIndex))
                        *
                        Double.parseDouble(expression.substring(highestPriorityIndex + 1, expression.length()));

            case '/' :
                return
                        Double.parseDouble(expression.substring(0, highestPriorityIndex))
                        /
                        Double.parseDouble(expression.substring(highestPriorityIndex + 1, expression.length()));

            default:
                return
                        Double.parseDouble(expression);
        }
    }

    private static char matchingClosingBracket(char c) {
        String brackets = "()[]{}";

        for(int i = 0; i < brackets.length(); i++)
            if(c == brackets.charAt(i))
                return
                    brackets.charAt(i + 1);

        return 1;
    }

    public static boolean isDigit(char c){
        Character ch = c;
        return "0123456789".contains(ch.toString());
    }

    public static boolean isBracket(Character c){
        return "([{)]}".contains(c.toString());
    }

    public static boolean isOpeningBracket(Character c){
        if(c.equals('(') || c.equals('[') || c.equals('{'))
            return true;

        return false;
    }

    public static boolean isClosingBracket(Character c){
        if(c.equals(')') || c.equals(']') || c.equals('}'))
            return true;

        return false;
    }

    public static boolean doBracketsMatch(Character a, Character b){
        if( a.equals(')') && b.equals('(') ||
                a.equals(']') && b.equals('[') ||
                a.equals('}') && b.equals('{') )
            return true;

        return false;
    }
}
