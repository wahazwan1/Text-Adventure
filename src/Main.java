import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		gameFlow gameplay = new gameFlow();
		
		Scanner begin = new Scanner(System.in);
		System.out.println("Welcome to Text Adventure\n");
		System.out.print("To start the game, please press 1 : ");
		int input = 0;
		
		input = begin.nextInt();
		System.out.println();
		System.out.println("-------------------------------------------------");
		if(input == 1) {
			
			// start game
			gameplay.first();
			
			}else {
				
				System.out.print("End");
				
				}
	
		
	}
}
