package collisions;

import java.util.HashMap;
import java.util.Objects;
import java.util.Map;

/**
 * Created by rohan on 5/7/16.
 */
public class HashTest {

    public static void main(String[] args){
        Map<MyInnerClass, String> myMap = new HashMap<>();
        myMap.put(new MyInnerClass("AB", "CD"), "First");

        //Same hashCode same equals
        myMap.put(new MyInnerClass("AB", "CD"), "First");

        //Same hashCode different equals
        myMap.put(new MyInnerClass("ABC", "D"), "Second");

        System.out.println(myMap);

    }

}

class MyInnerClass{
    private String strA;
    private String strB;

    public MyInnerClass(String strA, String strB){
        super();
        this.strA=strA;
        this.strB= strB;
    }

    @Override
    public boolean equals(Object obj) {
     if(strA.length() == strB.length()){
         return true;
     }
        return false;
    }

    @Override
    public int hashCode() {
        return (strA + strB).length();
    }
}