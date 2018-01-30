
public class Program {
	
   public static Person person; // reference to the Person class
  
	public static void main(String[] args) {
		System.out.println("Program Started...");
		person =  new Person(35);	
		person.setName("Tom");
		person.setGender("Male");
		
		System.out.println(person.getName());
		System.out.println(person.getGender());
		
		person.runs();
		
		System.out.println(person.getAge());
	
	}
	

}
