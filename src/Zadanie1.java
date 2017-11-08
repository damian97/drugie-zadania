import java.util.Scanner;

	public class Zadanie1{
	
	public static void main(String[] args) {
	

	Scanner odczyt = new Scanner(System.in);
	
	int a = odczyt.nextInt();

	int b = 1;
	
	while (b <= a) {
		
		
		if (b %2==1) {
		 System.out.println(b);
		}
		 
		 b++;
				 
	}
	


	}
	

}