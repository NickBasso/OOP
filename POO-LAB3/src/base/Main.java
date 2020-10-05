package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // save input data from the file to the StringBuilder object
        InputStream is = new FileInputStream("src/data/Text.txt");
        Scanner scan = new Scanner(is);
        StringBuilder input = new StringBuilder("");

        while(scan.hasNextLine()){
            StringBuilder part = new StringBuilder(scan.nextLine());
            part.append("\n");
            input.append(part);
        }

        // create and initialize Text object, passing the input from the StringBuilder object
        Text text = new Text(input.toString());

        // check functionality:
        System.out.println("Amount of words: " + text.countWords());
        System.out.println("Amount of letters: " + text.countLetters());
        System.out.println("Amount of vowels: " + text.countVowels());
        System.out.println("Amount of consonants: " + text.countConsonants());
        System.out.println("Longest word: " + text.getLongestWord());
        System.out.println("Length of the word \"multiplication\" is: " + text.getWordLength("multiplication"));
        text.printTopXLongestWords(10);
        System.out.println("The word \"no\" occurs " + text.countWordOccurences("no") + " time(s)");
        text.printTopXPopularWords(5);

        // print the words occurring in the text without duplicates:
        text.printWords();

        // print the text itself
        System.out.println(text.getText());
    }
}
