
public class LearningStrings {
	
	public static void main (String[]args) {
		
		//The length() method counts the number of letters in a string
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		String name = "Aisha Ife Abdulwahab";
		System.out.println("The length of the name string is: " + name.length());
	
		//Other methods in Java
		System.out.println("Converting my name and surname to uppercase: " + name.toUpperCase());
		System.out.println("Converting my name and surname to lowercase: " + name.toLowerCase());
		System.out.println("Getting the postion of a text in a string: " + name.indexOf("Ife"));
		
		//Concatenation in strings
		
		String firstName = "Aisha";
		String lastName = "Abdulwahab";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat("\t" +lastName));
		
	}

}
