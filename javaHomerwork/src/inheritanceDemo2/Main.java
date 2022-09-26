package inheritanceDemo2;

public class Main {

	public static void main(String[] args) {
//
//		BaseLogger[] loggers = new  BaseLogger [] {new FileLogger(), 
//				new DatabaseLogger(),new EmailLogger() };
//		
//		for(BaseLogger logger : loggers) {
//			logger.log("Log Mesaji");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
