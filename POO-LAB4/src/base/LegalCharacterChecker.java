package base;

class LegalCharacterChecker {
    static boolean areCharactersLegal(String expression){
        for(int i = 0; i < expression.length(); i++){
            Character c = expression.charAt(i);

            if("01234567890()+-*/^.sincotarq".contains(c.toString()))
                continue;
            else
                return false;
        }

        return true;
    }
}
