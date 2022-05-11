
public class InstructorManager extends UserManager{
	public void addLecture(Instructor instructor, String lecture) {
		System.out.println(instructor.name + " isimli eğitmene " + lecture + " isimli ders atanmıştır.");
	}
}
