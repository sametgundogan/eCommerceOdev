package eCommerceOdev.core;

import eCommerceOdev.GoogleLoginManager.LoginManager;
import eCommerceOdev.entities.concretes.User;

public class LoginAdapterManager implements LoginService{

	LoginManager googleAuthor = new LoginManager();		

	@Override
	public void register(User user) {
		googleAuthor.register(user.getUserMail(), user.getPassword());
	}

	@Override
	public void signIn(User user) {
		googleAuthor.signIn(user.getUserMail(), user.getPassword());		
	}

}
