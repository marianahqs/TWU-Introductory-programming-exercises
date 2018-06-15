package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//*****************************************************************
//Prime Factors Exercise

        System.out.println("\n++++++++++ PRIME FACTPRS EXERCISE ++++++++++");

        Scanner keypad = new Scanner(System.in);

        System.out.print("\nType a number: ");

        int npfe = Integer.parseInt(keypad.nextLine());

        generate(npfe);


    }

    private static void generate(int n) {

            String ch = "";

            for (int i=1; i<n;i++){

                if(n%i == 0){

                    for (int a=2; a<= i;a++){
                        if(i!=a && i%a == 0){
                            break;
                        } else if (a==i){
                            ch += Integer.toString(i)+",";
                        }
                    }
                }

            }
        System.out.println(ch);

        }
    }

