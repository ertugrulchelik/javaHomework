package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//camelCase : isimlendirmeler 
		
		String kredi1 = "Hizli kredi";
		String kredi2 = "Emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Ciftci kredisi";
		String kredi5 = "Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		
		String[] krediler = {
				"Hizli kredi", 
				"Emekli kredisi",
				"Konut kredisi",
				"Ciftci kredisi",
				"Meb kredisi",
				};
		
		System.out.println("-----------------");
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("-----------------");
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		/*String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "Izmir";
		System.out.println(sehir1);
		*/
	}

}
