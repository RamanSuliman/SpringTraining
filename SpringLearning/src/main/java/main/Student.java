package main;

/**
 * A simple bean class.
 * 
 * @author raman
 */
public class Student 
{
	private String name;
	private int grade;
	private Address address;

	//Instance of Address class is provided by XML file either by constructor or setter method.	
	public Student(String name, int grade, Address address)
	{
		this.grade = grade;
		this.name = name;
		this.address = address;
	}
	
	public void displayStudentInfo()
	{
		System.out.println(name + ": " + grade);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void displayInfo()
	{
		System.out.println("Hello " + name);
	}

	public Address getAddress() {
		return address;
	}
}
