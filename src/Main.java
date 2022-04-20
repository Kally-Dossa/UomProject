import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Registry theRegistry = new Registry();
		ArrayList<User> users = new ArrayList<User>();
		
		try {
			File f = new File("ourDatabase.ser");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
			users = (ArrayList<User>) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		for(int i=0;i<users.size();i++) {
			if(users.get(i).hasHome()) {
				theRegistry.getListWithHome().add((HaveHome)users.get(i));
			}
			else {
				theRegistry.getListWithoutHome().add((NoHome)users.get(i));
			}
			
		}
		
		new StartingGUI(theRegistry);
	}

}

