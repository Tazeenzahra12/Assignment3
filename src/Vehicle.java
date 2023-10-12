
abstract class Vehicle {
	private Manufacture manufacture;
	private Engine engine;

	public Vehicle(Manufacture manufacture, Engine engine) {
		this.manufacture = manufacture;
		this.engine = engine;
	}

	public Manufacture getManufacture() {
		return manufacture;
	}

	public Engine getEngine() {
		return engine;
	}

	public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
	public ICEV(Manufacture manufacture, Engine engine) {
		super(manufacture, engine);
	}

	public void ShowCharacteristics() {
		System.out.println("ICEV Characterictics" + "\n"  + "[ ManufacturerModel: " + getManufacture().getModel() + ", Year of Manufacture: "
				+ getManufacture().getYearofManufacture() + ", Engine ID: " + getEngine().getId() + ", Engine Category: "
				+ getEngine().getCategory() + " ] " );
	}
}

class BEV extends Vehicle {
	public BEV(Manufacture manufacture, Engine engine) {
		super(manufacture, engine);
	}

	public void ShowCharacteristics() {
		System.out.println("BEV Characteristics" + "\n"  + "[ ManufacturerModel: " + getManufacture().getModel() + ", Year of Manufacture: "
				+ getManufacture().getYearofManufacture() + ", Engine ID: " + getEngine().getId() + ", Engine Category: "
				+ getEngine().getCategory() + " ] ");
	}
}

class HybridV extends Vehicle {
	public HybridV(Manufacture manufacture, Engine engine) {
		super(manufacture, engine);

	}

	public void ShowCharacteristics() {
		System.out.println("HybridV Characteristics" + "\n"  + "[ ManufacturerModel: " + getManufacture().getModel() + ", Year of Manufacture: "
				+ getManufacture().getYearofManufacture() + ", Engine ID: " + getEngine().getId() + ", Engine Category: "
				+ getEngine().getCategory() + " ] " );
	}

}
