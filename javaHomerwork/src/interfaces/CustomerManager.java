package interfaces;

public class CustomerManager {

	private Logger[] loggers; //dependency injection
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi: " + customer.getFirstName());
		/*
		 * DatabaseLogger databaseLogger = new DatabaseLogger();
		 * databaseLogger.log(customer.getFirstName());
		 */
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Musteri silindi: " + customer.getFirstName());
		/*
		 * DatabaseLogger databaseLogger = new DatabaseLogger();
		 * databaseLogger.log(customer.getFirstName());
		 */
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
