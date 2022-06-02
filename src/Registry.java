import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

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
	
	public boolean verification(String mail, String pass) {
		boolean found = false;
		for(int i=0; i<somebodyWithoutHome.size(); i++) {
			if(mail.equals(somebodyWithoutHome.get(i).getEmail())) {
				found = true;
				if(pass.equals(somebodyWithoutHome.get(i).getPass())) {
					
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
						
						return found;
					}
					
					else return found;
				}
				
				else continue;
			}
		return found;
	}
	
	public ArrayList<User> ListFiltering(boolean hasHome,boolean male, boolean female, 
			boolean smoker, boolean no_smoker, boolean with_pet, boolean without_pet ) {
		
		ArrayList<User> tempList = new ArrayList<User> ();
		if(hasHome) {
		for(int i=0; i<somebodyWithoutHome.size(); i++)
			tempList.add(somebodyWithoutHome.get(i));
		}
		else {
			for(int i=0; i<somebodyWithHome.size(); i++)
				tempList.add(somebodyWithHome.get(i));	
		}
		if(male) {
			for(int i=0; i<tempList.size(); i++)
				if(tempList.get(i).getSex().equals("Female"))
					tempList.remove(i);
		} else ;
		
		if(female) {
			for(int i=0; i<tempList.size(); i++)
				if(tempList.get(i).getSex().equals("Male"))
					tempList.remove(i);
		} else ;
		
		if(smoker) {
			for(int i=0; i<tempList.size(); i++)
				if(!tempList.get(i).isSmoker())
					tempList.remove(i);
		} else ; 
		
		if(no_smoker) {
			for(int i=0; i<tempList.size(); i++)
				if(tempList.get(i).isSmoker())
					tempList.remove(i);					
		} else ;
		
		if(with_pet) {
			for(int i=0; i<tempList.size(); i++) {
				if(tempList.get(i).hasPet()==false)
					tempList.remove(i);
				else continue;
			}
		} else ; 
		
		if(without_pet) {
			for(int i=0; i<tempList.size(); i++) {
				if(tempList.get(i).hasPet())
					tempList.remove(i);
				else continue;
			}
		} else ;
		
		
  
		return tempList;
	}
	
	
	
	
}
