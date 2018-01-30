


public class Person {
	private String _gender;
	private String _name;
	private int _age;
	
	// Constructor replaces the setter method...
/*	public Person(String gender, String name) {
		this._gender = gender;
		this._name = name;
		
	} */ 
	
	public Person(int age) {
		this._age = age;
		
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
	
	//  PUBLIC METHODS --- EVENTS...	
	public void runs() {
		System.out.printf("%s Runs.", this._name);
	}

}
