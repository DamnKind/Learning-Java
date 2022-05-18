
public class MemberCheckManager {
	public static boolean checkIfReal(Member member) {
		if(member.getNationalId() == member.getNationalId()) {
			System.out.println("Kimlik numarasý doðru");
			return true;
		}
		else {System.out.println("Kimlik numarasý yanlýþ"); return false;}
	}
}
