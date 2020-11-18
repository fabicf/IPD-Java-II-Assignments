
public class Pc {

	private PcCase pcCase;
	private Monitor monitor;
	private Motherboard motherboard;

	// constructor
	public Pc(PcCase pcCase, Monitor monitor, Motherboard motherboard) {
		this.pcCase = pcCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public PcCase getPcCase() {
		return pcCase;
	}

}
