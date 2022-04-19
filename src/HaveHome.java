import java.io.Serializable;
import java.util.ArrayList;

public class HaveHome extends User implements Serializable{
	private Home myHome;
	private ArrayList<NoHome> suggestedRoomates;
	
	public HaveHome(String aName, String aLastName, String aSex,int anAge, String anEmail, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus,  boolean aPet, boolean aSmoker, Home aHome) {
		super(aName, aLastName, aSex,anAge, anEmail, aPhoneNum, aLanguage, aProfessionalStatus, aPet, aSmoker);
		myHome = aHome;
		suggestedRoomates = new ArrayList<NoHome>();
	}


	@Override
	public User getUser() {
		return this;
	}
	

}
