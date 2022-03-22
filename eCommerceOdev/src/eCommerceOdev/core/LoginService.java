package eCommerceOdev.core;

import eCommerceOdev.entities.concretes.User;

public interface LoginService {
	void register(User user);
	void signIn(User user);

}
