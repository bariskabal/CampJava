package inheritance;

public class InstructorManager extends UserManager{

	@Override
	public void addCourse(String[] course) {
		System.out.println("course is added to system");
		super.addCourse(course);
		
	}
}
