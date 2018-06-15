package com.company;


public class Main {

    public static void main(String[] args) {


//*****************************************************************
//FizzBuzz Exercise

        System.out.println("\n++++++++++ FIZZBUZZ EXERCISE ++++++++++");

        FizzBuzz();

    }

    private static void FizzBuzz() {

        for (int i = 1; i < 100; i++){

            String ch = "";

            if (i%3==0){

                ch += "Fizz";

            }
            if (i%5==0){
                ch += "Buzz";
            }

            if (ch==""){
                ch = Integer.toString(i);
            }

            System.out.println(ch+"\n");
        }
    }
}
