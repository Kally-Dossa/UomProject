import java.io.Serializable;
import java.util.ArrayList;

public class HaveHome extends User implements Serializable{
	private Home myHome;
	
	
	public HaveHome(String aName, String aLastName, String aSex,int anAge, String anEmail,String pass, String aPhoneNum, String aLanguage,
			boolean aProfessionalStatus,  boolean aPet, boolean aSmoker, Home aHome) {
		super(aName, aLastName, aSex,anAge, anEmail, pass, aPhoneNum, aLanguage, aProfessionalStatus, aPet, aSmoker);
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
