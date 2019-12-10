package exercise_05;

public class Citizen implements Identifiable {
	String name;
	int age;
	String id;
	
	public Citizen(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String getId() {
		return this.id;
	}
	
	

}
