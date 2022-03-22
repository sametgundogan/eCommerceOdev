package eCommerceOdev;

import eCommerceOdev.business.abstracts.UserService;
import eCommerceOdev.business.concretes.UserCheck;
import eCommerceOdev.business.concretes.UserManager;
import eCommerceOdev.business.concretes.eMailCheckManager;
import eCommerceOdev.core.LoginAdapterManager;
import eCommerceOdev.dataAccess.concretes.HibernateUserDao;
import eCommerceOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User kullanici1 = new User();
		kullanici1.setUserId(112);
		kullanici1.setUserName("a");
		kullanici1.setUserLastName("fssss");
		kullanici1.setUserMail("exadcc.com");
		kullanici1.setPassword("sa");
		
		UserService userManager = new UserManager(new HibernateUserDao(), new eMailCheckManager(), new UserCheck());
		userManager.register(kullanici1);
	
	
	}

}

