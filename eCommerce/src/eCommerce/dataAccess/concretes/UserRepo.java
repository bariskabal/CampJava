package eCommerce.dataAccess.concretes;

import java.util.ArrayList;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserRepo implements UserDao{

	
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> getAll(User user) {
		return null;
	}

	@Override
	public boolean getByEmail(String email) {
		return true;
	}

}
