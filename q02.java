import java.util.ArrayList;
import java.util.Scanner;

public class q02 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System .in);
		
		System.out.println("Enter the number:");
		
		while(true) {
			
			int num = scanner.nextInt();
			if(num == 0) {
				break;
			}
			
			number.add(num);
		}
		
		for (int i = 0; i < number.size(); i++) {
			
			if( number.get(i) % 2 == 0 ) {
				
				number.remove(i);
				i--;
				
			}
			
			
			
		}
		
		
		
		
		System.out.println("odd numbers:"+ number);
		
		
		
		
		
	}

}
