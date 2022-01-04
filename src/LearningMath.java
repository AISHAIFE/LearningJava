
public class LearningMath {
	
	public static void main (String[]args) {
		
		int x = 8 , y = 64;
		
		//method can be used to find the highest value of x and y
		System.out.println("This method will print the highest value between x and y" +Math.max(x, y));
		//method can be used to find the lowest value of x and y
		System.out.println("This method will print the lowest value between x and y"+  Math.min(x, y));
		//finding the square root of numbers
		System.out.println("This method will print the square root of x"+ Math.sqrt(x));
		System.out.println("This is the square root of y:" + Math.sqrt(y));
		
		//finding randoms numbers
		System.out.println(Math.random() *x);
		
		//Working with Booleans
		System.out.println(x > y);
		System.out.println(x == y);
		System.out.println(x <= x);
		
	}

}
