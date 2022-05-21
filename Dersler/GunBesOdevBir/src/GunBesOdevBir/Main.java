package GunBesOdevBir;

import GunBesOdevBir.business.abstracts.UserService;
import GunBesOdevBir.business.concretes.UserManager;
import GunBesOdevBir.core.RegexManager;
import GunBesOdevBir.dataAcces.concretes.HibernateUserDao;
import GunBesOdevBir.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Ömer", "Sarý", "omer_sari_12@hotmail.com", "1234567");
		
		UserService userService = new UserManager(new HibernateUserDao(), new RegexManager()); 
		userService.singIn(user1);
		userService.logIn(user1);
		userService.logOut(user1);
		
			
			
		

}
}
