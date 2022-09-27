package abstractClassesDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databesManager = new OracleDatabaseManager(); // konfigurasyon islemleri
		customerManager.getCustomers();
		
	}

}
