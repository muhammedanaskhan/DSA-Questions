package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Box red = new Box();
		Box cube = new Box(22.4);
		Box newBox = new Box(red);
		
		
		Box box2 = new BoxWeight(2,1,3,5);
		System.out.println(box2.width);
		System.out.println(box2.width);									// It is actually the type of reference variable (Box here) and 
		                                            //not the type of the object which determines what variables can be accessed
		
		
	}
}  

