package eCommerceOdev.dataAccess.abstracts;

import java.util.List;

import eCommerceOdev.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void delete(User user);
	void updateInfo(User user);
	boolean eMail(String eMail);
	boolean password(String password);
	List<User> getAll();

}
