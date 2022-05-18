
public class MemberManager {
	public void add(Member member) {
		if(MemberCheckManager.checkIfReal(member)==true) {
			System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanýcý veritabanýna kaydedildi.");
		}
		else {System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanýcý veritabanýna kaydedilemedi.");}
		
	}
	public void delete(Member member) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanýcý veritabanýndan silindi.");
	}
	public void update(Member member) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanýcý veritabanýnda güncellendi.");
	}
}
