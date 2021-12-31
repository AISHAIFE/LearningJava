
public class ArraysinJava {
	
	public static void main (String[]args) {
		
		
		String [] cars = {"Lexus","Toyota","Honda","Ford","Mercedes"};
		
		//Changing an array element
		cars[0]="BMW";
		
		//for loop
		for (int i=0;i<cars.length;i++)
			System.out.println("Element at index: " + i + cars[i]);
		
		//foreach loop
		for(String j:cars)
			System.out.println("Element at index: " + j);
		
		System.out.println(cars[0]);
		System.out.println(cars[3]);
		
		//Multi-Dimensional Arrays
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[0][0];
		int x1 = myNumbers[0][1];
		int x2 = myNumbers[0][2];
		int x3 = myNumbers[0][3];
		int x4 = myNumbers[1][0];
		int x5 = myNumbers[1][1];
		int x6 = myNumbers[1][2];
		System.out.println("These are the values of the array:");
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x6);
		
		for (int m = 0; m < myNumbers.length; ++m) {
		      for(int n = 0; n < myNumbers[m].length; ++n) {
		        System.out.println(myNumbers[m][n]);
		      }
		    }
	}

}
