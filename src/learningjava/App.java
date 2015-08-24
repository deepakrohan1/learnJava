package learningjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import learningjava.HelloArrayList;

public class App {
	HashSet<String> input = new HashSet<String>();
	TreeSet<String> tree = new TreeSet<String>();

	public App() {
		// TODO Auto-generated constructor stub
	}

	public void arrayListOps() {
		HelloArrayList hello = new HelloArrayList(); // Creating an object of
														// the other class
		hello.addContent(); // Accessing the methods of the other class
		hello.names.add("Shiva G"); // Accessing the variables of the class
									// intantiated
		hello.students.add("Deepak Rohan");
		hello.students.add("Deepak Rohan");
		hello.students.add("Sekar Rohan");
		hello.students.add("Shiva G");
		hello.students.set(1, "Deepu");// Set in ArrayList
		hello.students.add(0, "Ganesh");
		hello.students.add("Deepak Rohan");
		hello.students.add("Deepak Rohan");

		hello.listDisplay();
		System.out.println("-------");
		System.out.println(hello.students.get(1));// Gets the name at the Index
		System.out.println(hello.names.equals(hello.students));
		System.out.println("++++++++");

		Collections.shuffle(hello.students, new Random());
		System.out.println(hello.students);
		System.out.println("************");
		hello.iterDisplay();
		System.out.println("^^^^^^^^^^^^^");
		hello.iterReverseDisplay();
		System.out.println("#############");
		hello.posDisplay();
		System.out.println("Sorted");
		Collections.sort(hello.students); // Sorts the list
		hello.students.remove("Deepak Rohan");
		System.out.println(hello.students);
		hello.students.removeAll(Collections.singleton("Deepak Rohan"));// Remove
																		// all
																		// the
																		// instances
																		// from
																		// the
																		// collection
		System.out.println(hello.students);
		System.out.println("End of Array List Operations");

	}

	public ArrayList<String> testing() {
		HelloArrayList hello = new HelloArrayList(); // Creating an object of
														// the other class
		hello.students.add("Deepak Rohan");
		hello.students.add("Deepak Rohan");
		hello.students.add("Sekar Rohan");
		hello.students.add("Shiva G");
		hello.students.set(1, "Deepu");// Set in ArrayList
		hello.students.add(0, "Ganesh");
		hello.students.add("Deepak Rohan");
		hello.students.add("Deepak Rohan");
		return hello.students;
	}

	public void disHashset() {
		Hashset hash = new Hashset();
		hash.setCommands();
		hash.dispHashList();
	}
	/**
	 * Just in a random order
	 * Using HashSet
	 * @param arg1
	 */
	public void passingArguments(String arg1) {
		input.add(arg1);
		System.out.println(input);
		System.out.println("Unique Words");
		System.out.println(input.size());

	}
	/** Alphabetical sorted order
	 * Design using a TreeSet
	 * @param arg1
	 */
	public void designTreeSet(String arg1){
		tree.add(arg1);
		System.out.println(tree);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.arrayListOps();
		app.disHashset();
		/**
		 * Passing the Argument to a different method counting them over there.
		 */

		for (String a : args) {
			// input.add(a);
			app.passingArguments(a);
			app.designTreeSet(a);
		}
	}
}
