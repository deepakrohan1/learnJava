package learningjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HelloArrayList {
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> students = new ArrayList<String>();

	public HelloArrayList() {
		// TODO Auto-generated constructor stub
		// ArrayList <String> names = new ArrayList<String>();
	}

	public void addContent() {
		names.add("Deepak Rohan");
		names.add("Deepak Rohan");
		names.add("Sekar Rohan");

	}

	public void listDisplay() {
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("========");
		for (String name : students) {
			System.out.println(name);
		}
	}
	/**
	 * When no parameter has been passed to listIterator() displays them 
	 * in the same order
	 */
	public void iterDisplay(){
		for(ListIterator<String> it = students.listIterator(); it.hasNext();){ //listIterator doesnt take parameters
			String t = it.next();  //Displays the contents in the same order
			System.out.println(t);
		}
	}
	/**
	 * Reverse the order and display the contents. it checks for the previous and displays
	 * them in that order
	 */
	public void iterReverseDisplay(){
		for(ListIterator<String> it = students.listIterator(students.size());it.hasPrevious();){
			String t = it.previous();
			System.out.println(t);
		}
	}
	/**
	 * Displays the value from the particular index "1" in the below case
	 */
	public void posDisplay(){
		for(ListIterator<String> it = students.listIterator(1);it.hasNext();){
			String t = it.next();
			System.out.println(t);
		}
	}
}