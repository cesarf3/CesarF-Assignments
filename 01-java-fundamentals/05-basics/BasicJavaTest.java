import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava numbers = new BasicJava();
        // Print 1-255
        ArrayList<Integer> methodOne = numbers.print255();
        System.out.println(methodOne);
        // Print odd numbers between 1-255
        ArrayList<Integer> methodTwo = numbers.printOdds();
        System.out.println(methodTwo);
        // Print Sum
        numbers.sum255();
        // Iterating through an array
        numbers.iterateArray();
        // Find Max
        numbers.findMax();
        // Get Average
        numbers.getAverage();
        // Array with Odd Numbers
        ArrayList<Integer> methodThree = numbers.arrayWithOdds();
        System.out.println(methodThree);
        //Greater Than Y
        int [] myArray = {1, 3, 5, 7};
        numbers.greaterThanY(myArray, 3);
        // Square the values
        int [] myArray2 = {1, 5, 10, -2};
        numbers.squareValues(myArray2);
        // Eliminate Negative Numbers
        int [] myArray3 = {1, 5, 10, -2};
        numbers.eliminateNegativeNumbers(myArray3);
        // Max, Min, and Average
        int [] myArray4 = {1, 5, 10, -2};
        numbers.maxMinAvg(myArray4);
        // Shifting the Values in the Array
        int [] myArray5 = {1, 5, 10, 7, -2};
        numbers.shiftingValues(myArray5);
    }
}