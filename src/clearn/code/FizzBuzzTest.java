package clearn.code;

public class FizzBuzzTest {
    public static String FizzBuzzTest(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz & isBuzz) {
            return "FizzBuzz";
        }
        if (isBuzz) {
            return "isBuzz";
        }
        if (isFizz) {
            return "isFizz";
        }
        return number+" ";
    }

}
