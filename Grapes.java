package Exercise4p4;

public class Grapes extends Fruits {

	protected int kJoules;
	protected int amount;
	protected String color;
	
	public Grapes(String name, int kJ, int a, String c) {
		super(name);
		this.kJoules = kJ;
		this.amount = a;
		this.color = c;
		
		if (this.color.equals("Red")) {
			calcNutrition();
			System.out.println("Food energy provided by 100 g Red Grapes  : "+ this.kJoules + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Red Grapes  : "+ calcNutrition() + " kJ");
		}
		
		else if (this.color.equals("Green")) {
			int nKj = 300;
			calcNutrition(nKj);
			System.out.println("Food energy provided by 100 g Green Grapes: "+ nKj + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Green Grapes: "+ calcNutrition(nKj) + " kJ");
		}
		
		else
			System.out.println("There are no such color.");
	}
	 public int calcNutrition() {
		 return this.kJoules * this.amount;
	 }
	 
	 public int calcNutrition(int nKj) {
		 return nKj * this.amount;
	 }
	 
	 public String getTaste() {
			return "The taste of grapes                       : Sweet and Sour";
		}
	
}
