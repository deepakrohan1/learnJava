package learningjava;

/**
 * Created by rohan on 10/22/15.
 */
public class Student {
    String name, college;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", age=" + age +
                '}';
    }
}
