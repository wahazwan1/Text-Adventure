import java.util.Scanner;

public class test {
	
	public static void main(String[]args) {
		
		
		int memberShip = 0;
		int yesNo ;
		Scanner yourInput = new Scanner(System.in);
		
		System.out.print("Member ke? 1 ye 0 tak:");
		yesNo = yourInput.nextInt();
		
			if(yesNo == 1) {
				memberShip = 1;
			}
			
			
			System.out.println("Total barang adalah rm42");
			int barang = 42;
			int total = 0;
			
				if(memberShip == 1) {
						total = 42/2;
					
					
					}if(memberShip == 0) {
						total = total + barang;
						
						}
		
		System.out.println("Total perlu bayar : " + total);
		
	}
}
