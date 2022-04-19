
public class Home {
	
	private double rent;
	private String address,area,typeOfHeating;
	private int bedrooms,floor,m2;
	private boolean petsAllowed;
	
	public Home(double rent, String address, String area, boolean petsAllowed, String typeOfHeating,
			int bedrooms, int floor, int m2) {
		this.rent = rent;
		this.address = address;
		this.area = area;
		this.petsAllowed = petsAllowed;
		this.typeOfHeating = typeOfHeating;
		this.bedrooms = bedrooms;
		this.floor = floor;
		this.m2 = m2;
	}
	
	
	
	public double getRent() {
		return rent;
	}



	public void setRent(double rent) {
		this.rent = rent;
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



	public boolean getPetsAllowd() {
		return petsAllowed;
	}



	public void setPetsAllowd(boolean petsAllowd) {
		this.petsAllowed = petsAllowed;
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
		return m2;
	}



	public void setCm2(int m2) {
		this.m2 = m2;
	}

	
	

}
