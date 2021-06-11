package clearn.code;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTestTest {
void testFizz(){
    int number =3;
    String expected = "fizz";
    String result = FizzBuzz.fizzBuzz(number);
    assertEquals(expected,result);
    }


}