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
    //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    public ArrayList<Character> getAlphabet(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++){
            alphabet.add(i);
        }
        Collections.shuffle(alphabet);
        System.out.println("Last letter is: " + alphabet.get(25));
        System.out.println("First letter is: " + alphabet.get(0));
        if (alphabet.get(0) == 'a'){
            System.out.println("The first letter is a vowel!");
        }
        else if (alphabet.get(0) == 'e'){
            System.out.println("The first letter is a vowel!");
        }
        else if (alphabet.get(0) == 'i'){
            System.out.println("The first letter is a vowel!");
        }
        else if (alphabet.get(0) == 'o'){
            System.out.println("The first letter is a vowel!");
        }
        else if (alphabet.get(0) == 'u'){
            System.out.println("The first letter is a vowel!");
        }
        return alphabet;
    }
    //Generate and return an array with 10 random numbers between 55-100.
    public ArrayList<Integer> randomNums(){
        Random r = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 55; i <= 100; i++){
            arr.add(i);
        }
        for (int i = 0; i < 10; i++){
            int randomNum = r.nextInt(45);
            newArr.add(arr.get(randomNum));
        }
        return newArr;
    }
    //Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public ArrayList<Integer> sortRandomNums(){
        Random r = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 55; i <= 100; i++){
            arr.add(i);
        }
        for (int i = 0; i < 10; i++){
            int randomNum = r.nextInt(45);
            newArr.add(arr.get(randomNum));
        }
        Collections.sort(newArr);
        System.out.println(newArr);
        int min = newArr.get(0);
        int max = newArr.get(9);
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        return newArr;
    } 
    //Create a random string that is 5 characters long.
    public void randomString(){
        //call the random method
        Random r = new Random();
        //create the alphabet array
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char i = 'a'; i <= 'z'; i++){
            alphabet.add(i);
        }
        //create a string of five characters
        Character [] FiveCharacterArray = new Character [5];
        for (int i = 0; i < 5; i++){
            int randonNum = r.nextInt(26);
            FiveCharacterArray[i] = alphabet.get(randonNum);
        }
        System.out.println(Arrays.toString(FiveCharacterArray));
    }
    //Generate an array with 10 random strings that are each 5 characters long

}