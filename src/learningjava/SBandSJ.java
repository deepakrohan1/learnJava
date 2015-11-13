package learningjava;

import java.util.StringJoiner;

/**
 * Created by rohan on 10/25/15.
 */
public class SBandSJ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ;i < 3; i++){
            sb.append(i + "###String Builder###");
        }
        System.out.println(sb.toString());
        System.out.println("%%%%%%%%%%%%%%%%%");

        StringJoiner sj = new StringJoiner("###String Builder###");
        for (int i = 0 ;i < 3; i++){
           sj.add(i+"");
        }
        System.out.println(sj.toString());

        String st = "";
//        System.out.println(Integer.parseInt(st));
        System.out.println(Integer.valueOf(st));
    }
}
