package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//*****************************************************************
//Isosceles Triangle

        System.out.println("\n++++++++++ ISOSCELES TRIANGLE ++++++++++");

        Scanner keypad = new Scanner(System.in);

        System.out.print("\nType a number: ");

        int nit = Integer.parseInt(keypad.nextLine());


        for (int i = 0; i < nit; i++ ){

            String ch = "";

            for (int a=0; a<(nit + i);a++){   //Loop to build string

                if (i==(nit-1)) {
                    ch += "*";  // If it is the last string it has only *

                } else if (a < (nit-i-1)){
                    ch += " ";  // If it is the start of the string it has white spaces

                } else {

                    ch += "*"; // The last characters must be *
                }

            }


            System.out.print(ch+"\n");

        }


//*****************************************************************
//Diamond

        System.out.println("\n\n++++++++++ DIAMOND ++++++++++");

        System.out.print("\nType a number: ");

        int nd = Integer.parseInt(keypad.nextLine());

        int max = nd+(nd-1); // Number of characters of the largest line

        for (int i = 0; i < max; i++ ){

            String ch = "";

            for (int a=0; a<(nd + i);a++){   //Loop to build string

                if (i==(nd-1)) {
                    ch += "*";  // If it is the last string it has only *

                } else if (a < (nd-i-1) || a <= (i-nd)){
                    ch += " ";  // If it is the start of the string it has white spaces

                } else if (i<nd || a < (max - (i-nd+1))){

                    ch += "*"; // The last characters must be *
                }

            }


            System.out.print(ch+"\n");

        }


//*****************************************************************
//Diamond with Name

        System.out.println("\n\n++++++++++ DIAMOND WITH NAME ++++++++++");

        System.out.print("\nType a number: ");

        int ndn = Integer.parseInt(keypad.nextLine());

        int maxDN = ndn+(ndn-1); // Number of characters of the largest line

        for (int i = 0; i < maxDN; i++ ){

            String ch = "";

            for (int a=0; a<(ndn + i);a++){   //Loop to build string

                if (i==(ndn-1)) {

                    ch = "Mari";  // If it is the last string it has only *

                } else if (a < (ndn-i-1) || a <= (i-ndn)){
                    ch += " ";  // If it is the start of the string it has white spaces

                } else if (i<ndn || a < (maxDN - (i-ndn+1))){

                    ch += "*"; // The last characters must be *
                }

            }


            System.out.print(ch+"\n");


        }


    }
}
