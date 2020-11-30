
public class Address {

	int buildingNo;
	String streetName;
	String cityName;
	String provinceName;
	String postalCode;

	public Address(int buildingNo, String streetName, String cityName, String provinceName, String postalCode) {

		this.buildingNo = buildingNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.provinceName = provinceName;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [buildingNo=" + buildingNo + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", provinceName=" + provinceName + ", postalCode=" + postalCode + "]";
	}
	
	

}
