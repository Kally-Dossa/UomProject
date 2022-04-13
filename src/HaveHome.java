
public class HaveHome extends User {
	private Home myHome;

	
	public HaveHome(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage,
			String aProfessionalStatus, int anAge, boolean aPet, boolean aSmoker, Home aHome) {
		super(aName, aLastName, aSex, anEmail, aPhoneNum, aLanguage, aProfessionalStatus,anAge, aPet, aSmoker);
		myHome = aHome;
	}


	@Override
	public User getUser() {
		return this;
	}
	

}
