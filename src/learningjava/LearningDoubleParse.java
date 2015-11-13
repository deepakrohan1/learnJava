package learningjava;

/**
 * Created by rohan on 10/25/15.
 */
public class LearningDoubleParse {
    public static void main(String[] args) {
        String random = "Sdeepak0.60sdfs";
        try {
            double d = Double.parseDouble(random);
            System.out.println(d);
        }catch (NumberFormatException ex){
            String s = random;
            System.out.println(s);
        }
    }
}
