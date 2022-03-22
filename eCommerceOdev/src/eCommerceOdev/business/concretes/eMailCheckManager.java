package eCommerceOdev.business.concretes;

import eCommerceOdev.business.abstracts.eMailCheckService;
import eCommerceOdev.entities.concretes.User;

public class eMailCheckManager implements eMailCheckService{

	@Override
	public void verificationeMail(User user) {
		System.out.println("Doğrulama kodu gönderildi. " + user.getUserMail());
	}

	@Override
	public void verifyMail(User user) {
		System.out.println("Mail başarıyla doğrulandı.");		
	}
	
}
