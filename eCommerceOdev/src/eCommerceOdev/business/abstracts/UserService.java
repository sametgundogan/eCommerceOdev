package eCommerceOdev.business.abstracts;

import eCommerceOdev.entities.concretes.User;

public interface UserService {
	void register (User user);
	void signIn(String eMail, String password);

}
