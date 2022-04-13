import java.util.ArrayList;

public abstract class User {
	
	protected String name, lastName, sex, email, phoneNum, language, professionalStatus;
	protected int age;
	protected boolean pet, smoker;
	protected ArrayList<User> suggestRoomatesList = new ArrayList<User>();
	//να μπορουν να βαλουν και προσωπικη φωτογραφια 
	
	
	public User(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage, String aProfessionalStatus, int anAge, boolean aPet,
			boolean aSmoker) {
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


	public String getProfessionalStatus() {
		return professionalStatus;
	}


	public boolean isPet() {
		return pet;
	}


	public boolean isSmoker() {
		return smoker;
	}
	
	
}
