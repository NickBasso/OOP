package base;

import java.util.Stack;

public class BracketsChecker {
    public static boolean areBracketsCorrect(String expression){
        Stack<Character> brackets = new Stack<Character>();

        for(int i = 0; i < expression.length(); i++){
            Character c = expression.charAt(i);

            if(isBracket(c)){
                if(isOpeningBracket(c) == true)
                    brackets.push(c);
                else if(isClosingBracket(c) && brackets.size() > 0 && doBracketsMatch(c, brackets.peek())
                        == true)
                    brackets.pop();
                else
                    return false;
            } else
                continue;
        }

        if(brackets.empty() == true)
            return true;

        return false;
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
