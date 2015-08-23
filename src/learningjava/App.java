package learningjava;

import java.util.Collections;
import java.util.Random;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloArrayList hello = new HelloArrayList(); //Creating an object of the other class
		hello.addContent(); // Accessing the methods of the other class
		hello.names.add("Shiva G"); //Accessing the variables of the class intantiated
		hello.students.add("Deepak Rohan");
		hello.students.add("Deepak Rohan");
		hello.students.add("Sekar Rohan");
		hello.students.add("Shiva G");
		hello.students.set(1, "Deepu");//Set in ArrayList
		hello.students.add(0,"Ganesh");
		
		
		hello.listDisplay();
		System.out.println("-------");
		System.out.println(hello.students.get(1));//Gets the name at the Index
		System.out.println(hello.names.equals(hello.students));
		System.out.println("++++++++");
		
		Collections.shuffle(hello.students,new Random());
		System.out.println(hello.students);
		System.out.println("************");
		hello.iterDisplay();
		System.out.println("^^^^^^^^^^^^^");
		hello.iterReverseDisplay();
		System.out.println("#############");
		hello.posDisplay();
		System.out.println("Sorted");
		Collections.sort(hello.students); //Sorts the list 
		System.out.println(hello.students);
	}

}
