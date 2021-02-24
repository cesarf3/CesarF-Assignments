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
        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
        ArrayList<Character> arr2 = main.getAlphabet();
        System.out.println(arr2);
        //Generate and return an array with 10 random numbers between 55-100.
        ArrayList<Integer> arr3 = main.randomNums();
        System.out.println(arr3);
        //Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        ArrayList<Integer> arr4 = main.sortRandomNums();
        System.out.println(arr4);
        //Create a random string that is 5 characters long.
        ArrayList<Integer> arr5 = main.randomString();
        System.out.println(arr5);
        
    }
}