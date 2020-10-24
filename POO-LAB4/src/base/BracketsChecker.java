package base;

 class BracketsChecker {
     static boolean areBracketsCorrect(String expression) {
        int balance = 0;

        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) == '(')
                balance++;
            else if(expression.charAt(i) == ')')
                balance--;
        }

        return balance == 0;
     }
}
