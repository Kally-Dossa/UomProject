
public class NoHome extends User{
	private String name, lastName, sex, email, phoneNum, language, professionalStatus;
	private boolean pet, smoker;

	public NoHome(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage,
			String aProfessionalStatus, int anAge, boolean aPet, boolean aSmoker) {
		super(aName, aLastName, aSex, anEmail, aPhoneNum, aLanguage, aProfessionalStatus, anAge,  aPet, aSmoker);
		
	}

}
