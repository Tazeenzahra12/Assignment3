// Superclass Engine
class Engine {
	private int id;
	private String category;

	public Engine(int id, String category) {
		this.id = id;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}
}

// Subclasses of Engine
class CombustionEngine extends Engine {
	public CombustionEngine() {
		super(1, "Combustion");
	}
}

class ElectricEngine extends Engine {
	public ElectricEngine() {
		super(2, "Electric");
	}
}

class HybridEngine extends Engine {
	public HybridEngine() {
		super(3, "Hybrid");
	}
}
