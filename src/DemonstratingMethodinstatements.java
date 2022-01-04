
public class DemonstratingMethodinstatements {
	
	public static void graduateAssistantship(String name ,double gpa) {
		
		if(gpa>3.5) {
			
			System.out.println("Congratulations" + " " + name + " "+ "You have been awarded the graduate assistantship role for the Spring quater" );
		}else if (gpa==3.5) {
			
			System.out.println("Congratulations"+ " " + name + " " + "You have been awarded the graduate assistantship role for the Spring quater" );
		}else {
			
			System.out.println("Dear" + " " + name + "Try Again next quater" );
		}
		
		
	}
	public static void main (String[]args) {
		
		graduateAssistantship("Aisha" ,3.0);
		
	}

}
