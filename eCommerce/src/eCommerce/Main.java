package eCommerce;

import eCommerce.authGoogle.GoogleAuthManager;
import eCommerce.business.concretes.GoogleAuthManagerAdapter;
import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccess.concretes.UserRepo;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Baris","baris.com","123452");
		
		UserManager userManager = new UserManager(new UserRepo());
		userManager.register(user);
		
		GoogleAuthManagerAdapter googleAuthManagerAdapter = new GoogleAuthManagerAdapter(new GoogleAuthManager());
		googleAuthManagerAdapter.login(user);
	}

}
