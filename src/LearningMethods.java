
public class LearningMethods {
	
	
	//Method without parameters
	public static void firstMethod() {
		
		int x = 5;
		int y = 10;
		int z = x+y;
		int a = y/x;
		int b = y-x;
		
		System.out.println("The value of z, a & b respectively are:");
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		
	}
	
	//Method with parameters
	public static void abdulwahabMethod(String firstname,int age) {
		
		System.out.println( firstname + " " +  "Abdulwahab" + "is" + " " + age);
	}
	
	//Method with return value
	
	public static int returnMethod(int a,int b) {
		
		int z = a+b;
		return z;
		
	}
	
	
	public static void main (String[]args) {
		
		firstMethod();
		abdulwahabMethod("Damilola",28);
		abdulwahabMethod("Oluwatobi",25);
		abdulwahabMethod("Ifeoluwa",23);
		abdulwahabMethod("Eniola",19);
		
		System.out.println(returnMethod(5,3));
		
	}

}
