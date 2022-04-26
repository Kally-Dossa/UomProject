
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
	
	

	public Home gethome() {
		return this;
	}
	
	

}
