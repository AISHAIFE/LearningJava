
public class LearningIfElseStatement {
	
	public static void main (String[]args) {
		
		int x = 2;
		int y = 10;
		int z = x*y;
		
		if(y<x) {
			System.out.println("x is greater than y"  + "\n" + "The value of z is" + " "  + z);
		}
		else {
			System.out.println("y is greater than x");
		}
		
		int time = 14;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
		//Short Hand If...Else (Ternary Operator)
		//variable = (condition) ? expressionTrue :  expressionFalse;
		String result = (time < 10) ? "Good day." : "Good evening.";
		System.out.println(result);
	}

}
