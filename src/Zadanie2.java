import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
	
	
		Scanner odczyt = new Scanner(System.in);
	    int A = odczyt.nextInt();
	    int B = odczyt.nextInt();
		int suma = A;
		
		if (A > B) {
			
			System.out.println("Pierwsza liczba musi by� mniejsza od drugiej");
			
		}else
		{
			
			do {
				
				A++;
				suma = suma + A;
				
			}while(A < B);
				
			System.out.println("Suma ciagu liczb od A do B to: ");
			System.out.println(suma);
					
		}
		
	
		
	}
	
}
