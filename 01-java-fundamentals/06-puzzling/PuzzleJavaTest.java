import java.util.Arrays;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava main = new PuzzleJava();
        //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
        ArrayList<Integer> arr = main.printSum();
        System.out.println(arr);

        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
        String [] array = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(main.shuffle(array));
    }
}