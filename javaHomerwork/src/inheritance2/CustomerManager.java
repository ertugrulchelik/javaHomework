package inheritance2;

public class CustomerManager {

	public void add(Logger logger) {
		System.out.println("Musteri eklendi");
		
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
