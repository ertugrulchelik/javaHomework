package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setDetail("16GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);
		
//		product1.id = 1;
//		product1.name = "Lenovo V14";
//		product1.detail = "16 GB Ram";

		System.out.println(product1.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.getId();
	}

}
