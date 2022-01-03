
public class MethodOverloading {
	
	public static int bioDataMethod(int a , int b) {
		
		return a+b;		
		}
	
	
	public static String bioDataMethod(String fname,String lname) {
		
		return fname + lname;
	}
	
	public static void main (String[]args) {
		
		int age = bioDataMethod(10,13);
		String fullname = bioDataMethod("Aisha","Abdulwahab");
		
		System.out.println("My name is : " + fullname + "I am " + age + " " + "Years old");
	}

}
