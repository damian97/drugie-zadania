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
			
			
			for (int i = A; i <= B; i++) {
				
				suma = suma + i;

				
			}
			
			
			System.out.println(suma - A);
					
		}
		
	
		
	}
	
}


