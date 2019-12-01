package exercise_07;

public class Car {
	private static final int DEFAULT_WEIGHT = 0;
	private static final String DEFAULT_COLOR = "n/a";

	private String model;
	private Engine engine;
	private int weight;
	private String color;

	public Car(String model, Engine engine) {
		this(model, engine, DEFAULT_WEIGHT, DEFAULT_COLOR);
	}

	public Car(String model, Engine engine, int weight) {
		this(model, engine, weight, DEFAULT_COLOR);
	}

	public Car(String model, Engine engine, String color) {
		this(model, engine, DEFAULT_WEIGHT, color);
	}

	public Car(String model, Engine engine, int weight, String color) {
		this.model = model;
		this.engine = engine;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(model).append(":").append(System.lineSeparator());
		result.append(engine);
		result.append("Weight: ").append(this.weight == 0 ? "n/a" : this.weight).append(System.lineSeparator());
		result.append("Color: ").append(this.color);
		return result.toString();
	}
}
