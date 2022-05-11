
public class StudentManager extends UserManager{
	public void addLecture(Student student, String lecture) {
		System.out.println(student.name + " isimli öğrenci " + lecture + " isimli derse kayıt oldu.");
	}
}
