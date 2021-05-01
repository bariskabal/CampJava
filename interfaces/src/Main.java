package src;

public class Main {
	public static void main(String[] args) {
		
		
		Logger[] loggers = {new SmsLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer baris = new Customer(1,"baris","kabal");
		customerManager.add(baris);
	}
	
}
