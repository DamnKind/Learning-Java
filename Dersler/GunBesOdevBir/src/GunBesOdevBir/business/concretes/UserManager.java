package GunBesOdevBir.business.concretes;

import GunBesOdevBir.business.abstracts.UserService;
import GunBesOdevBir.core.RegexService;
import GunBesOdevBir.dataAcces.abstracts.UserDao;
import GunBesOdevBir.entities.concretes.User;
import java.util.Random;
import java.util.Scanner;




public class UserManager implements UserService{
	private UserDao userDao;
	private RegexService regexService;


	public UserManager(UserDao userDao, RegexService regexService) {
		super();
		this.userDao = userDao;
		this.regexService= regexService;
	}

	@Override
	public void singIn(User user) {
		if(user.getPassword().length()<=6) {
			System.out.println("Parola uzunlu�u 6 karakterden uzun olmal�d�r");
			System.out.println("Kay�t ba�ar�s�z.");
		}
		else if(user.getFirstName().length()<=2 || user.getLastName().length()<=2) {
			System.out.println("�sminiz ve soyisminizim uzunlu�u 2 karakterden uzun olmal�d�r.");
			System.out.println("Kay�t ba�ar�s�z.");
		}
		else if(regexService.checkValid(user)==false) {
			System.out.println("Ge�erli bir e-posta adresi giriniz.");
			System.out.println("Kay�t ba�ar�s�z.");
		}
		else {
			System.out.println("Sisteme kay�t olmak i�in son olarak do�rulama kodunu giriniz.");
			Random rand = new Random();
			int rand1 = rand.nextInt(1000);
			System.out.println("Do�rulama kodu : " + rand1);
			Scanner scanner = new Scanner(System.in);
			int myobj = scanner.nextInt();
			while(rand1!=myobj) {
				System.out.println("Hatal� giri� yapt�n�z. L�tfen do�rulama kodunu tekrar giriniz.");
			}
			System.out.println("Do�rulama kodu do�ru.");
			this.userDao.singIn(user);
			
		}
		
		
	}
	boolean logInCheck = false;
	@Override
	public void logIn(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("L�tfen e-postan�z� giriniz.");
		String email = scanner.nextLine();
		System.out.println("L�tfen �ifrenizi giriniz.");
		String password = scanner.nextLine();
		scanner.close();
		
		
		if(email.toLowerCase().equals(user.getEmail().toLowerCase())!=true) {
			System.out.println("E-postan�z� yanl�� girdiniz.");	
		}
		else if(password.equals(user.getPassword())!=true) {
			System.out.println("�ifrenizi yanl�� girdiniz.");
		}
		else {
			this.userDao.logIn(user);
			System.out.println("Ho� geldiniz.");
			logInCheck=true;
		}
		
		
	}

	@Override
	public void logOut(User user) {
		if(logInCheck==true) {
			this.userDao.logOut(user);
			System.out.println("Tekrar g�r��mek �zere.");
		}
		else {System.out.println("Girmedin ki ��kas�n hocam.");}
		
		
	}
	
	
	
	
}
