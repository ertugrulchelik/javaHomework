package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * GameCalculator gameCalculator = new GameCalculator() {
		 * 
		 * @Override public void hesapla() { // TODO Auto-generated method stub
		 * 
		 * } };
		    ABSTRACT SINIFLAR KENDI BASLARINA KULLANILMAMALI CUMKU SUREKLI NEW GEREKIR VE BU DA 
		    KULLANISLI DEGILDIR */
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		

	}

}
