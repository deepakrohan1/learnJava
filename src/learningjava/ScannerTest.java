package learningjava;

import java.util.Scanner;

/**
 * Created by rohan on 3/6/16.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y = sc.nextLine();


        System.out.println(x+": "+y);
    }
}
