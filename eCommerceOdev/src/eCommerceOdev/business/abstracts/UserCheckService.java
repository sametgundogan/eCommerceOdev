package eCommerceOdev.business.abstracts;

import eCommerceOdev.entities.concretes.User;

public interface UserCheckService {
	boolean checkUserName(User user);
	boolean checkUserLastName(User user);
	boolean checkeMail(User user);
	boolean checkPassword(User user);
	boolean checkUniquenesseMail(User user);
	boolean checkValideMail(User user);
	

}
