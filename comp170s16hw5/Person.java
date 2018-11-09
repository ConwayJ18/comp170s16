public class Person
{
	private String name;
	private int age;
	
 	public Person()
	{
		name = "No name yet";
		age = 0;
	}
	
	public Person(String newName, int newAge)
	{
		name = newName;
		age = newAge;
	}
	
	public void setName(String fullName)
	{
		name = fullName;
	}
	
	public void setName(String firstName, String lastName)
	{
		name = firstName + " " + lastName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void createToddler()
	{
		Person aToddler = new Person("A toddler", 2);
	}
	
	public static void createPreschooler()
	{
		Person aPreschooler = new Person("A preschooler", 5);
	}
	
	public static void createAdolescent()
	{
		Person anAdolescent = new Person("An adolescent", 9);
	}
	
	public static void createTeenager()
	{
		Person aTeenager = new Person("A teenager", 15);
	}
	
	public static void createAdult()
	{
		Person anAdult = new Person("An adult", 21);
	}
}