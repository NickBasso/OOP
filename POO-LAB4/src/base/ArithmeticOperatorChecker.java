package base;

 class ArithmeticOperatorChecker {
     static boolean areOperatorsCorrect(String expression) {
        if(expression.length() == 0)
            return false;
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

     static boolean isArithmeticOperator(Character c){
        return "+-*/^".contains(c.toString());
    }

     static boolean isPreviousCharacterValid(Character c){
        return "0123456789()sincotar".contains(c.toString());
    }

      static boolean isNextCharacterValid(Character c){
        return "0123456789()sincotar".contains(c.toString());
    }
}
