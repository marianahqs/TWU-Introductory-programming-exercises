package test;

import primefactor.PrimeFactorListGenerate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorListGenerateTest {

    PrimeFactorListGenerate primeFactorListGenerateTest = new PrimeFactorListGenerate();


    @Test
    public void isPrimeFactorTest(){
        Assertions.assertTrue(primeFactorListGenerateTest.isPrimeNumber(2));
        Assertions.assertTrue(primeFactorListGenerateTest.isPrimeNumber(3));
        Assertions.assertTrue(primeFactorListGenerateTest.isPrimeNumber(5));

        Assertions.assertFalse(primeFactorListGenerateTest.isPrimeNumber(4));
        Assertions.assertFalse(primeFactorListGenerateTest.isPrimeNumber(6));
        Assertions.assertFalse(primeFactorListGenerateTest.isPrimeNumber(15));

    }

    @Test
    public void generateTest(){

        String generateTest01 = primeFactorListGenerateTest.generate(1);
        String messageTest01 = String.format("The result was: %s. Expected: ", generateTest01);
        Assertions.assertEquals("", generateTest01, messageTest01);

        String generateTest02 = primeFactorListGenerateTest.generate(30);
        String messageTest02 = String.format("The result was: %s. Expected: 2,3,5", generateTest02);
        Assertions.assertEquals("2,3,5", generateTest02, messageTest02);


        String generateTest03 = primeFactorListGenerateTest.generate(51);
        String messageTest03 = String.format("The result was: %s. Expected: 3,17", generateTest03);
        Assertions.assertEquals("3,17", generateTest03, messageTest03);
    }
}
