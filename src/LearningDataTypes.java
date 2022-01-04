
public class LearningDataTypes {
	
	public static void main (String[]args) {
	
	//Working with other data types
	
			long myNum = 15000000000L;
			System.out.println(myNum);
			
			float myNum2 = 5.75f;
			System.out.println(myNum2);
			
			double myNum3 = 19.99d;
			System.out.println(myNum3);
			
			double myNum4 = myNum + myNum2 * myNum3;
			System.out.println(myNum4);
			
			/*A floating point number can also be a scientific number with an "e" to indicate the power of 10
			 * e3 means three zeros 
			 */
			float f1 = 35e3f;
			double d1 = 12E4d;
			System.out.println(f1);
			System.out.println(d1);
			
			//A boolean data type is declared with the boolean keyword and can only take the values true or false
			boolean isJavaFun = true;
			boolean isFishTasty = false;
			System.out.println(isJavaFun);     // Outputs true
			System.out.println(isFishTasty);   // Outputs false
			
			//The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'
			char myGrade = 'B';
			System.out.println(myGrade);
			
			char myVar1 = 65, myVar2 = 66, myVar3 = 67;
			System.out.println(myVar1);
			System.out.println(myVar2);
			System.out.println(myVar3);
			
	}

}
