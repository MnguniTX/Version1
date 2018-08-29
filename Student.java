
public class Student extends Person {
	private int no;
	private static int n = 1;
	
	//private String surname;
	
	public Student(String name, String surname, int no)
	{
		super(name, surname);
		n++;
		this.no = no;
	}
	
	public String toString()
	{
		return String.format("The Student Number is %d and the "
				+ "name is %s %s and %d" , no, getName(), getSName(), n);
	}

}
