package abstractClasses; // abstract classlar sadece abstract veya 
						//tamamlanmis herhangi bir metotun olmasi yeterli

public abstract class GameCalculator {
	
	public abstract void hesapla(); // abstarct olunca metotun default hali olmaz override
									//edilerek metor ezilir ve kendi ozel programnini yazar
	
	public final void gameOver() { // final anahtar kelimesi ile gameOver metotunu oldugu gibi kullanacaktir
		System.out.println("Game Over!");
	}

}
