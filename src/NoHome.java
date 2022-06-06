import java.io.Serializable;
import java.util.ArrayList;

public class NoHome extends User implements Serializable{


	public NoHome(String aName, String aLastName, String aSex, int anAge, String anEmail, String pass, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus, boolean aPet, boolean aSmoker) {
		super(aName, aLastName, aSex,anAge, anEmail, pass, aPhoneNum, aLanguage, aPet, aSmoker, aProfessionalStatus);
		
		
	}
	
	
	public void editUser(String aName, String aLastName, String aSex, int anAge, String anEmail, String pass, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus, boolean aPet, boolean aSmoker, Home aHome) {
		
		name = aName;
		lastName = aLastName;
		sex = aSex;
		email = anEmail;
		password = pass;
		phoneNum = aPhoneNum;
		language = aLanguage;
		professionalStatus = aProfessionalStatus;
		age = anAge;
		pet = aPet;
		smoker = aSmoker;

	}
	
	public User getUser() {
		
		return this;
	}


	@Override
	public boolean hasHome() {
		return false;
	}




	
	

}
