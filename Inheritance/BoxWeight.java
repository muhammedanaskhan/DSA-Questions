package inheritance;

public class BoxWeight extends Box{

	
	double weight;
	
	BoxWeight(){
		this.weight = -1;
	}
	
	BoxWeight(double l , double h , double w , double weight){
		super(l,h,w);
		this.weight = w;
	}
	
	
}
