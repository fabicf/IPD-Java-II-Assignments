
public class PcCase {

	private String model;
	private String manufacturer;
	private String powerSupply;
	private CaseDimension dimension;

	// constructor
	public PcCase(String model, String manufacturer, String powerSupply, CaseDimension dimension) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}

	public void pressPowerButton() {
		String message = "power button pressed";
		System.out.println(message);
	}

}
