import java.io.Serializable;
import java.util.ArrayList;

public class NoHome extends User implements Serializable{
	
	private ArrayList<User> suggestedRoomates;

	public NoHome(String aName, String aLastName, String aSex, int anAge, String anEmail, String pass, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus, boolean aPet, boolean aSmoker) {
		super(aName, aLastName, aSex,anAge, anEmail, pass, aPhoneNum, aLanguage, aPet, aSmoker, aProfessionalStatus);
		suggestedRoomates = new ArrayList<User>();
		
	}
	
	public NoHome() {
		super();
		suggestedRoomates = new ArrayList<User>();
	}

	
	public User getUser() {
		
		return this;
	}


	@Override
	public boolean hasHome() {
		return false;
	}

}
