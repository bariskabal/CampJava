package eCommerce.core.Utils;

import java.util.ArrayList;



public class Utils {
	
	
	public static void RunRules(String... logics )
    {
        for (String logic : logics) {
        	System.out.println(logic);
		}
        
    }
	public static void sendEmail(String email) {
		System.out.println("Doðrulama kodu "+email+ "bu emaile gönderildi");
	}
}
