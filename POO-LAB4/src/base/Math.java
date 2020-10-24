package base;

 class Math {
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

   static double pow(double number, int exponent){
        if(exponent == 0){
            return 1.0;
        }

        double base = number;
        boolean isNegative = false;

        if(exponent < 0){
            isNegative = true;
            exponent = -exponent;
        }

        for(int i = 1; i < exponent; i++){
            number *= base;
        }

        if(isNegative == true){
            number = 1.0 / number;
        }

        return number;
    }
}
