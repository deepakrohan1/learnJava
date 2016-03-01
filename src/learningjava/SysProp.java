package learningjava;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by rohan on 11/26/15.
 */
public class SysProp {

    public static void main(String[] args) {
        Set<String> propNames = new TreeSet<>(System.getProperties().stringPropertyNames());
        for(String s : propNames) {
            System.out.printf("%s is %s %n",
                    s,
                    System.getProperty(s));
        }
    }
}
