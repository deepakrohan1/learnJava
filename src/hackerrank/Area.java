package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

/**
 * Created by rohan on 3/7/16.
 */
public class Area {
    static int B, H;
    public static boolean flag;
    static {
        //Scanner sc = new Scanner(System.in);

        try {
            ArrayList<Integer> fin = getValB();
            B = fin.get(0);
            System.out.print("The val of B is "+B);
            H=  fin.get(1);
            System.out.print("The val of H is "+H);
            flag = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public static ArrayList<Integer> getValB() throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> bhValue = new ArrayList<>();


        H = sc.nextInt();
        bhValue.add(H);
        B = sc.nextInt();
        bhValue.add(B);
        // System.out.println(B+"this is val");
        for(int V : bhValue){
            if(V <= 0){
                throw new Exception("Breadth and height must be positive");
            }
        }
        return bhValue;
    }






    public static void main(String[] args) {
    if(flag) {
        int area = B * H;
        System.out.println(area);
    }



    }
}
