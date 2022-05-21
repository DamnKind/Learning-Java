package GunBesOdevBir.dataAcces.abstracts;

import GunBesOdevBir.entities.concretes.User;

public interface UserDao {
	void singIn(User user);
	void logIn(User user);
	void logOut(User user);
	
}
