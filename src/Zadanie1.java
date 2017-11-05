import java.util.Scanner;

public class Zadanie1 {

	
	public static void main(String[] args) {

		
	Scanner reader = new Scanner(System.in);
    int liczba = reader.nextInt();
	
    int licznik = 1;
    
    while ( licznik <= liczba  ) {
    	
    	
    	if ( licznik % 2 == 1 ) {
    	
    	 System.out.println(licznik);
    	
    		}
    	
    	 licznik++;
    	 
    	}
    
    

	}

	
}