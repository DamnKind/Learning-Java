package GunBesOdevBir.business.abstracts;

import GunBesOdevBir.entities.concretes.User;

public interface UserService {
	void singIn(User user);
	void logIn(User user);
	void logOut(User user);
}
