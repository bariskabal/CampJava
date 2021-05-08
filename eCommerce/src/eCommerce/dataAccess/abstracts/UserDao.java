package eCommerce.dataAccess.abstracts;


import java.util.ArrayList;

import eCommerce.entities.concretes.User;

public interface UserDao {
	void login(User user);
	void register(User user);
	ArrayList<User> getAll(User user);
	boolean getByEmail(String email);
}
