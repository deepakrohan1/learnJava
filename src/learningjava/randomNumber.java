package learningjava;
import java.util.Random;
/**
 * Created by rohan on 4/11/16.
 */
public class randomNumber {

    public static void main(String[] args) {
        Random r = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQURSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 50; i++) {
            System.out.print(alphabet.charAt(r.nextInt((alphabet).length())));
        }
    }
}