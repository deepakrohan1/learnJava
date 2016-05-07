package learningjava;

/**
 * Created by rohan on 5/5/16.
 */
public class MainMethodArguments {
    public static void main(String[] args) {
        for(String arg : args){
            System.out.println(arg.getClass());
        }
    }
}
