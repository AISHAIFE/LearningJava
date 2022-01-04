
public class LearningSwitchCase {
	
	public static void main (String[]args) {
		
		//Switch example 1
		int myPostion = 3;
		
		switch (myPostion) {
		
		case 1:
			System.out.println("Dami is the first born of the family");
			break;
		case 2:
			System.out.println("Azeez is the second born of the family");
			break;
		case 3:
			System.out.println(" Yes, I am the third born of the family");
			break;
		case 4:
			System.out.println("Gafar is the fourth born");
			
		}
		
		//Switch example 2
		
		int statesVisted = 4;
		
		switch (statesVisted) {
		
		case 5:
			System.out.println("I have not visted Ohio");
			break;
		case 6:
			System.out.println("I have not visted Texas");
			break;
		case 7: 
			System.out.println("I have not visted LAS Vegas");
			break;
			default:
				System.out.println("I have visted the following states in the US\n 1.California\n 2. Utah\n 3. Chicago\n 4. New York");
		}
	}

}
