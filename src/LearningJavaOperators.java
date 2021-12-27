
public class LearningJavaOperators {

	public static void main (String[]args) {
		
		//Arithmetic Operators
		
		int x = 10;
		int y = 2;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//Assignment Operators
		
		//The addition assignment operator (+=) adds a value to a variable
		
		int a = 10;
		a += 5;//a = a + 5
		System.out.println(a);
		int b = 7;
		b -= 4;//b = b - 4
		System.out.println(b);
		int c = 10;
		c %= 2;
		System.out.println(c);
		
		// Comparison Operators
		
		int w = 5;
	    int f = 3;
	    System.out.println(w == f); // returns false because 5 is not equal to 3
	    System.out.println(w != f);
	    System.out.println(w>f);
	    System.out.println(w<f);
	    System.out.println(w<=f);
	    System.out.println(w>=f);
				
	}
}
