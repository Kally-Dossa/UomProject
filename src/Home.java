
public class Home {
	
	private double rent;
	private String holder,address,area,petsAllowd,typeOfHeating;
	private int bedrooms,floor,cm2;
	
	public Home(double rent, String holder, String address, String area, String petsAllowd, String typeOfHeating,
			int bedrooms, int floor, int cm2) {
		this.rent = rent;
		this.holder = holder;
		this.address = address;
		this.area = area;
		this.petsAllowd = petsAllowd;
		this.typeOfHeating = typeOfHeating;
		this.bedrooms = bedrooms;
		this.floor = floor;
		this.cm2 = cm2;
	}
	
	
	
	public double getRent() {
		return rent;
	}



	public void setRent(double rent) {
		this.rent = rent;
	}



	public String getHolder() {
		return holder;
	}



	public void setHolder(String holder) {
		this.holder = holder;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public String getPetsAllowd() {
		return petsAllowd;
	}



	public void setPetsAllowd(String petsAllowd) {
		this.petsAllowd = petsAllowd;
	}



	public String getTypeOfHeating() {
		return typeOfHeating;
	}



	public void setTypeOfHeating(String typeOfHeating) {
		this.typeOfHeating = typeOfHeating;
	}



	public int getBedrooms() {
		return bedrooms;
	}



	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}



	public int getFloor() {
		return floor;
	}



	public void setFloor(int floor) {
		this.floor = floor;
	}



	public int getCm2() {
		return cm2;
	}



	public void setCm2(int cm2) {
		this.cm2 = cm2;
	}

	
	

}
