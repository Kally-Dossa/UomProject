import java.io.Serializable;
import java.util.ArrayList;

public class NoHome extends User implements Serializable{
	
	private ArrayList<HaveHome> suggestedRoomates;

	public NoHome(String aName, String aLastName, String aSex, int anAge, String anEmail, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus, boolean aPet, boolean aSmoker) {
		super(aName, aLastName, aSex,anAge, anEmail, aPhoneNum, aLanguage,   aPet, aSmoker, aProfessionalStatus);
		suggestedRoomates = new ArrayList<HaveHome>();
		
	}

	
	public User getUser() {
		
		return this;
	}

}
