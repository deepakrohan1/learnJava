package learningjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Hashset {
	Collection<String> nodups = null;
	ArrayList<String> test = null;

	public Hashset() {
		// TODO Auto-generated constructor stub

	}

	public void setCommands() {

		App app = new App();
		app.arrayListOps();
		test = app.testing();
		System.out.println(test);
		nodups = new HashSet<String>(test);
	}
	/**
	 * Read the input string and remove the repitation 
	 */
	public void readInputs(){
		
	}

	public void dispHashList() {
		System.out.println("Display Array List");
		System.out.println(test + " " + test.size());
		System.out.println(nodups + " :size of " + nodups.size());
	}

}
