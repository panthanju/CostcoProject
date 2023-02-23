package chapter1;

import java.util.Random;

public class MegaMillions {
    public static void main(String[] args) {
        int firstNumber = randomNumberGenerator(100);
        int secondNumber = randomNumberGenerator(100);
        int thirdNumber = randomNumberGenerator(100);
        int fourthNumber = randomNumberGenerator(100);
        int fifthNumber = randomNumberGenerator(100);
        int sixthNumber = randomNumberGenerator(100);

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
    }

    private static int randomNumberGenerator(int number) {
        Random random = new Random();
        int picked = random.nextInt(number)+1;
        return picked;
    }


}
