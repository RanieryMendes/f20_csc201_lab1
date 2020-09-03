import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //store the path for the file that contains the math expressions
        String path_file="/Users/ranierymendes/IdeaProjects/F20_Lab1/src/exprs.txt";
        //initiate an file object
        File math_text = new File(path_file);
        //instantiate scanner that will read input from the text file
        Scanner reader = new Scanner(math_text);

        //create an instance of the Expression class
        Expression calculator = new Expression();

        //read all lines in the txt file
        while (reader.hasNextLine()){

            String expression = reader.nextLine();



            System.out.println(expression);

            double value = calculator.evaluate(expression);

            System.out.println(expression + " =  " + Math.floor(value));

        }

    }
}
