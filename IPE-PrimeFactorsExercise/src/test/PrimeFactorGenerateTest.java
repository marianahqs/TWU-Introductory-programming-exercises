package test;

import com.company.PrimeFactorGenerate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorGenerateTest {

    PrimeFactorGenerate primeFactorGenerateTest = new PrimeFactorGenerate();


    @Test
    public void isPrimeFactorTest(){
        Assertions.assertTrue(primeFactorGenerateTest.isPrimeFactor(2));
        Assertions.assertTrue(primeFactorGenerateTest.isPrimeFactor(3));
        Assertions.assertTrue(primeFactorGenerateTest.isPrimeFactor(5));

        Assertions.assertFalse(primeFactorGenerateTest.isPrimeFactor(1));
        Assertions.assertFalse(primeFactorGenerateTest.isPrimeFactor(4));
        Assertions.assertFalse(primeFactorGenerateTest.isPrimeFactor(6));

    }

    @Test
    public void generateTest(){

        String generate = primeFactorGenerateTest.generate(30);
        String message = String.format("O resultado foi: %s", generate);
        Assertions.assertTrue(generate.equals("2,3,5"), message);

    }
}
