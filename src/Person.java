


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
		this._initialize(age, "Unknown", "Unknown");
		
	}
	
	// PRIVATE METHODS.....
	
	private void _initialize(int age, String name, String gender) {
			this.setName(name);
			this.setGender(gender);
			this._age = age;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		this._gender = gender;
	}


	public void setName(String name) {
		this._name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public int getAge() {
		return _age;
	}

 //	public void set_age(int _age) {
	//	this._age = _age;
//	}

	//  PUBLIC METHODS --- EVENTS...	
	public void runs() {
		System.out.printf("%s Runs and is %d years old.", this.getName(), this.getAge());
	}

}
