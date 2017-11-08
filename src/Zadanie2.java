import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
	
	
		Scanner odczyt = new Scanner(System.in);
	    int A = odczyt.nextInt();
	    int B = odczyt.nextInt();
		int suma = A;
		
		if (A > B) {
			
			System.out.println("Pierwsza liczba musi byæ mniejsza od drugiej");
			
		}else
		{
			
			while (A < B) {
				
				A++;
				suma = suma + A;
				
			}
			
			System.out.println("Suma ci¹gu liczb od A do B to: ");
			System.out.println(suma);
					
		}
		
	
		
	}
	
}
