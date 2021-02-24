import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava {
    //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public ArrayList<Integer> printSum(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum+= arr[i];
            if (arr[i]>10){
                newArray.add(arr[i]);
            }
        }
        System.out.println("The Sum is: " + sum);
        return newArray;
    }
    //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
    public ArrayList<String> shuffle(String[] array){
        ArrayList<String> firstArray = new ArrayList<String>();
        ArrayList<String> newArray = new ArrayList<String>();
        for(int i = 0; i < array.length; i++){
            if(array[i].length() > 5){
                newArray.add(array[i]);
            }
            firstArray.add(array[i]);
        }
        Collections.shuffle(firstArray);
        System.out.println(firstArray);
        return newArray;
    }
}