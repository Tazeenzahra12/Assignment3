
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manufacture manufacture1 = new Manufacture();
		manufacture1.setModel("Suzuki");
		manufacture1.setYearofManufacture(2001);

		Manufacture manufacture2 = new Manufacture();
		manufacture2.setModel("MG");
		manufacture2.setYearofManufacture(2023);

		Manufacture manufacture3 = new Manufacture();
		manufacture3.setModel("Toyota");
		manufacture3.setYearofManufacture(2010);

		Engine engine1 = new CombustionEngine();
		Engine engine2 = new ElectricEngine();
		Engine engine3 = new HybridEngine();

		Vehicle[] vehicles = { new ICEV(manufacture1, engine1), new BEV(manufacture2, engine2),
				new HybridV(manufacture3, engine3) };
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].ShowCharacteristics();
		}
	}

}
