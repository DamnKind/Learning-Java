
public class MemberManager {
	public void add(Member member) {
		if(MemberCheckManager.checkIfReal(member)==true) {
			System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanıcı veritabanına kaydedildi.");
		}
		else {System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanıcı veritabanına kaydedilemedi.");}
		
	}
	public void delete(Member member) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanıcı veritabanından silindi.");
	}
	public void update(Member member) {
		System.out.println(member.getFirstName()+" "+member.getLastName()+ " isimli kullanıcı veritabanında güncellendi.");
	}
}
