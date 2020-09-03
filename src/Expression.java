import java.util.Stack;

public class Expression {

    Stack<Double> stack = new <Double>Stack();

    private double total_value = 10;
    public Expression(){
       total_value = 20;
    };


    public  double evaluate(String sentence){
        //int that will return the expression evaluation
        String whole_expression []= sentence.split(" ");

        double left_value;
        double right_value;

        for (int i =0; i< whole_expression.length; i++){
            System.out.println("This is the value of " + i + " " + whole_expression[i]);
            if(whole_expression[i].isEmpty()){
                System.out.println("This value will be dismissed");
            }
            //store values into the stack
            else{

                if(whole_expression[i].equals( "+") || whole_expression[i].equals( "-") || whole_expression[i].equals( "/") || whole_expression[i].equals( "*" )){

                    System.out.println("It is not a number it is an operator.Let's figure out which operator is");

                    if(whole_expression[i].equals("+")){

                        right_value = stack.pop();
                        left_value = stack.pop();

                       stack.push(left_value + right_value);



                    }
                    else if(whole_expression[i].equals("-")){
                        right_value = stack.pop();
                        left_value = stack.pop();

                        stack.push(left_value - right_value);


                    }

                    else if(whole_expression[i].equals("/")){
                        right_value = stack.pop();
                        left_value = stack.pop();

                        stack.push(left_value / right_value);


                    }

                    else{

                        right_value = stack.pop();
                        left_value = stack.pop();

                        stack.push(left_value * right_value);

                    }



                }

                else{

                    double new_Value = Double.parseDouble(whole_expression[i]);
                    System.out.println("Inserting into the stack");
                    stack.push(new_Value);
                }



            }



        }
        total_value = stack.pop();
        return  total_value;
    };
}
