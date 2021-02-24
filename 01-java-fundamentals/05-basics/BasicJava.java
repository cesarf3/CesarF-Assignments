import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava{
    // Write a method that prints all the numbers from 1 to 255.
    public ArrayList<Integer> print255(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++){
            myArray.add(i);
        }
        return myArray;
    }
    //Write a method that prints all the odd numbers from 1 to 255.
    public ArrayList<Integer> printOdds(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i < 256; i+=2){
            myArray.add(i);
        }
        return myArray;
    }
    //Write a method that prints the numbers from 0 to 255, but this time print the sum of the numbers that have been printed so far.
    // New number: 0 Sum: 0
    // New number: 1 Sum: 1
    // New number: 2 Sum: 3
    // New number: 3 Sum: 6
    public void sum255(){
        int num = 0;
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            num = i;
            sum += i;
            System.out.println("New number: " + num + " Sum: " + sum);
        }
    }
    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. Being able to loop through each member of the array is extremely important.
    public void iterateArray(){
        int [] myArray = {1,3,5,7,9,13};
        for (int i = 0; i < myArray.length; i++){
            System.out.println(String.format("Number is: %s", myArray[i]));
        }
    }
    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public void findMax(){
        int [] myArray = {-34, -55, -7, -14, -22};
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println(String.format("Max Value: %s", max));
    }
    // Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void getAverage(){
        int [] myArray = {2, -10, 3, 5, -1, 23};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        int average = (sum/myArray.length);
        System.out.println(String.format("Average is: %s", average));
    }
    // Write a method that creates an ArrayList 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
    public ArrayList<Integer> arrayWithOdds(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i < 256; i+=2){
            myArray.add(i);
        }
        return myArray;
    }
    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
    public void greaterThanY(int [] myArray, int y){
        int count = 0;
        for (int number : myArray) {
            if (number > y){
                count ++;
            }
        }
        System.out.println(count);
    }
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
    public void squareValues(int [] myArray){
        for(int i = 0; i < myArray.length; i++) {
			myArray[i] = myArray[i] * myArray[i];	
		}  
        System.out.println(Arrays.toString(myArray));
    }
    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public void eliminateNegativeNumbers(int [] myArray){
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0){
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public void maxMinAvg(int[] myArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            if (myArray[i]>max){
                max = myArray[i];
            }
            if (myArray[i]<min){
                min = myArray[i];
            }
        }
        int average = (sum/myArray.length);
        newArray.add(max);
        newArray.add(min);
        newArray.add(average);
        System.out.println(newArray);
    }
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public void shiftingValues(int[] myArray) {
        for (int i = 1; i < myArray.length; i++){
            myArray[i-1] = myArray[i];
        }
        myArray[myArray.length-1] = 0;
        System.out.println(Arrays.toString(myArray));
    }
}