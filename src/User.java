import java.io.Serializable;
import java.util.ArrayList;

public abstract class User implements Serializable{
	
	protected String name, lastName, sex, email, phoneNum, language;
	protected int age;
	protected boolean pet, smoker, professionalStatus;
	protected ArrayList<User> suggestRoomatesList = new ArrayList<User>();
	//να μπορουν να βαλουν και προσωπικη φωτογραφια 
	
	
	public User(String aName, String aLastName, String aSex,int anAge, String anEmail, String aPhoneNum, String aLanguage,  boolean aPet,
			boolean aSmoker, boolean aProfessionalStatus) {
		super();
		name = aName;
		lastName = aLastName;
		sex = aSex;
		email = anEmail;
		phoneNum = aPhoneNum;
		language = aLanguage;
		professionalStatus = aProfessionalStatus;
		age = anAge;
		pet = aPet;
		smoker = aSmoker;

	}
	
	public abstract User getUser();

	public String getName() {
		return name;
	}


	public String getLastName() {
		return lastName;
	}


	public String getSex() {
		return sex;
	}


	public String getEmail() {
		return email;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public String getLanguage() {
		return language;
	}


	public boolean getProfessionalStatus() {
		return professionalStatus;
	}


	public boolean isPet() {
		return pet;
	}


	public boolean isSmoker() {
		return smoker;
	}
	
	
}
