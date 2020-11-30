
public class Address {
	private String streetAddress;
	private int buildingNumber;

	// constructor
	public Address(String streetAddress, int buildingNumber) {
		this.streetAddress = streetAddress;
		this.buildingNumber = buildingNumber;

	}

	// getters and setters
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

}
