package base;

import java.util.HashMap;

public class Text {
    private String text;
    private HashMap<String, Integer> wordFreq;
    private HashMap<String, Integer> wordLen;

    public Text(String text){
        this.text = text;
        this.wordFreq = new HashMap<>();
        this.wordLen = new HashMap<>();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HashMap<String, Integer> getDictionary(){
        return wordFreq;
    }

    public void printWords(){
        System.out.println("Words: ");

        for(String word: wordLen.keySet())
            System.out.println(word);
    }

    public int countLetters(){
        int count = 0;

        for(int i = 0; i < text.length(); i++)
            if(Character.isLetter(text.charAt(i)))
                count++;

        return count;
    }

    public int countVowels(){
        int count = 0;

        for(int i = 0; i < text.length(); i++)
            if(isVowel(text.charAt(i)) == true)
                count++;

        return count;
    }

    public int countConsonants(){
        int count = 0;

        for(int i = 0; i < text.length(); i++)
            if(isConsonant(text.charAt(i)) == true)
                count++;

        return count;
    }
    public int countWords(){
        int count = 0;
        int curLen = 0;
        StringBuilder word = new StringBuilder("");

        for(int i = 1; i < text.length(); i++){

            if(Character.isLetter(text.charAt(i))){
                word.append(text.charAt(i));
                curLen++;
                continue;
            } else if(curLen > 0) {
                count++;
                addWord(word.toString());
            }

            curLen = 0;
            word = new StringBuilder("");
        }

        return count;
    }

    public void addWord(String word){
        wordLen.putIfAbsent(word, word.length());
    }

    private boolean isVowel(Character letter) {
        StringBuilder vowels = new StringBuilder("AEIOVY");
        letter = Character.toUpperCase(letter);

        for(int i = 0; i < vowels.length(); i++)
            if(vowels.charAt(i) == letter)
                return true;

        return false;
    }

    private boolean isConsonant(char letter) {
        StringBuilder consonants = new StringBuilder("QWRTPSDFGHJKLZXCBNM");
        letter = Character.toUpperCase(letter);

        for (int i = 0; i < consonants.length(); i++)
            if (consonants.charAt(i) == letter)
                return true;

        return false;
    }

}
