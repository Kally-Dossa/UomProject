import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * This project was created for academic purposes. Room8 is an app that
 * is supposed to help people find a roomate to live together and share 
 * the bills. This is done by letting every user see the profiles of all
 * the other users and like those that suit him, if he gets liked back
 * from a user then they can both see each other's contact info in order
 * to communicate further. For simplicity when signing up there's no strict
 * control about your credentials (e.g your password could be anything, your
 * email doesn't have to be smth@smth.com, just numbers where there should be
 * numbers and letters where there should be letters). Also if you click the 
 * like button for a certain user, you can't take it back. Finally the app
 * doesn't use a datebase but instead the user's are being saved at serial files.
 */

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

