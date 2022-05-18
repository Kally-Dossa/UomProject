import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Registry theRegistry = new Registry();
		ArrayList<HaveHome> haveHomeUsers = new ArrayList<HaveHome>();
		ArrayList<NoHome> noHomeUsers = new ArrayList<NoHome>();
		
		try {
			File f1 = new File("HaveHomeList.ser");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1));
			haveHomeUsers = (ArrayList<HaveHome>) in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		for(int i=0;i<haveHomeUsers.size();i++) {
			theRegistry.getListWithHome().add(haveHomeUsers.get(i));			
		}
		
		try {
			File f2 = new File("NoHomeList.ser");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f2));
			noHomeUsers = (ArrayList<NoHome>) in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		for(int i=0;i<noHomeUsers.size();i++) {
			theRegistry.getListWithoutHome().add(noHomeUsers.get(i));			
		}
		
		new StartingGUI(theRegistry);
	}

}

