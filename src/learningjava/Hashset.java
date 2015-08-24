package learningjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Hashset {
	HelloArrayList arrayList = null;
	Collection<String> nodups = null;
	ArrayList<String> test = null;

	public Hashset() {
		// TODO Auto-generated constructor stub

	}

	public void setCommands() {
		
		App app = new App();
		app.arrayListOps();
//		app.testing();
		 test = app.testing();
		System.out.println(test);
		nodups = new HashSet<String>(test);
	}

	public void dispHashList() {
		System.out.println("Display Array List");
		System.out.println(test);
		System.out.println(nodups+" :size of "+nodups.size());
	}

}
