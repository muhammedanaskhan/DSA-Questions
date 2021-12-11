package inheritance;

public class Box {

	double length;
	double width;
	double height;
	
	
	Box(){
		this.length = -1;
		this.width = -1;
		this.height =-1;
	
	}
	
	//cube
	Box(double side){
		this.height = side;
		this.width = side;
		this.height = side;
	}
	
	Box( double l , double h , double w ){
		this.length = l;
		this.width = w;
		this.height = h;
	}
	
	Box(Box old){
		this.height = old.height;
		this.length = old.length;
		this.width = old.width;
	}
	
}
