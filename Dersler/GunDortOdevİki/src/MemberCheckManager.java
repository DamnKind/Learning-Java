
public class MemberCheckManager {
	public static boolean checkIfReal(Member member) {
		if(member.getNationalId() == member.getNationalId()) {
			System.out.println("Kimlik numaras� do�ru");
			return true;
		}
		else {System.out.println("Kimlik numaras� yanl��"); return false;}
	}
}
