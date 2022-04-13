
public class HaveHome extends User {
	

	private String name, lastName, sex, email, phoneNum, language, professionalStatus;
	private int age;
	private boolean pet, smoker;
	private Home myHome;

	
	public HaveHome(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage,
			String aProfessionalStatus, int anAge, boolean aPet, boolean aSmoker, Home aHome) {
		super(aName, aLastName, aSex, anEmail, aPhoneNum, aLanguage, aProfessionalStatus, aPet, aSmoker, Home aHome);
		myHome = aHome;
	}
	

}
