package GunBesOdevBir.dataAcces.concretes;

import GunBesOdevBir.dataAcces.abstracts.UserDao;
import GunBesOdevBir.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void singIn(User user) {
		System.out.println("Kay�t olundu.");
		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Giri� yap�ld�.");
		
	}

	@Override
	public void logOut(User user) {
		System.out.println("��k�� yap�ld�.");
		
	}

}
