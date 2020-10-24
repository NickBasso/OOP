package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

 class Input {
    private String directory;
    private StringBuilder input;
    private ArrayList<String> expression;

     Input(String directory) throws FileNotFoundException {
        this.directory = directory;
        input = new StringBuilder();
        expression = new ArrayList<>();

        readDataFromFile(directory);
    }

    private void readDataFromFile(String directory) throws FileNotFoundException {
        File inputFile = new File(directory);
        Scanner scanner = new Scanner(inputFile);

        while(scanner.hasNextLine()){
            StringBuilder s = new StringBuilder(scanner.nextLine());

            expression.add(s.toString());

            s.append("\n");
            input.append(s);
        }
    }

     String returnInputFromFileAsString(){
        return input.toString();
    }

     ArrayList<String> returnExpressionArrayList(){
        return expression;
    }
}
