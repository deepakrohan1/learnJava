package learningjava;

import java.util.Date;

/**
 * Created by rohan on 11/8/15.
 */
public class MutatorAccessor {

    public static void main(String[] args) {
            MainToAccess mainToAccess = new MainToAccess();
        mainToAccess.getHireDate();
//        mainToAccess.h
    }


     static class MainToAccess{
         private Date hireDate;

         public Date getHireDate() {
             return hireDate;
         }
    }
}
