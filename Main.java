package Exercise4p4;

public class Main {

public static void main(String[] args) {
		
		/*System.out.println("Info of Fruits");
		System.out.println("---------------");
		Fruit zFruit = new Fruit("Fruits");*/
		
		Apple q = new Apple("Apple", 12 , 3.0, "Central Aisa");
		System.out.println(q.toString());
		System.out.println(q.taste());
		
		FujiApple FA = new FujiApple("Fuji Apple", 3, 4.0, "Japan", 26.26);
		System.out.println(FA.toString());
		System.out.println(FA.taste());
		
		GreenApple GA = new GreenApple("Green Apple", 30, 3.0, "Australia", "Green");
		System.out.println(GA.toString());
		System.out.println(GA.taste());
		
		System.out.println("Info of Grapes");
		System.out.println("---------------");
		Grapes G = new Grapes("Grapes", 288, 200, "Red");
		System.out.println(G.getTaste());
		
		System.out.println();

		System.out.println("Info of Orange");
		System.out.println("---------------");
		Orange O = new Orange("Orange", 793, "Sour", 40.42);
		System.out.println(O.getTaste());
	}
}

