/**
 * PersonDriver.java
 * 
 * Description of Program
 * 
 * @author JESS CONWAY
 */

import java.io.*;;
import java.util.*;

public class PersonDriver
{
 	public static void main(String args[])
 	{
 		Person person1 = new Person();
 		System.out.println(person1.getName());
 		System.out.println(person1.getAge());
 		
 		Person person2 = new Person("Jess", 18);
 		System.out.println(person2.getName());
 		System.out.println(person2.getAge());
 		
 		Person person3 = new Person();
 		person3.setName("Ciara Johnson");
 		person3.setAge(17);
 		System.out.println(person3.getName());
 		System.out.println(person3.getAge());
 		
 		Person person4 = new Person();
 		person4.setName("Daniel", "Tripp");
 		person4.setAge(19);
 		System.out.println(person4.getName());
 		System.out.println(person4.getAge());
 		
 		Person.createToddler();
		Person.createPreschooler();
		Person.createAdolescent();
		Person.createTeenager();
		Person.createAdult();
		
		
		
		
	}	
	
}