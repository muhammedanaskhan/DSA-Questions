package staticExample;

public class Human {                                                           //class

	int age;
	String name;
	int salary;
	boolean married;
	static long population;
	
	public Human(int age, String name, int salary, boolean married) {          //constructor
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		
		Human.population +=1 ;
	}

}
