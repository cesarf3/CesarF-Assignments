public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double vectorC = Math.pow(legA, 2) + Math.pow(legB, 2);
        double result = Math.sqrt(vectorC);
        return result;
    }
}