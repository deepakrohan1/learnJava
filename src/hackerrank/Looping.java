package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by rohan on 3/7/16.
 */
public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int nOfC = sc.nextInt();
        int a = 5;
        int b = 3;
        int n = 5;
        boolean z = true;

//        System.out.println((int)Math.pow( 2 ,10));
        if (n == 0) {
        } else {
            //a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
            int s ;
            int i;

            for ( i = 0; i < n; i++) {
                int temp = 0;
                s = i;
                if(z) {
//                    System.out.println(a+b);
                    z = false;
                }
                while (s >= 0){
                    temp = temp + ((int)Math.pow(2,s)*b);
                    s --;
                }
                System.out.println(a + temp);
                System.out.println("");

            }
        }
    }
}
