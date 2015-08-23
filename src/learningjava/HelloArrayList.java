package learningjava;
import java.util.ArrayList;
import java.util.Iterator;

public class HelloArrayList {
	ArrayList <String> names = new ArrayList<String>();
	ArrayList <String> students = new ArrayList<String>();
	public HelloArrayList() {
		// TODO Auto-generated constructor stub
//		ArrayList <String> names = new ArrayList<String>();
	}
	
		public void addContent(){
			names.add("Deepak Rohan");
			names.add("Deepak Rohan");
			names.add("Sekar Rohan");
			
		}
		public void listDisplay(){
			for(String name:names){
				System.out.println(name);
	}
			System.out.println("========");
			for (String name:students){
				System.out.println(name);
			}

}
}