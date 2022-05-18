import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Registry {
	private ArrayList<HaveHome> somebodyWithHome;
	private ArrayList<NoHome> somebodyWithoutHome;
	
	public Registry() {
		somebodyWithHome = new ArrayList<HaveHome>();
		somebodyWithoutHome = new ArrayList<NoHome>();
	}
	
	public void addNoHome(NoHome aUser) {
		somebodyWithoutHome.add(aUser);
	}
	public void addHaveHome(HaveHome aUser) {
		somebodyWithHome.add(aUser);
	}
	
	public ArrayList<HaveHome> getListWithHome(){
		return somebodyWithHome;
	}
	
	public ArrayList<NoHome> getListWithoutHome(){
		return somebodyWithoutHome;
	}
	
	public boolean verification(User aUser, String mail, String pass) {
		boolean found = false;
		for(int i=0; i<somebodyWithoutHome.size(); i++) {
			if(mail.equals(somebodyWithoutHome.get(i).getEmail())) {
				found = true;
				if(pass.equals(somebodyWithoutHome.get(i).getPass())) {
					aUser = somebodyWithoutHome.get(i);
					return found;
				}
				
				else return found;
			}
			
			else continue;
		}
		
		if(!found)
			for(int i=0; i<somebodyWithHome.size(); i++) {
				if(mail.equals(somebodyWithHome.get(i).getEmail())) {
					found = true;
					if(pass.equals(somebodyWithHome.get(i).getPass())) {
						aUser = somebodyWithHome.get(i);
						return found;
					}
					
					else return found;
				}
				
				else continue;
			}
		return found;
	}
}
