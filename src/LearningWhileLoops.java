
public class LearningWhileLoops {
	
	public static void main (String[]args) {
		
		// While Loop Example 1
		int x = 0;
		
		while(x<=15) {
			
			System.out.println(x + " " + " is less than 15");
			x++;
		}
		
		int i = 1;
		int sum = 0;
		
		while(i<10) {
			
			sum = sum + i;
			i++;
		}
		System.out.println("Summation: " + sum);
		
		 int m = 1, sum1 = 0;
		  
	        // Exit when x becomes greater than 4
	        while (m <= 10) {
	            // summing up x
	            sum1 = sum1 + m;
	  
	            // Increment the value of x for
	            // next iteration
	            m++;
	        }
	        System.out.println("Summation: " + sum1);
	}

}
