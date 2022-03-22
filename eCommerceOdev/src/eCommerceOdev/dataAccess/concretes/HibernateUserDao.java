package eCommerceOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceOdev.dataAccess.abstracts.UserDao;
import eCommerceOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	@Override
	public void register(User user) {
		System.out.println("Kullanıcı kaydı tamamlandı: " + user.getUserName());		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi: " + user.getUserName());
		
	}

	@Override
	public void updateInfo(User user) {
		System.out.println("Kulalnıcı bilgileri güncellendi: " + user.getUserName());
		
		
	}

	

	@Override
	public boolean password(String password) {
		for (User user : users) {
			if (user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eMail(String eMail) {
		for (User user : users) {
			if (user.getUserMail() == eMail) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
