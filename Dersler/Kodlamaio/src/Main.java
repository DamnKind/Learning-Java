
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.age="21";
		student1.id=1;
		student1.name="Bilal Avcı";
		student1.University="AKÜ";
		
		Student student2 = new Student();
		student2.age="21";
		student2.id=2;
		student2.name="Ömer Sarı";
		student2.University="MAKÜ";
		
		Instructor instructor1 = new Instructor();
		instructor1.age="35";
		instructor1.id=3;
		instructor1.lecture="Java";
		instructor1.name="Engin Demiroğ";
		
		User[] users = {student1, student2, instructor1};
		UserManager userManager = new UserManager();
		for(User user: users) {
			userManager.addUser(user);
		}
		userManager.deleteUser(student2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addLecture(student1, "Malzeme Bilgisi");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addLecture(instructor1, "Java");
		
	}

}
