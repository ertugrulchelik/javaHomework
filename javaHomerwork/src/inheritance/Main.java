package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer ertugrul = new IndividualCustomer();
		ertugrul.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "678910";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(ertugrul);
		
		Customer[] customers = {ertugrul, hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
