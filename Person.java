
public class Person {
	private String name;
	private String surname;
	
	
	
	
	public Person(String naa, String surn)
	{
		this.name = naa;
		this.surname = surn;
	
	}
	
	public String toString()
	{
		return String.format("The Name is %s and the Surname is %s", name, surname);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSName(String surnname)
	{
		this.surname = surname;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getSName()
	{
		return this.surname;
	}

}
