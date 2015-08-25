package learningjava;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
public class NewApp {

	public NewApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<User> user = new ArrayList<User>();
		
		user.add(new User("Deepak", "Sekar", "Rohan", 26));
		user.add(new User("Deepak", "Sekar", "Rohan", 26));
		user.add(new User("Shiva", "G", " ", 25));
		HashSet<User> userHash = new HashSet<User>(user);
		System.out.println(user.size());
		for (User user2 : user) {
			System.out.println(user2);
		}
		System.out.println("The hashed list");
		for (User user2 : userHash) {
			System.out.println(user2);
		}
	}

}
