package GunBesOdevBir.dataAcces.concretes;

import GunBesOdevBir.dataAcces.abstracts.UserDao;
import GunBesOdevBir.entities.concretes.User;

public class GoogleUserDao implements UserDao{
	public void singIn(User user) {
		System.out.println("Google hesabý ile kayýt olundu.");
		
	}

	@Override
	public void logIn(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void logOut(User user) {
		// TODO Auto-generated method stub
		
	}
}
