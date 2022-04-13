
public abstract class User {
	
	private String name, lastName, sex, email, phoneNum, language, professionalStatus;
	private boolean pet, smoker, HaveHome, noHome;
	//να μπορουν να βαλουν και προσωπικη φωτογραφια 
	
	
	public User(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage, String aProfessionalStatus, boolean aPet,
			boolean aSmoker, boolean aHaveHome) {
		super();
		this.name = aName;
		this.lastName = aLastName;
		this.sex = aSex;
		this.email = anEmail;
		this.phoneNum = aPhoneNum;
		this.language = aLanguage;
		this.professionalStatus = aProfessionalStatus;
		this.pet = aPet;
		this.smoker = aSmoker;
		this.HaveHome = aHaveHome;
	}
	
	public User(String aName, String aLastName, String aSex, String anEmail, String aPhoneNum, String aLanguage, String aProfessionalStatus, boolean aPet,
			boolean aSmoker, boolean aNoHome) {
		super();
		this.name = aName;
		this.lastName = aLastName;
		this.sex = aSex;
		this.email = anEmail;
		this.phoneNum = aPhoneNum;
		this.language = aLanguage;
		this.professionalStatus = aProfessionalStatus;
		this.pet = aPet;
		this.smoker = aSmoker;
		this.noHome = aNoHome;
	}


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
	
	public boolean haveHome() {
		return HaveHome;
	}
	
	
}
