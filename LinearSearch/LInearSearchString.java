package dsa;
import java.util.*;

public class LInearSearchString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name");
		String name = sc.nextLine();
	
		System.out.println("enter target");
		char t = sc.next().charAt(0);
	
		boolean found = linearSearch(name, t);
		System.out.println(found);
	}
	
	static boolean linearSearch( String str , char target ) {
		
		for( int i = 0 ; i < str.length() ; i++ ) {
			if( target == str.charAt(i) ) {
				return true;
			}
		}
		
	
		return false;
		
	}

}
