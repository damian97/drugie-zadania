import java.util.Scanner;

public class Zadanie4{
	
	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		
		int licznik = 0;
		
		for(int i=0; i<999; i++) {
			
			int liczba = odczyt.nextInt();
			
			switch(liczba) {
			
			case 0:
			
				i = 999;
				break;
				
			default:
				
				licznik = licznik + liczba;
				
				
			}
			
		}
		
		
		System.out.print("Suma wpisanych liczb to: ");
		System.out.println(licznik);
		
		
		
		
	}
	
}