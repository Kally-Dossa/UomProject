
public class NoHome extends User{

	public NoHome(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage,
			String aProfessionalStatus, int anAge, boolean aPet, boolean aSmoker) {
		super(aName, aLastName, aSex, anEmail, aPhoneNum, aLanguage, aProfessionalStatus, anAge,  aPet, aSmoker);
		
	}

	
	public User getUser() {
		
		return this;
	}

}
