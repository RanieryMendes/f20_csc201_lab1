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

            //check if the value in the string is a whitespace, if yes this value will be dismissed and go to loop's next iteration
            if(whole_expression[i].isEmpty()){
                //do nothing and dismiss value
            }
            //store values into the stack
            else{

                //check if the string contains an operator
                if(whole_expression[i].equals( "+") || whole_expression[i].equals( "-") || whole_expression[i].equals( "/") || whole_expression[i].equals( "*" )){

                    //if and else(if) statements to find out which operator is and carry out the math operation


                    if(whole_expression[i].equals("+")){

                        //get the last two values inserted at the top of the stack
                        right_value = stack.pop();
                        left_value = stack.pop();


                       stack.push(left_value + right_value);



                    }
                    else if(whole_expression[i].equals("-")){

                        //get the last two values inserted at the top of the stack
                        right_value = stack.pop();
                        left_value = stack.pop();

                        stack.push(left_value - right_value);


                    }

                    else if(whole_expression[i].equals("/")){

                        //get the last two values inserted at the top of the stack
                        right_value = stack.pop();
                        left_value = stack.pop();

                        stack.push(left_value / right_value);


                    }

                    else{

                        //get the last two values inserted at the top of the stack
                        right_value = stack.pop();
                        left_value = stack.pop();


                        //using the values retrieved from the stack, do the math operation and push the result into the stack
                        stack.push(left_value * right_value);

                    }



                }

                //the value in the string is a number
                else{

                    //convert the number that is in string format into a double variable
                    double new_Value = Double.parseDouble(whole_expression[i]);

                   //push this double at the top of the stack
                    stack.push(new_Value);
                }



            }



        }

        //get the result of the whole expression, which is the last value in the stack
        total_value = stack.pop();
        //return result to main class
        return  total_value;
    };
}
