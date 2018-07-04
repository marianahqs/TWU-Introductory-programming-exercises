package primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorListGenerate {

    public Boolean isPrimeNumber(int numberToCheckIfPrime) {
        Boolean isPrime = true;

        for (int numberToCheckIfAFactor = 2; numberToCheckIfAFactor < numberToCheckIfPrime; numberToCheckIfAFactor++) {
            if (isFactorOf(numberToCheckIfAFactor, numberToCheckIfPrime)) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    private boolean isFactorOf(int divider, int dividend) {
        return dividend % divider == 0;
    }

    public String generate(int numberToIdentifyAllPrimeFactors) {
        List<String> resultList = new ArrayList<>();

        for (int numberToCheckIfAPrimeFactor = 2; numberToCheckIfAPrimeFactor < numberToIdentifyAllPrimeFactors; numberToCheckIfAPrimeFactor++) {
            if (isFactorOf(numberToCheckIfAPrimeFactor, numberToIdentifyAllPrimeFactors) && isPrimeNumber(numberToCheckIfAPrimeFactor)) {
                resultList.add(Integer.toString(numberToCheckIfAPrimeFactor));
            }
        }
        return String.join(",", resultList);
    }
}
