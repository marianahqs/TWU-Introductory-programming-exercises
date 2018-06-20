package PrimeFactor;

public class PrimeFactorListGenerate {

    public Boolean isPrimeFactor(int numberToCheck) {

        Boolean returnVar = true;

        for (int divider = 2; divider <= numberToCheck; divider++) { // Starts at 2 because all numbers are divided by 1

            if (isDivisibleBy(numberToCheck, divider) && numberToCheck != divider) { // Because all numbers are divided by themselves
                returnVar = false;
            }
        }
        return returnVar;
    }

    private boolean isDivisibleBy(int dividend, int divider) {
        return dividend % divider == 0;
    }


    public String generate(int numberInserted) {

        String resultString = "";

        for (int numberToCheck=2; numberToCheck < numberInserted; numberToCheck++){ // Starts at 2 becaus 1 is not supposed to be checked

            if(isDivisibleBy(numberInserted, numberToCheck) && isPrimeFactor(numberToCheck)) {

                resultString += Integer.toString(numberToCheck) +",";

            }
        }

        if (resultString.length()>1){
            resultString = resultString.substring(0,resultString.length()-1); // Removes the last comma from the result

        }
        return resultString;
    }
}
