package base;

 class ExpressionMinifier {
     static String returnMinifiedExpression(String expression){
        StringBuilder sb = new StringBuilder();

        // find the expression index position ending
        int i = 0;
        while(i < expression.length() && expression.charAt(i) != '.')
            i++;

        /*  check whether that digit with a dot after was really an index
            of an expression, not a floating point number;
            if it was a number, consider that expression itself
            starts from the very beginning of the string.
         */
        if(i == expression.length() || expression.charAt(i) == ' ' || isIntegerNumber(expression.substring(0, i)) == false)
            i = 0;
        else
            i++;

        // and start minifying from the next character
        for(; i < expression.length(); i++)
            if(expression.charAt(i) == ' ')
                continue;
            else
                sb.append(expression.charAt(i));

        System.out.println(sb);

        return sb.toString();
    }

     static boolean isIntegerNumber(String expression) {
        for(int i = 0; i < expression.length(); i++){
            Character c = expression.charAt(i);

            if(!"0123456789".contains(c.toString()))
                return false;
        }

        return true;
    }
}
