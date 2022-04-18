import java.io.Serializable;

public class NoHome extends User implements Serializable{

	public NoHome(String aName, String aLastName, String aSex, int anAge, String anEmail, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus, boolean aPet, boolean aSmoker) {
		super(aName, aLastName, aSex,anAge, anEmail, aPhoneNum, aLanguage,   aPet, aSmoker, aProfessionalStatus);
		
	}

	
	public User getUser() {
		
		return this;
	}

}
