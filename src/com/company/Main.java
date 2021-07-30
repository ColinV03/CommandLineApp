package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

//        //Strings
//        String string = "words";
//
//        //int variables
//        int age = 30;
//
//        //reference variables
//        int copiedAge = age;
//
//        //floating number
//        float price = 10.99F;
//
//        //longer numbers than 1B
//        long longNumber = 123_456_789L;
//
//        //boolean
//        boolean isLoggedIn = true;
//
//        //using integrated date functions inside of utils
//        Date current = new Date();
//        //setting variables to contain methods run by the  variable current(utilizing Date methodology)
//        long time = current.getTime();
//
//        //Modifying variables
//        byte x = 1;
//        byte y = 2;
//        x = 3;
//
//
//        //reference types are copies of eachother, they do go together. Updating one, will definitely update the other
//        //Point class
//
//        //using new in a reference type may be able to mitigate issues, currently, the below SOUT does give accurate
//        // values for both P1 = {3,1) and p2 = (1,1)
//        Point point1 = new Point(1,1);
//        Point point2 = new Point(point1 );
//        point1.x = 3;
//
//
//        //Strings:
//            // String
//        String message =  new String("Hello World");
//        //concatenate with the +""
//
//
//        //built in methods message .
//
//        int length = message.length();
//        int indexOfH = message.indexOf("d");
//
//
//        // Strings are immutable....
//
//        //instantiating a reference from a current string instance, modifying, and returning the modifications.
//        String replacedWords = new String(
//                message.replace(
//                        "Hello",
//                        "Hola!")
//                        + " original: " + message);
//
//        //Escaped characters:
//            // a backslash does cool things,
//            // \" for quotes
//            // \\ for a \
//            // \n for new line
//            // \t for a tabbed instance
//
//        String quotedThing = new String("Colin is \"cool\"");
//
//        //ARRAYS!!!!
//            //storing arrays:
//            //instantiate with a fixed length
//        int[] numbersArray = new int[5];
//        numbersArray[0] = 1;
//        numbersArray[1] = 2;
//        numbersArray[4] = 4;
//
//
//        //new method of adding things to an array:
//        int[] newNumbersArray = {1,2,79,4,5};
//        Arrays.sort(newNumbersArray);
//
//        //Arrays.toString(numbersArray) to convert to string, use the Array . to string method.
//
//        //multi-dimentional arrays:
//        //2D for matrix, 3D for cube
//
//        // 2x3 matrix
//        int[][] matrix = new  int[2][3];
//        matrix[0][0] = 1;
//
//        //3rd dimension adds a a pair of the [] brackets.
//
//        //new way:
//        // curly braces, same thing as nesting arrays inside of arrays.
//        //must use deepToString to be able to view as a string; Compiler points to local memory slot if left blank.
//        int [][] newMatrix = {{1,2,3}, {4,5,6} };
//
//
//        // What about constants?
//        //FINAL!
//        //use all caps for constants;
//        final float pi = 3.14F;
//
//        //Lets do some math:
//        double result = (double)10/(double)3;
//
//        //incrementing:
//        //++ along with augmented operators +=, -=, *=, /=
//
//        //oop means a lot, */ first, but, wrapping it in parentheses takes first order.
//
//
//        //Casting: Type conversions
//        //small to larger types, can be converted automatically(implicitly)
//        //only with compatible types;
//        // Byte => short > int> long> float> double
//        //what about floats? integer is less precise than a double.
//        //int then gets converted to a double => 2 => 2.0
//
//        String smallX = "1";
//        int smallY = Integer.parseInt(smallX) +2;
//
//        //Math Class:
//        float floatingTest = 1.02F;
//
//        Math.round(floatingTest);//rounding
//        double results = Math.floor(1.2F);
//
//        //explicit casting:
//        int random = (int)(Math.random()*100);
//
//
//        //explicitly requesting result:
//        //int y = (int)x + 2;
//
//
//        //lets format numbers!
//        //must create instance, cant do: NumberFormat currency = new NumberFormat(); <= Wont allow it to go forward.
//        // See below:
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String currencyResult = currency.format(1234567.891);
//
//        //percent: .getPercentInstance();
//        //start with decimal spot
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String percentResult = percent.format(0.12);
//
//        //        Rename objects fast! Shift + F6, under selection > refactor > rename, can rename all code instances,
//        // or all instances.
//
//        //method chaining: Can do just like in JS: NumberFormat.getPercentInstance().format(0.12)
//        // Line 159-160 can be rewritten as: String percent = NumberFormat.getPercentInstance().format(variable);
//
//
//
//
//        //LETS GET SOME INPUT!
//            //SCANNER!
//        Scanner scanner = new Scanner(System.in); //Where to get data from:
////        System.out.print("Your Age? ");
////        byte inputAge = scanner.nextByte();//can only read input of byte value. No floats/string
//
//        //for some reason, it only works one input at a time.
//
//        System.out.print("Your name?:");
//        String inputName = scanner.nextLine().trim(); //next method only gets one "Token", considered by whitespaces. use nextLine();
//
//        System.out.println("hi " + inputName);
//
//        //return output, SOUT
////        System.out.println("You are: " + inputAge);


        //My solution: Not functional yet.
