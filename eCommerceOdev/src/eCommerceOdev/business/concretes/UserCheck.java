package eCommerceOdev.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceOdev.business.abstracts.UserCheckService;
import eCommerceOdev.entities.concretes.User;

public class UserCheck implements UserCheckService{

	List<String> eMailList = new ArrayList<String>();
	@Override
	public boolean checkUserName(User user) {
		if(user.getUserName().length()< 3) {
			System.out.println("İsminiz iki karakterden fazla olmalıdır.");
			
			return false;
		}
		return false;
	}

	@Override
	public boolean checkUserLastName(User user) {
		if(user.getUserLastName().length()< 3) {
			System.out.println("Soyisminiz iki karakterden fazla olmalıdır.");
			
			return false;
		}
		return false;
	}

	

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("Şifre girmeniz gerekmektedir.");
			return false;
		}else {
			if(user.getPassword().length() < 6) {
				System.out.println("Şifreniz 6 karakterden uzun olmalıdır.");
			return false;
		}
		}
		
		return true;
	}

	@Override
	public boolean checkUniquenesseMail(User user) {
		boolean result = true;
		if(eMailList.contains(user.getUserMail())) {
			System.out.println("Bu mail daha önceden alınmış. Lütfen başka bir adres deneyin.");
			result = false;
		}else {
			result = true;
			eMailList.add(user.getUserMail());
		}
		return result;
			
	}

	

	@Override
	public boolean checkeMail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if(user.getUserMail().isEmpty()) {
			System.out.println("eMail kısmı boş bırakılamaz!");
			return false;
		}else {
			if(pattern.matcher(user.getUserMail()).find() == false) {
				System.out.println("eMail ismi şablona uygun olmalıdır. Örn: abc123@asd.com");
				return false;
				
			}
		}
		return true;
	}
	@Override
	public boolean checkValideMail(User user) {
		if(checkUserLastName(user) && checkUserName(user) && checkUniquenesseMail(user) && 
				checkeMail(user) && checkPassword(user)) {
			return true;
		}
		return false;
	}
}
