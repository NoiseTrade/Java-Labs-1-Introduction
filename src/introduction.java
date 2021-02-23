/*
David McClung
Java Labs 1 - introduction
"Starting from the start....... Again"
23/02/21
https://open.spotify.com/artist/1Gz4eaCY3apix9Wd9wBznb?si=tjAw0pYdTheXri_mjRjg4g
 */

import java.util.Scanner;
public class introduction {
    public static void main(String[] args) {

        /*
        these are introductory snippets of code to help me learn. I have done these before but I am now doing them again
        with the knowledge I have acquired since starting the course. I might be able to look at these in the future and use
        them in other parts of coding. For now it's just good practice.

        Disclaimer**
        This is pretty messy being dumped into one class like this but for now I am doing this rather than splitting them into individual files.
         */

        //1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Steve Jobs");
        //how I would do this
        System.out.println("Hello\nSteve Jobs");

        //2. Write a Java program to print the sum of two numbers.
        //the brackets surrounding the two numbers indicates that it is a sum
        System.out.println("74 + 36 = " + (74+36));

        //3.Write a Java program to divide two numbers and print on the screen.
        System.out.println("50 / 3 = " + (50/3));

        //4. Write a Java program to divide two numbers, using input from the user, and print on the screen.
        //import the scanner tool with import java.util.Scanner above the class
        //This line of code makes a scanner object. sc is now the object for the scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("input two numbers to divide\nInput first number");

        //declaring variable firstNum is the next user input on the keyboard
        int firstNum = sc.nextInt();
        System.out.println("input second number");

        //declaring variable secondNum is the next user input on the keyboard
        int secondNum = sc.nextInt();

        //variable result is then declared by dividing the first user number by the second user number
        //this won't work 100% perfectly as division can have decimal points but using integers it won't really
        int result = firstNum / secondNum;

        System.out.println("Result = " + result);

        //5. Write a Java program to print the result of the following operations.

        //These maths operators need to be split into their correct categories of being solved.
        //like normals Maths!
        System.out.println((-5 +8 * 6));
        System.out.println((55+9) % 9);
        System.out.println(20 + (-3*5) /8);

        //best example is this one 5 + (15/3) * 2 - (8 % 3)
        System.out.println(5 + (15/3) * 2 - (8%3));

        //6. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        System.out.println("Please enter number for multiplication table");
        int multiplication = sc.nextInt();

        //for loop given the parameters will loop until stopped
        // int i = 1; for example here the variable i has been initialised at 1
        //i <=10; this will loop until it has reached up to the number 10
        for(int i = 1; i <=10; i++){
            //using the user input number plus the for loop I can create a multiplication table
            //formatting this system out - variable i will cycle and output 1-10
            //multiplication will be the user input
            System.out.println(i + " * " + multiplication + " = " + (i * multiplication));
        }

        //7. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        //simple program that works out the average of three numbers
        //just needs user input plus a the formula to work out averages which is num1 + num2 + num3 / 3
        System.out.println("input three numbers to work out the average\nFirst number");
        int num1 = sc.nextInt();
        System.out.println("Second number");
        int num2 = sc.nextInt();
        System.out.println("Third number");
        int num3 = sc.nextInt();

        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average = " + average);

    //8. Write a Java program to print the area and perimeter of a rectangle.
        //expected output should be
        // area = 47.60
        // perimeter = 28.20
        //Float variables need f at the end to declare as a float or it might get confused with a double!

        float width = 5.6f;
        float height = 8.5f;

        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);

        // 9. Write a Java program to swap two variables.

        int a,b,swap;

        //declaring initial variables
        a = 10;
        b = 30;

        System.out.println("Before the swap, A = " + a + "\nB = " + b);

        // here we use the variable swap to store a temporary variable.
        swap = a;
        a = b;
        b = swap;

        System.out.println("Now A = " + a);
        System.out.println("Now B = " +b);


        // I bet there is a better way to do this / maybe easier ?


        // 10. Write a Java program to convert pounds(£) to euros(€).

        // declare variables, using float to get my decimal points

        float amount,euro;
        System.out.println("Enter amount to convert £ to € ");
        amount = sc.nextFloat();

        // this is the amount the euro is to the pound on 23/02/21 ;)
        euro = amount * 0.86f;

        System.out.println("£" + amount + " converts to €" + euro);

    }
}
