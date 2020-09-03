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

        //read all lines in the txt file. It reads the file while there are lines in it
        while (reader.hasNextLine()){

            //read just a line of the file
            String expression = reader.nextLine();

            //store in a double the evalution that is the result of the math operation
            double value = calculator.evaluate(expression);

            //print to the user the math operation in postfix style and its consequent result
            System.out.println(expression + " =  " + Math.floor(value));

        }

    }
}
