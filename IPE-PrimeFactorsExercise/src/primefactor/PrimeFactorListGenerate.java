package primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorListGenerate {

    public Boolean isPrimeNumber(int numberToCheckIfIsPrime) {

        Boolean isPrime = true;

        for (int numberToCheckIfIsAFactor = 2; numberToCheckIfIsAFactor <= numberToCheckIfIsPrime; numberToCheckIfIsAFactor++) { // Starts at 2 because all numbers are divided by 1

            if (isFactorOf(numberToCheckIfIsAFactor, numberToCheckIfIsPrime) && numberToCheckIfIsPrime != numberToCheckIfIsAFactor) { // Because all numbers are divided by themselves
                isPrime = false;
            }
        }
        return isPrime;
    }

    private boolean isFactorOf(int divider, int dividend) {
        return dividend % divider == 0;
    }


    public String generate(int numberToIdentifyAllPrimeFactors) {

        List<String> resultList = new ArrayList<String>();


        for (int numberToCheckIfIsAPrimeFactor = 2; numberToCheckIfIsAPrimeFactor < numberToIdentifyAllPrimeFactors; numberToCheckIfIsAPrimeFactor++) {

            if (isFactorOf(numberToCheckIfIsAPrimeFactor, numberToIdentifyAllPrimeFactors) && isPrimeNumber(numberToCheckIfIsAPrimeFactor)) {

                resultList.add(Integer.toString(numberToCheckIfIsAPrimeFactor));

            }
        }

        return String.join(",", resultList);

    }
}
