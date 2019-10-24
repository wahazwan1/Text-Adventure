import java.util.Scanner;

public class Slide1 {

		public static void main(String[]args) {
			
			
		}
			
		
//---------------------------------------------------------------------------------

	public void yourName() {
		
	
		//Character's Profile
			
			String name ;
			String weapon = "Knife";
			int yourHP = 30 ;
			
			Scanner inputData = new Scanner(System.in);
			
			System.out.println("What do you want to name yourself?");
			System.out.print("Traveller's name : ");
			name = inputData.nextLine();
			
			System.out.println("Your name       : " + name);
			System.out.println("Type of weapon  : " + weapon);
			System.out.println("Your HP         : " + yourHP);
			
				}	
	
	//---------------------------------------------------------------------------------	
	
	public void Path() {
		
		//Cave Option
		
			int Path ;
			int Stop = 1 ;
			
			//DoWhile starts
			Scanner inputData = new Scanner(System.in);
			
			System.out.println("Do you wish to enter the cave?");
			System.out.println("1. Enter");
			System.out.println("2. Return to forest");
			Path = inputData.nextInt();
				
				if(Path == 1) {
					
						if(Stop == 0) {
							System.out.print("There is nothing left in the cave");
							
							
							}if(Stop == 1) {
								System.out.print("You entered the cave");
								Stop = Stop - 1;
								}
					
				}if(Path == 2) {
							System.out.print("Returned to forest");
						}
					
					
				}
	
	//---------------------------------------------------------------------------------	
	
	public void looping() {
		
		//Continue Program
		
			int Data ;
			Scanner inputData = new Scanner(System.in);
			
				do {
					
					System.out.print("Press 0 to continue");
					Data = inputData.nextInt();
					
					}while(Data != 0);
		
				}
			
	//---------------------------------------------------------------------------------
	
	int Player_HP = 30 ;
	
	public void Death() {
		
		// Character HP to 0
		
		
		
		if(Player_HP <= 0 ) {
			
			System.out.println("You are Dead!\n\n");
			System.out.println("Game over.");
			System.out.println("\n\nWASTED.");
			
			java.lang.System.exit(0);
			
			}
	
	}
	
	
	//---------------------------------------------------------------------------------
	
	
	int Enermy_HP = 40 ;
	
	public void EnermyAttack() {
		
		if(Enermy_HP != 0) {
			
			System.out.println("\nThe GIANT BAT attacked you");
			System.out.println("You received 4 damage\n");
			Player_HP = Player_HP - 4;
			
		}
		
		
		
	}
	
	
	//---------------------------------------------------------------------------------
	
	
	public void EnermyDead() {
		
		if(Enermy_HP <= 0) {
			
			System.out.println("\nCONGRATULATION!");
			System.out.println("YOU HAVE DEFEATED THE ENEMY!");
			
		}
		
		
	}
	
	
	//---------------------------------------------------------------------------------
	
	
	public void Battle_Scene() {
		
		int loop = 0;
		
			do {
				
				if(Enermy_HP != 0) {
					
					System.out.println("The Enermy attacked you");
					System.out.println("You received 4 damage");
					Player_HP = Player_HP - 4;
					
					
						}if(Enermy_HP <= 0) {
							
							System.out.println("CONGRATULATION!");
							System.out.println("YOU HAVE DEFEATED THE ENEMY!");
							loop = 1;
							
							
								}if(Player_HP <= 0 ) {
									
									System.out.println("You are Dead!");
									System.out.println("Game over.");
									System.out.println("WASTED.");
									
									java.lang.System.exit(0);
									
									}
						
			}while(loop == 0);
	}
	
	
	//---------------------------------------------------------------------------------
	
	
	String name = "Faris kacak";
	int yourHP = 30;
	
	public void DisplayData() {
		
		System.out.println("Your current HP : " + yourHP );
		
		System.out.println("So, " + name );
		System.out.println("What do you want to do?");
		
		
	}
	
	
	//---------------------------------------------------------------------------------
	
	
	
	
	
	
}
