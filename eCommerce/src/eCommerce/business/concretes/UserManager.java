package eCommerce.business.concretes;

import java.util.ArrayList;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.Utils.Utils;
import eCommerce.dataAccess.concretes.UserRepo;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserRepo userRepo;
	public UserManager(UserRepo userRepo) {
		this.userRepo=userRepo;
	}
	
	
	@Override
	public void login(User user) {
		Utils.RunRules(nullCheck(user));
		userRepo.login(user);
		Utils.sendEmail(user.getEmail());
	}

	@Override
	public void register(User user) {
		Utils.RunRules(userNameCheck(user),passwordCheck(user),emailCheck(user));
		userRepo.register(user);
		Utils.sendEmail(user.getEmail());
	}
	
	private String userNameCheck(User user) {
		if (user.getName().length()>2) {
			return "isim ge�erli.";
		}
		else {
			return "isim en az 2 karakter olmal�.";
		}
	}
	private String passwordCheck(User user) {
		if (user.getPassword().length()>6) {
			return "parola ge�erli";
		}
		else {
			return "parola en az 6 karakter olmal�.";
		}
	}
	private String emailCheck(User user) {
		
		if (user.getEmail().contains(".com")&& this.userRepo.getByEmail(user.getEmail())) {
			return "email ge�erli";
		}
		else {
			return "email format�na uygun olmal�.";
		}
	}
	private String nullCheck(User user) 
	{
		if(user.getEmail()==null && user.getPassword()==null) {
			return "L�tfen gerekli alanlar� doldurunuz.";
		}
		else {
			return"Kullan�c� giri�i ba�ar�l�.";
		}
	}


}
