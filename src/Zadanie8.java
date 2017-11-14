import java.util.Scanner;

public class Zadanie8 {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		
		int liczba = odczyt.nextInt();
		
		int liczba1 = liczba;
		
		int liczba2 = 0;
		
		
		while(true) {
			
			liczba2++;
			
			if (liczba%liczba2==0) {
				
				System.out.println(liczba2);
				
			}
			
			if (liczba2==liczba) {
				break;
			}
			
		}
		
		
		
	}
	
}
