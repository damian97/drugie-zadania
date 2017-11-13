import java.util.Random;
import java.util.Scanner;


public class Zadanie6 {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);

		Random losuj = new Random();
		
	
			int losowa = losuj.nextInt(100)+1;

			int liczba = 0;
			do {
			
			liczba = odczyt.nextInt();
				
			if (liczba > losowa) {
				
				System.out.println("Poda³eœ za du¿¹ wartoœæ");
				
			}else if (liczba < losowa) {
				
				System.out.println("Poda³eœ za ma³¹ wartoœæ");
				
			}else {
				
				System.out.println("Gratulacje");
				break;
			}
			
			
			
			}while(liczba == liczba);

	}
	
}
