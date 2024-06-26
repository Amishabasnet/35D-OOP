package Week1;

public class OperatorClass {
    public static void main(String[] args) {
        /* Arithmetic Operators */
        int a = 10, b = 10;
        int sum = a + b; //here the "+" is an arithmetic operators
        System.out.println("Addition for a+b is " + sum);
        System.out.println("Difference for a-b is " + (a-b));
        System.out.println("Multiplication for axb is " + (a*b));
        System.out.println("Division for a/b is " + (a/b));
        System.out.println("Modulo for a and b is " + (a%2));

        /* Assignment Operators */
        int aNumber1;
        aNumber1 = 10;
        /* or declare and assign */
        int aNumber2 = 20;
        /* assign with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with += " + (aNumber1+=10));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 - 30
        System.out.println("Assignment with -= " + aNumber2);

        /* Relational Operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2?" + (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than rNumber2?" + (rNumber1 > rNumber2));
        System.out.println("rNumber 1 less than or equals to rNumber2?" + (rNumber1<=rNumber2));
        System.out.println("rNumber1 not equals to rNumber2?" + (rNumber1!=rNumber2));


        /* Logical operators */
        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses && " + (lExpression1 && lExpression2));
        System.out.println("Or operator uses || " + (lExpression1 || lExpression2));
        System.out.println("Not operator uses ! " + !(lExpression1));

        /*Unary Operators */
        int uNumber1 = 10;
        uNumber1++; // meaning uNumber1 = uNumber1 + 1;
        System.out.println("Unary for increment is ++" + uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is --" + uNumber1);

        /* Ternary Operator */
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * One line if else, see the given example in if else
         * String output;
         * if(tExpression == true){
         * output = "True statement";
         * }else{
         * outpur = "False statement";
         * }
         */
        String output = tExpression ? "True Statement" : "False Statement";
        /* Here we can assign a string out with one expression
        * if expression is true it will return the value after the "?"
        * if the expression is false it will return the value after the ":
         */
        int numberOutput = tNumber1<tNumber2? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);

        /* Task 1
     * Write a program to print whether a variable is greater or equal to 18
     */
    int rNumber3 = 19;
    System.out.println("rNumber3 greater or equal to 18? " + ( rNumber3 >= 18));

     /* Task 2
      * Write a program to print simple interest from variables
      * Make 3 variable for amount, time and rate and save the calculation into a variable
      * Formula:
      * s1 = amount * time * rate/100;
      */
      int amount = 1000, time = 2, rate = 5;
      System.out.println("Simple Interest is " + ( amount * time * rate/100));
      
      /* Task 3
       * Write a program to print the area and perimeter of rectangle
       * a = l * b
       * p = 2 (l + b)
       */
      int length = 5, breadth = 4;
      System.out.println("the area is " + ( length * breadth ));
      System.out.println("the perimeter is " + ( 2 * (length * breadth)));

      /* Task 4
       * Complete the task 1 using Ternary operators
       */
      int num1 = 18, num2 = 20;
      boolean Expression = num1 == num2;
      String result = Expression ? "True Statement" : "False Statement";
      int numresult = tNumber1<tNumber2? 10 : 20;
        System.out.println(result);
        System.out.println(numresult);




    }
    
}
