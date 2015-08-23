package learningjava;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloArrayList hello = new HelloArrayList();
		hello.addContent();
		hello.names.add("Shiva G");
		hello.students.add("Deepak Rohan");
		
		hello.students.add("Deepak Rohan");
		hello.students.add("Sekar Rohan");
		hello.students.add("Shiva G");
		
		hello.listDisplay();
		System.out.println(hello.names.equals(hello.students));
	}

}
