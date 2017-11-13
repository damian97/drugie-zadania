import java.util.Scanner;

public class Zadanie5a {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		
		int liczba = 0, srednia = 0, suma = 0, max = 0, min = 99999999;
		
		for(int i=0; i<999; i++) {
			
			liczba = odczyt.nextInt();
			
			if (liczba == 0 && i ==0) {

				System.out.println("Nie wprowadzono danych");
			
			}else if (liczba == 0 && i > 0) {
				
				System.out.println("min: "+min);
				System.out.println("max: "+max);
				System.out.println("suma: "+suma);
				System.out.println("œrednia: "+srednia);
				
			}else {
				
				if (max < liczba) {
					max = liczba;
				}

				if (min > liczba) {
					min = liczba;
					
				}
			
				suma = suma + liczba;
				
				srednia = suma/(i+1);
				
				
			
		}
		
			
		
		
	}
	
}
	
}