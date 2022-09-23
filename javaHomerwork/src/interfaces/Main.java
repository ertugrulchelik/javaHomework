package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new DatabaseLogger(), new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer ertugrul = new Customer(1, "Ertugrul", "CELIK");
		
		customerManager.add(ertugrul);
	}

}
