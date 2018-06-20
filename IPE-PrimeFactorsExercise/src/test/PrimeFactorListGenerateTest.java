package test;

import PrimeFactor.PrimeFactorListGenerate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorListGenerateTest {

    PrimeFactorListGenerate primeFactorListGenerateTest = new PrimeFactorListGenerate();


    @Test
    public void isPrimeFactorTest(){
        Assertions.assertTrue(primeFactorListGenerateTest.isPrimeFactor(2));
        Assertions.assertTrue(primeFactorListGenerateTest.isPrimeFactor(3));
        Assertions.assertTrue(primeFactorListGenerateTest.isPrimeFactor(5));

        Assertions.assertFalse(primeFactorListGenerateTest.isPrimeFactor(4));
        Assertions.assertFalse(primeFactorListGenerateTest.isPrimeFactor(6));
        Assertions.assertFalse(primeFactorListGenerateTest.isPrimeFactor(15));

    }

    @Test
    public void generateTest(){

        String generateTest01 = primeFactorListGenerateTest.generate(1);
        String messageTest01 = String.format("The result was: %s. Expected: ", generateTest01);
        Assertions.assertTrue(generateTest01.equals(""), messageTest01);

        String generateTest02 = primeFactorListGenerateTest.generate(30);
        String messageTest02 = String.format("The result was: %s. Expected: 2,3,5", generateTest02);
        Assertions.assertTrue(generateTest02.equals("2,3,5"), messageTest02);


        String generateTest03 = primeFactorListGenerateTest.generate(51);
        String messageTest03 = String.format("The result was: %s. Expected: 3,17", generateTest03);
        Assertions.assertTrue(generateTest03.equals("3,17"), messageTest03);
    }
}
