import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<HaveHome> haveHomeUsers = new ArrayList<HaveHome>();
		ArrayList<NoHome> noHomeUsers = new ArrayList<NoHome>();
		
		//Diavasma arxeiou gia HaveHome Users
		try {
			FileInputStream fileIn = new FileInputStream("Users_With_Home.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			haveHomeUsers = (ArrayList<HaveHome>) in.readObject();							
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		
		//Diavasma arxeiou gia NoHome Users
		try {
			FileInputStream fileIn = new FileInputStream("Users_Without_Home.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);						
			noHomeUsers = (ArrayList<NoHome>) in.readObject();
			in.close();
			fileIn.close();		
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		
		Registry theRegistry = new Registry(haveHomeUsers, noHomeUsers);
		
		
		new StartingGUI(theRegistry);
	}

}

