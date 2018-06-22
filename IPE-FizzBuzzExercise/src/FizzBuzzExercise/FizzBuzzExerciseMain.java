package FizzBuzzExercise;


public class FizzBuzzExerciseMain {

    public static void main(String[] args) {


//*****************************************************************
//FizzBuzz Exercise

        System.out.println("\n++++++++++ FIZZBUZZ EXERCISE ++++++++++\n");

        fizzBuzz();

    }

    private static void fizzBuzz() {

        for (int counter = 1; counter <= 100; counter++){

            String stringResult = "";

            if (counter % 3 == 0){

                stringResult += "Fizz";

            }

            if (counter % 5 == 0){
                stringResult += "Buzz";
            }

            if (stringResult.equals("")){

                stringResult = Integer.toString(counter);
            }

            System.out.println(stringResult);

        }
    }
}

