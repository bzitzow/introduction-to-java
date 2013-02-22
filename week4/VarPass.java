public class VarPass {
	
	public static void main(String[] args) {
		// test pass-by-value:
		int x = 10;
		if (methodA(x) != x) {
			System.out.println("a and x values are unchanged");
		} else {
			System.out.println("x was replaced by value a");
		}
		
		// test pass-by-reference
		k9 fifi = new k9();
		System.out.println(fifi.getBark());
		methodB(fifi);
		if (fifi.getBark().equals("Woof")) {
			System.out.println("fifi.bark is unchanged");
		} else {
			System.out.println("fifi's bark has been altered!");
		}
		System.out.println("Fifi now makes a " + fifi.getBark());
	}
	
	public static int methodA(int a) {
		a = 5;
		return a;
	}
	
	public static void methodB(k9 dog) {
		// change bark to yip in instance dog, NOT instance fifi
		dog.bark = "yip, yip";
	}
}

class k9 extends VarPass {
	// define a class type k9
	public String bark;
	
	public k9()
	{
		// constructor initializes var bark to 'woof'
		this.bark = "Woof";
	}
	
	public String getBark() 
	{
		return this.bark;
	}
}