////        constants:
        final byte monthsInYear = 12;
        final byte percent = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

// initialize scanner:
        Scanner scanner = new Scanner(System.in);

//  Inputs:
        while(true){
            System.out.print("Your principal value(between $1000 and $100M): ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 100000000){
                break;
            }
            System.out.println("Enter a value between 1000 and 100,000,000");
        }
        while(true){
            System.out.print("Your Annual Interest Rate: ");
            float annualInterest =  scanner.nextFloat();
            if(annualInterest >= 1 && annualInterest <= 30){
                monthlyInterest = annualInterest / percent / monthsInYear;
                break;
            }
            System.out.println("Please enter a value between 1% and 30%");

        }

        while (true){
            System.out.print("Period(years): ");
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments = years * monthsInYear;
                break;
            }
            System.out.println("Please enter value between 1 and 30");

        }




//        System.out.print("Your Term in Years: ");
//        int termLengthYears = scanner.nextInt();
//        int termMonths = (termLengthYears * monthsInYear);

        //top, bottom of equation:
//        double topValue = ;
//        double bottomValue = (;

        double mortgage = principal * ( (monthlyInterest * Math.pow((monthlyInterest + 1), numberOfPayments))/(Math.pow(monthlyInterest + 1, numberOfPayments) - 1));


        //return
//        String currency = NumberFormat.getCurrencyInstance().format(principal);
//        String apr = DecimalFormat.getPercentInstance().format(annualInterest);
        String finalValue = NumberFormat.getCurrencyInstance().format(mortgage);



        //Input fields:
    System.out.println(
//            "Principle: " + currency +
//                    "\nAPR: " + annualInterest + "\n " + apr +
//                    "\nTerm Length in Years: " +
//                    termLengthYears +
//                    "\n(Months)" + termMonths +
//            "\nMonthly %:"+  monthlyInterest +
            "\nCalculated mortgage value: " + finalValue);



        //Operators, conditionals, etc'
//       if/else's
//        int tempC = 21;
//        boolean willRain = true;
//        boolean isWindy = false;
//        if(tempC > 20){
//            if(willRain || isWindy){
//                System.out.println("You need it!");
//            }else{
//                System.out.println("Enjoy the day!");
//            }
//        }

//        lets use Ternary! evaluate ? true: false

//        and SWITCH WORKS TOO! a
//        String role = "admin";
//
//        switch (role){
//            case "admin":
//                System.out.println("is an Admin!");
//                break;
//            case "moderator":
//                System.out.println("is a Moderator!");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }


//        LETS DO FIZZBUZZ
//        if input number is divisible by 5: fizz, 3: buzz, 15: fizzbuzz, else return number!
//
//        Scanner scanner = new Scanner(System.in); //Where to get data from:
//        System.out.print("Number? ");
//        int number = scanner.nextInt();
//
//
//
//            if(number % 15 == 0){
//                System.out.println("FIZZBUZZ");
//            }else if(number % 5 == 0){
//                System.out.println("Fizz");
//            }else if(number % 3 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(number);
//            }


//         FOR LOOPS:
//        for (int i = 0; i< 10; i++){
//            System.out.println("hello World!" + i);
//        }

//        While Loop:
//         int i = 0;
//         while(i >= 0 && i < 10){
//             i++;
//             System.out.println("Hello While! " + i);
//         }

//        Scanner scanner  = new Scanner(System.in);
//        String input = "";
//        while (!input.equals("quit")) {
//            System.out.print("input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//
//        }
//        DO WHILE: Same as while, but executes AT LEAST ONCE!
//        do{

//          DOES SOMETHING:
//        }while ();


//        Break will end the function RIGHT where the break occurs, would not continue.
//        Continue will restart at beginning of loop.


//        FOR EACH LOOPS:

//        specifically for arrays:
//        String[] fruits = {"apple", "Bananas", "Oranges"};
//        for (String fruit: fruits
//             ) {
//            System.out.println(fruit);
//
//        }



    }
}
