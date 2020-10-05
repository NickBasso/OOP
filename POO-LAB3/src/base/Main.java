package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new FileInputStream("src/data/Text.txt");
        Scanner scan = new Scanner(is);
        StringBuilder input = new StringBuilder("");

        while(scan.hasNextLine()){
            StringBuilder part = new StringBuilder(scan.nextLine());
            part.append("\n");
            input.append(part);
        }

        Text text = new Text(input.toString());

        System.out.println(text.getText());

        System.out.println("Amount of words: " + text.countWords());
        System.out.println("Amount of letters: " + text.countLetters());
        System.out.println("Amount of vowels: " + text.countVowels());
        System.out.println("Amount of consonants: " + text.countConsonants());

        System.out.println("\nWords:");
        text.printWords();



        System.out.println();
    }
}
