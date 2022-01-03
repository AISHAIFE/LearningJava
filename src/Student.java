
public class Student {
	
	//Instances
	String fullname;
	String id;
	String course;
	double gpa;
	String quater;
	
	//Constructor method
	public Student (String name, String idn, String cos, String quatert, double gradepa) {
		
		fullname = name;
		id = idn;
		course = cos;
		gpa = gradepa;
		quater = quatert;
		
	}
	
	public static void main (String[]args) {
		
		Student student1 = new Student ("Aisha Abdulwahab" ,"2062047","Software Engineering","Winter Quater",3.9);
		Student student2 = new Student ("Aisha kasali" ,"2062048","Software Engineering","Winter Quater",3.5);
		boolean highestgpa = student1.gpa> student2.gpa;
		System.out.println("Welcome To Depaul University" + student1.fullname + "&" + student2.fullname);
		System.out.println("Your Student IDs respectively are" + student1.id + "&" + student2.id);
		System.out.println("Your Course is study is" + student1.course);
		System.out.println("Your GPA respectively are" + student1.gpa + "&" + student2.gpa);
		System.out.println("Your are Enrolled to the" + student1.quater);
		System.out.println("The Statement that Student 1 GPA is higher than Student 2 GPA is:" + highestgpa);
		
		
		
	}

}
