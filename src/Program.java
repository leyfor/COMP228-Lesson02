import java.util.Scanner;

public class Program {
	
   public static Person person; // reference to the Person class
  
	public static void main(String[] args) {
		System.out.println("Program Started...");
		Scanner input = new Scanner(System.in);
		
		// Prompt user for Name
		System.out.println("Please enter your name: ");
		String myName = input.nextLine();	
		
		
		// Prompt user for Gender
		System.out.println("Please enter your gender: ");
		String myGender = input.nextLine();	
		
		
		// Prompt user for age
		System.out.print("Please enter your age: ");
		int myAge = input.nextInt();
		
		person = new Person(myAge);
		person.setName(myName);
		person.setGender(myGender);
		
		
		System.out.println(person.getName());
		System.out.println(person.getGender());
		
		person.runs();
		System.out.println();
		
		System.out.println(person.getName() + " is " + person.getAge() + " Years old");
	
	}
	

}
