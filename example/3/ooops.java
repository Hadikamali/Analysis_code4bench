import java.util.ArrayList;

import java.util.Scanner;



public class ooops {

    public static void main (String args[]){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int k = in.nextInt();

        if (n==1 & k==10)System.out.println(-1);

        else{

            String res = "";

            if (k==10){

                res = "" + 1;

                for (int i = 0; i < n-1; i++) {

                    res = res + "0";

                }

                System.out.println(res);

            }

            else{

                for (int i = 0; i < n; i++) {

                    res = res + k;

                }

                System.out.println(res);

            }

        }



    }

}