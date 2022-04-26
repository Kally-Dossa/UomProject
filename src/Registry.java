import java.util.ArrayList;

public class Registry {
	private ArrayList<HaveHome> somebodyWithHome = new ArrayList<HaveHome>();
	private ArrayList<NoHome> somebodyWithoutHome = new ArrayList<NoHome>();
	
	
	
	public Registry(ArrayList<HaveHome> aList, ArrayList<NoHome> bList) {
		somebodyWithHome = aList;
		somebodyWithoutHome = bList;
	}
	
	public ArrayList<HaveHome> getListWithHome(){
		return somebodyWithHome;
	}
	
	public ArrayList<NoHome> getListWithoutHome(){
		return somebodyWithoutHome;
	}
	
	public void changeHaveHomeList(ArrayList<HaveHome> aList) {
		somebodyWithHome = aList;
		
	}
	
	public void changeNoHomeList(ArrayList<NoHome> aList) {
		somebodyWithoutHome = aList;
		
	}
	
	
}
