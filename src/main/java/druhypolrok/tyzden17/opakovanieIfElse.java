package druhypolrok.tyzden17;

public class opakovanieIfElse {
	public static void main(String[] args) {
		naseIfElse(10);
		naseIfElse(15);
		naseIfElse(20);
	}
	public static void naseIfElse(int x){
		int hodina = x;
		if (hodina < 12)
		System.out.println("Je " + hodina + " hodín " + "a je dopoludnia");
		else if (hodina<15){
			System.out.println("Je " + hodina + " hodín" + "a je popoludni");
		}
		else  {
			System.out.println("Je " + hodina + " hodín" + "a je noc");
		}
	}
}
