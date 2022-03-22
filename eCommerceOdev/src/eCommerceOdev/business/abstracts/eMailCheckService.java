package eCommerceOdev.business.abstracts;

import eCommerceOdev.entities.concretes.User;

public interface eMailCheckService {
	void verificationeMail(User user);
	void verifyMail(User user);
}
