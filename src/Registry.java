import java.util.ArrayList;

public class Registry {
	private ArrayList<HaveHome> somebodyWithHome;
	private ArrayList<NoHome> somebodyWithoutHome;
	
	public Registry() {
		somebodyWithHome = new ArrayList<HaveHome>();
		somebodyWithoutHome = new ArrayList<NoHome>();
	}
	
	public ArrayList<User> suggestedRoomates(){
		return null;
	}
}
