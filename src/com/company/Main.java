package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //Strings
        String string = "words";

        //int variables
        int age = 30;

        //reference variables
        int copiedAge = age;

        //floating number
        float price = 10.99F;

        //longer numbers than 1B
        long longNumber = 123_456_789L;

        //boolean
        boolean isLoggedIn = true;

        //using integrated date functions inside of utils
        Date current = new Date();
        //setting variables to contain methods run by the  variable current(utilizing Date methodology)
        long time = current.getTime();

        //Modifying variables
        byte x = 1;
        byte y = 2;
        x = 3;


        //reference types are copies of eachother, they do go together. Updating one, will definitely update the other
        //Point class

        //using new in a reference type may be able to mitigate issues, currently, the below SOUT does give accurate
        // values for both P1 = {3,1) and p2 = (1,1)
        Point point1 = new Point(1,1);
        Point point2 = new Point(point1 );
        point1.x = 3;


        //Strings:
            // String
        String message =  new String("Hello World");
        //concatenate with the +""


        //built in methods message .

        int length = message.length();
        int indexOfH = message.indexOf("d");


        // Strings are immutable....

        //instantiating a reference from a current string instance, modifying, and returning the modifications.
        String replacedWords = new String(
                message.replace(
                        "Hello",
                        "Hola!")
                        + " original: " + message);

        //Escaped characters:
            // a backslash does cool things,
            // \" for quotes
            // \\ for a \
            // \n for new line
            // \t for a tabbed instance

        String quotedThing = new String("Colin is \"cool\"");

        //ARRAYS!!!!
            //storing arrays:
            //instantiate with a fixed length
        int[] numbersArray = new int[5];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[4] = 4;


        //new method of adding things to an array:
        int[] newNumbersArray = {1,2,79,4,5};
        Arrays.sort(newNumbersArray);

        //Arrays.toString(numbersArray) to convert to string, use the Array . to string method.

        //multi-dimentional arrays:
        //2D for matrix, 3D for cube

        // 2x3 matrix
        int[][] matrix = new  int[2][3];
        matrix[0][0] = 1;

        //3rd dimension adds a a pair of the [] brackets.

        //new way:
        // curly braces, same thing as nesting arrays inside of arrays.
        //must use deepToString to be able to view as a string; Compiler points to local memory slot if left blank.
        int [][] newMatrix = {{1,2,3}, {4,5,6} };


        // What about constants?
        //FINAL!
        //use all caps for constants;
        final float pi = 3.14F;

        //Lets do some math:
        double result = (double)10/(double)3;

        //incrementing:
        //++ along with augmented operators +=, -=, *=, /=

        //oop means a lot, */ first, but, wrapping it in parentheses takes first order.


        //Casting: Type conversions
        //small to larger types, can be converted automatically(implicitly)
        //only with compatible types;
        // Byte => short > int> long> float> double
        //what about floats? integer is less precise than a double.
        //int then gets converted to a double => 2 => 2.0

        String smallX = "1";
        int smallY = Integer.parseInt(smallX) +2;

        //Math Class:
        float floatingTest = 1.02F;

        Math.round(floatingTest);//rounding
        double results = Math.floor(1.2F);

        //explicit casting:
        int random = (int)(Math.random()*100);


        //explicitly requesting result:
        //int y = (int)x + 2;
        //return output, SOUT
        System.out.println(random);

    }
}
