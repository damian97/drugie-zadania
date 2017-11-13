import java.util.Scanner;

public class Zadanie7 {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);

		int x1 = 1, y1 = 2, b1= 1, a1 =1;
		
		System.out.println("Podaj znak wype³nienia prostok¹ta");
		
		String znak = odczyt.next();
		
		System.out.println("Podaj pozycjê lewego górnego rogu prostok¹ta (x, y)");
		System.out.print("X: ");
	
		int x = odczyt.nextInt();

		
		System.out.print("Y: ");
		int y = odczyt.nextInt();

		
		System.out.println("Podaj d³ugoœci boków prostok¹ta (ab)");
		System.out.print("a: ");
		
		int a = odczyt.nextInt();

		
		System.out.print("b: ");
		int b = odczyt.nextInt();

	
		while(y1 < y) {
			
			y1++;
			System.out.println("");
		}
					
			
		while (a1 <= a) {	
			
		a1++;
		System.out.println();

			while(x1 < x) {
				
				x1++;
				System.out.print(" ");
				
			}
			
				while(b1 <= b) {
					
					b1++;
					System.out.print(znak);
					
				}
			
				b1 = 1;
				x1 = 1;
			}
		
			
			
	}
	
	
}
