
public class MemberManager {
	public void add(Member member) {
		if(MemberCheckManager.checkIfReal(member)==true) {
			System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullan�c� veritaban�na kaydedildi.");
		}
		else {System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullan�c� veritaban�na kaydedilemedi.");}
		
	}
	public void delete(Member member) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullan�c� veritaban�ndan silindi.");
	}
	public void update(Member member) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullan�c� veritaban�nda g�ncellendi.");
	}
}
