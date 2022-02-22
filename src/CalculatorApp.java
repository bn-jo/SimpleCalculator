import jdk.jfr.consumer.RecordedClassLoader;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
    char operator;
    Double Num1,Num2, result ;

    Scanner userInput = new Scanner (System.in) ;

       String condition = "";
        while (!condition.equals("q")) {

            System.out.println("Chose operator " + " + " + " - " + " * " + " / ");
            operator = userInput.next().charAt(0);

            System.out.println("Enter Number");
            Num1 = userInput.nextDouble();

            System.out.println("Enter another Number");
            Num2 = userInput.nextDouble();
            System.out.println();




            switch (operator) {
                case '+':
                    result = Num1 + Num2;
                    System.out.println(result);
                    break;

                case '-':
                    result = Num1 - Num2;
                    System.out.println(result);

                    break;
                case '*':
                    result = Num1 * Num2;
                    System.out.println(result);
                    break;

                case '/':
                    result = Num1 / Num2;
                    System.out.println(result);
                    break;



                default:
                    System.out.println("Invalid");

            }


            System.out.println("Enter a number or q to quit");
            condition = userInput.next();
        }
    userInput.close();

    }


}