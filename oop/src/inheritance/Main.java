package inheritance;


public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		
		User user1 = new Student(1, "Baris", "Kabal", "1234", "baris@baris.com");
		userManager.showInformation(user1);
		
		User user2 = new Instructor(1, "Bariss", "Kaball", "12345", "bariss@baris.com");
		userManager.showInformation(user2);
		
		
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		String [] addingCourse1 = {"Java",  "JS"};
		instructorManager.addCourse(addingCourse1);
		
		StudentManager studentManager = new StudentManager();
		String [] addingCourse2 = {"C#"};
		studentManager.addCourse(addingCourse2);
	}

}
