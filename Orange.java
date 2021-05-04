package Exercise4p4;

public class Orange extends Fruits {
	
	private double vitC;
	private double weight;
	private String taste;
	
	public Orange(String name, double w, String t, double vc) {
		
		super(name);
		this.vitC = vc;
		this.weight = w;
		this.taste = t;
		
		if(this.weight<= 76) {
			getVitC();
			System.out.println("Weight              : " + this.weight + " g");
			System.out.println("Size of orange      : Small");
			System.out.printf("Amount of Vitamin C : %.2f mg%n", getVitC());
		}
		
		else if(this.weight > 76 && this.weight <= 88 ) {
			double nVC = 46.8;
			getVitC(nVC);
			System.out.println("Weight              : " + this.weight + " g");
			System.out.println("Size of orange      : Medium");
			System.out.printf("Amount of Vitamin C : %.2f mg%n", getVitC(nVC));
		}
		
		else if(this.weight >88) {
			double nVC = 63.82;
			String harm = "You consume too much orange. It is very harmful!!!";
			getVitC(nVC);
			System.out.println("Weight              : " + this.weight + " g");
			System.out.println("Size of orange      : Large");
			System.out.printf("Amount of Vitamin C : %.2f mg%n%s", getVitC(nVC), harm);
		}
		
	}
	
	public double getVitC() {   //overloading method with no parameter
		return this.vitC * this.weight;
	}
	
	public double getVitC(double nvc) {   //overloading method with 1 parameter
		return nvc * this.weight;
	}
	
	public String getTaste() {
		return "\nThe taste of orange : " + this.taste;
	}
}
