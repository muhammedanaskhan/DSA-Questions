package staticExample;

public class Main {

	public static void main(String[] args) {
		
//		Human anas = new Human(19,"anas", 5000, false);
//		Human kunal = new Human(22,"kunal", 10000, true);
//
//		System.out.println(anas.population);
//		
		
		//greeting();     You cannot call a non static method inside a static one
	}
	
	void greeting () {
		fun();  // cannot be called
		
		Main obj = new Main();
		obj.greeting();               //unless refferrd to as by object of class which contain the method
		
	
	}
	
	static void static_fun() {
		
	}
	
	void non_static_fun() {
		greeting();
	}
}
