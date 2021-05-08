package eCommerce.business.concretes;

import eCommerce.authGoogle.GoogleAuthManager;
import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements UserService{

	private GoogleAuthManager googleAuthManager;
	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager=googleAuthManager;
	}
	@Override
	public void login(User user) {
		boolean result = googleAuthManager.auth();
		if (result) {
			System.out.println("Google ile giri� ba�ar�l�");
		}
		else {
			System.out.println("Google ile giri� sa�lanamad�");
		}
		
	}

	@Override
	public void register(User user) {
		boolean result = googleAuthManager.auth();
		if (result) {
			System.out.println("Google ile �ye kayd� ba�ar�l�");
		}
		else {
			System.out.println("Google ile �ye kayd� sa�lanamad�");
		}
		
	}

	
}
