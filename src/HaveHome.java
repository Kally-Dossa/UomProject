import java.io.Serializable;
import java.util.ArrayList;
/*
 * HaveHome class represents a user that has a house
 * and is only looking for a roomate. It's used just for
 * data modeling and doesn't have methods with great 
 * significance.
 */
public class HaveHome extends User implements Serializable{
	private Home myHome;
	
	
	public HaveHome(String aName, String aLastName, String aSex,int anAge, String anEmail,String pass, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus,  boolean aPet, boolean aSmoker, Home aHome) {
		super(aName, aLastName, aSex,anAge, anEmail, pass, aPhoneNum, aLanguage, aProfessionalStatus, aPet, aSmoker);
		myHome = aHome;
		
	}
	
	public void editUser(String aName, String aLastName, String aSex,int anAge, String anEmail,String pass, String aPhoneNum, String aLanguage,  boolean aPet,
			boolean aSmoker, boolean aProfessionalStatus,Home aHome) {
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
		myHome = aHome;
		
	}
	public User getUser() {
		return this;
	}

	public Home getHome() {
		return myHome;
	}
	public boolean hasHome() {
		return true;
	}

}
