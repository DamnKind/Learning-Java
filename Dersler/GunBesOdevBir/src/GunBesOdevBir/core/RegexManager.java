package GunBesOdevBir.core;
import java.util.regex.*;

import GunBesOdevBir.entities.concretes.User;

public class RegexManager implements RegexService{

	@Override
	public boolean checkValid(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		System.out.println(user.getEmail() +" : "+ matcher.matches());
		boolean result = matcher.matches();
		return result;
	}

	
}
	
 
 


