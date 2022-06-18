import java.io.Serializable;

/*
 * Home class represents the house a user owns.
 * Every HaveHome user has a Home attribute.
 * This class is used for data modeling of a user's
 * house and has no methods of great significance.
 */

public class Home implements Serializable {
	
	private double rent;
	private String address,area,typeOfHeating;
	private int bedrooms,floor,m2;
	private boolean petsAllowed;
	
	public Home() {
		rent = 0;
		address = "";
		area = "";
		typeOfHeating = "";
		bedrooms = 0;
		floor = 0;
		m2 = 0;
		petsAllowed = false;
	}
	
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
	
	public String getAddress() {
		return address;
	}
	
	public String getArea() {
		return area;
	}
	
	public String getHeating() {
		return typeOfHeating;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public int getM2() {
		return m2;
	}
	
	public boolean petAllowed() {
		return petsAllowed;
	}
}
