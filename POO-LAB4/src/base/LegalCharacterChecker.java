package base;

public class LegalCharacterChecker {
    public static boolean areCharactersLegal(String expression){
        String allowedCharacters = "01234567890([{)]}+-*/.";

        for(int i = 0; i < expression.length(); i++){
            Character c = expression.charAt(i);

            if("01234567890([{)]}+-*/".contains(c.toString()))
                continue;
            else
                return false;
        }

        return true;
    }
}
