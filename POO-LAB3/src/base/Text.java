package base;

import java.util.*;
import java.util.stream.Collectors;

public class Text {
    private String text;
    private HashMap<String, Integer> wordFreq;
    private HashMap<String, Integer> wordLen;
    private ArrayList<String> wordsSorted;

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
        return wordLen;
    }

    public void sortWordsAndSaveToArrayList(){
        Set<String> words = wordLen.keySet();
        List<String> wordsSorted = words.stream().collect(Collectors.toList());

        Collections.sort(wordsSorted, Comparator.comparingInt(String::length));
        Collections.reverse(wordsSorted);

        this.wordsSorted = (ArrayList<String>) wordsSorted;
    }

    public String getLongestWord(){
        sortWordsAndSaveToArrayList();

        return wordsSorted.get(0);
    }

    public void printTopXLongestWords(int x){
        if(x > wordsSorted.size()){
            System.out.println("Only " + wordsSorted.size() + " words are available: ");

            for(String s: wordsSorted)
                System.out.println(s);
        } else {
            System.out.println("Top " + x + " longest words:");

            for(int i = 0; i < x; i++)
                System.out.println(wordsSorted.get(i));
        }
    }

    public void printTopXPopularWords(int x){
        Set<String> words = wordLen.keySet();
        List<String> wordsSorted = words.stream().collect(Collectors.toList());

        Collections.sort(wordsSorted, Comparator.comparingInt(s -> wordFreq.getOrDefault(s, 0)));

        Collections.reverse(wordsSorted);

        System.out.println("Top " + x + " most popular words:");
        for(int i = 0; i < x; i++)
            System.out.println(wordsSorted.get(i) + " " + wordFreq.get(wordsSorted.get(i)) + " times");
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

    public int countWordOccurences(String word){
        return wordFreq.getOrDefault(word, 0);
    }

    public int countWords(){
        int count = 0;
        int curLen = 0;
        StringBuilder word = new StringBuilder("");

        for(int i = 0; i < text.length(); i++){

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
        wordFreq.putIfAbsent(word, 0);
        wordFreq.put(word, wordFreq.get(word) + 1);
    }

    public int getWordLength(String word){
        //return wordLen.get(word);
        return wordLen.getOrDefault(word, 0);
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
