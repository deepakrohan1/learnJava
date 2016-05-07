package learningjava;

/**
 * Created by rohan on 4/17/16.
 */
public class EmailValidator {

    public static void main(String[] args) {
        String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String email1 = "user@domain.com";
        Boolean b = email1.matches(EMAIL_REGEX);
        System.out.println("is e-mail: "+email1+" :Valid = " + b);
        String email2 = "user@domain.co.in";
        b = email2.matches(EMAIL_REGEX);
        System.out.println("is e-mail: "+email2
                +" :Valid = " + b);
    }
}
