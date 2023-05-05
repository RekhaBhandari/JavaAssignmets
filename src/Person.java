import java.util.Scanner;

public class Person {
	
	private String roll;
	private String name;
	private String nationality;
	
	public Person(String roll, String name, String nationality){
		this.roll = roll;
		this.name = name;
		this.nationality = nationality;
	}
	
	
	
	public String getRoll() {
		return roll;
	}



	public void setRoll(String roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNationality() {
		return nationality;
	}



	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



	public void display() {
		System.out.println("Details of the person is as follows: ");
		System.out.println("Roll no : " + this.roll);
		System.out.println("Name : " + this.name);
		System.out.println("Nationality : " + this.nationality);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter roll no of person: ");
		String roll = scnr.next();
		System.out.println("Enter Name of person: " );
		String name = scnr.next();
		System.out.println("Enter Nationality of Person: ");
		String nationality = scnr.next();
		
		Person person = new Person(roll, name, nationality);
		
		person.display();

	}

}
