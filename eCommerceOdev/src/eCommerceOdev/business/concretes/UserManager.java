package eCommerceOdev.business.concretes;

import eCommerceOdev.business.abstracts.UserCheckService;
import eCommerceOdev.business.abstracts.UserService;
import eCommerceOdev.business.abstracts.eMailCheckService;
import eCommerceOdev.dataAccess.abstracts.UserDao;
import eCommerceOdev.entities.concretes.User;

public class UserManager implements UserService{
	 UserDao userDao;
	 eMailCheckService eMailService;
	 UserCheckService userCheckService;
	
	
	public UserManager(UserDao userDao, eMailCheckService eMailService, UserCheckService userCheckService) {
		super();
		this.userDao = userDao;
		this.eMailService = eMailService;
		this.userCheckService = userCheckService;
	}
	

	@Override
	public void register(User user) {
		if(userCheckService.checkValideMail(user) == true) {
			eMailService.verificationeMail(user);
			eMailService.verifyMail(user);
			System.out.println("Kayıt başarılı!");
		}else {
			System.out.println("ssss");			
		}
	}

	@Override
	public void signIn(String eMail, String password) {
		if(userDao.eMail(eMail) == true && userDao.password(password) == true) {
			System.out.println("Sistem girişi başarılı.");
		}else {
				System.out.println("Mail ya da şifre hatalı. Lütfen tekrar deneyin.");
			}
		}
		
			
		
	}


