package learningjava;

import java.util.ArrayList;

/**
 * Created by rohan on 10/22/15.
 */
public class ArrayListCheck {


    static ArrayList<Bicycle> bicycles = new ArrayList();
    static ArrayList<Bicycle> mbicycles = new ArrayList();

    public static void main(String[] args) {
        bicycles.add(new Bicycle(60,3));
        bicycles.add(new Bicycle(30,2));

        mbicycles.add(new Bicycle(30, 2));
        mbicycles.add(new Bicycle(40, 3));

        Bicycle m = new Bicycle(30,2);

//        System.out.println(mbicycles.toString());
//        System.out.println(bicycles.toString());

        if(mbicycles.contains(m)){
            System.out.println("true");
        }

//        mbicycles.retainAll(bicycles);
        for (Bicycle b : mbicycles){
            System.out.println(b.toString());
        }
        for (Bicycle b : bicycles){
            if(mbicycles.equals(b)){
                System.out.println(b.toString());
            }else{
                System.out.println("None");
            }
        }

    }
}
