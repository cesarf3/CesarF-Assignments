public class FizzBuzz {
    public void fizzBuzzTest() {
        for (int i = 1; i <= 45; i++){
            String result = fizzBuzz(i);
            System.out.println("Number is: " + i  + " | " + "Result: " + result);
        }
    }

    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        } 
        else if (number % 3 == 0){
            return "Fizz";
        }
        else {
            return Integer.toString(number);
        }
    }
}
