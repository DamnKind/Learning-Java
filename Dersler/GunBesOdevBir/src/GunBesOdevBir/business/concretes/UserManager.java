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
			System.out.println("Parola uzunluðu 6 karakterden uzun olmalýdýr");
			System.out.println("Kayýt baþarýsýz.");
		}
		else if(user.getFirstName().length()<=2 || user.getLastName().length()<=2) {
			System.out.println("Ýsminiz ve soyisminizim uzunluðu 2 karakterden uzun olmalýdýr.");
			System.out.println("Kayýt baþarýsýz.");
		}
		else if(regexService.checkValid(user)==false) {
			System.out.println("Geçerli bir e-posta adresi giriniz.");
			System.out.println("Kayýt baþarýsýz.");
		}
		else {
			System.out.println("Sisteme kayýt olmak için son olarak doðrulama kodunu giriniz.");
			Random rand = new Random();
			int rand1 = rand.nextInt(1000);
			System.out.println("Doðrulama kodu : " + rand1);
			Scanner scanner = new Scanner(System.in);
			int myobj = scanner.nextInt();
			while(rand1!=myobj) {
				System.out.println("Hatalý giriþ yaptýnýz. Lütfen doðrulama kodunu tekrar giriniz.");
			}
			System.out.println("Doðrulama kodu doðru.");
			this.userDao.singIn(user);
			
		}
		
		
	}
	boolean logInCheck = false;
	@Override
	public void logIn(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen e-postanýzý giriniz.");
		String email = scanner.nextLine();
		System.out.println("Lütfen þifrenizi giriniz.");
		String password = scanner.nextLine();
		scanner.close();
		
		
		if(email.toLowerCase().equals(user.getEmail().toLowerCase())!=true) {
			System.out.println("E-postanýzý yanlýþ girdiniz.");	
		}
		else if(password.equals(user.getPassword())!=true) {
			System.out.println("Þifrenizi yanlýþ girdiniz.");
		}
		else {
			this.userDao.logIn(user);
			System.out.println("Hoþ geldiniz.");
			logInCheck=true;
		}
		
		
	}

	@Override
	public void logOut(User user) {
		if(logInCheck==true) {
			this.userDao.logOut(user);
			System.out.println("Tekrar görüþmek üzere.");
		}
		else {System.out.println("Girmedin ki çýkasýn hocam.");}
		
		
	}
	
	
	
	
}
