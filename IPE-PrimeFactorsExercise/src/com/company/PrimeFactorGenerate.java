package com.company;

public class PrimeFactorGenerate {

    public Boolean isPrimeFactor(int number) {

        for (int divisor = 2; divisor <= number; divisor++) {

            if (isDivisiveBy(number, divisor)) {
                break;

            } else if (number == divisor) {
                return true;

            }
        }

        return false;
    }

    private boolean isDivisiveBy(int dividend, int divisor) {
        return dividend != divisor && dividend % divisor == 0;
    }


    public String generate(int number) {

        String result = "";

        for (int i=1; i<number;i++){

            if(number%i == 0 && isPrimeFactor(i)){

                result += Integer.toString(i) +",";

            }
        }

        if (result.length()>1){
            result = result.substring(0,result.length()-1); // Removes the last comma from the result

        }
        return result;
    }
}
