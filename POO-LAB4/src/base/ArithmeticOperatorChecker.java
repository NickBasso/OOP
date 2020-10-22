package base;

public class ArithmeticOperatorChecker {
    public static boolean areOperatorsCorrect(String expression) throws Exception {
        if(isArithmeticOperator(expression.charAt(0)))
            return false;

        for(int i = 1; i < expression.length() - 1; i++){
            Character p = expression.charAt(i - 1);
            Character c = expression.charAt(i);
            Character n = expression.charAt(i + 1);

            if(isArithmeticOperator(c) == true){
                if( isPreviousCharacterValid(p) == true &&
                    isNextCharacterValid(n) == true )
                        continue;
                else
                        return false;
            }
        }

        return true;
    }

    public static boolean isArithmeticOperator(Character c){
        return "+-*/".contains(c.toString());
    }

    public static boolean isPreviousCharacterValid(Character c){
        return "0123456789()[]{}".contains(c.toString());
    }

    public  static boolean isNextCharacterValid(Character c){
        return "0123456789()[]{}".contains(c.toString());
    }
}
