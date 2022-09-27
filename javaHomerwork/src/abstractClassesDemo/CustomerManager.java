package abstractClassesDemo;

public class CustomerManager {

	// strateji paterni
	
	BaseDatabesManager databesManager;
	
	public void getCustomers() {
		databesManager.getData();
	}
}
