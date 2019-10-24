import java.util.Scanner;

public class gameFlow {
	
	public void first() {
		
		int choice 			;
		String yourName 	;
		String weapon 		;
		String Name 		;
		int PlayerHP 		;
		int choiceForest 	;
		int inputAction 	;
		
		int enter 			= 0		;
		int extrance 		= 0     ;
		int batHP 			= 10	;
		int GolemHP 		= 45	;
		int curePotion 		= 0		;
		int Cave 			= 0		;
		int optionForest2 	= 1 	;
		int startloop 		= 0		;
		
		Scanner inputName 			= 	new Scanner(System.in);
		Scanner yourChoice 			= 	new Scanner(System.in);
		Scanner yourChoiceForest 	= 	new Scanner(System.in);
		Scanner yourAction 			= 	new Scanner(System.in);
		Scanner yourActionSword 	= 	new Scanner(System.in);
		Scanner inputRandom 		= 	new Scanner(System.in);
		
		
		
	//Enter a character's Name
		System.out.println("What do you want to name yourself?");
		System.out.print("Traveller's name : ");
		yourName = inputName.nextLine();
		System.out.println();
		System.out.println();
		
			Name = yourName;
			weapon = "Knife";
			PlayerHP = 	30;
			
			
		
	// Character's information
		System.out.println("*************************************************");
		System.out.println("Your profile");
		System.out.println("*************************************************");
		System.out.print("Traveller's name : " + Name );
		System.out.println();
		System.out.print("Type of weapon   : " + weapon );
		System.out.println();
		System.out.print("Traveller's HP   : " + PlayerHP);
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
	//break
		
		
		do {
			System.out.print("Press 0 to continue : ");
			startloop = inputRandom.nextInt();
			System.out.println();
		}while(startloop != 0);
		
	//Story Begins
	//Chapter 1
		
		int autoData = 0;
		int Guard = 1;
		System.out.println("*************************************************");
		System.out.println("	   GAME STARTS");
		
		do {
			
			
			System.out.println("*************************************************");
			System.out.println("\nYou finally arrived to the place where you have \nalways wanted to be and you said :");
			System.out.println("\n	'The time has come to show the world what I'm capable of!'");
			System.out.println("\nYou are now at the gate of the kingdom.\nA guard is standing in front of you.");
			System.out.println("\n\nSo, " + Name);
			System.out.println("What do you want to do?");
			System.out.println();
			System.out.println("1. Talk to the guard.");
			System.out.println("2. Attack the guard.");
			System.out.println("3. Leave.");
			System.out.println("-------------------------------------------------");
			System.out.print("Your answer is : ");
			choice = yourChoice.nextInt();
			System.out.println("-------------------------------------------------");
			
			
			
		
			if(choice == 1) {
				
				if(Guard == 0) {
					
					System.out.println("\nYou talked to the guard again.\n");
					System.out.println("	You   : Can you please just let me in? \n");
					System.out.println("	Guard : GET LOST!\n");
					do {
						System.out.print("\n\nPress 0 to continue : ");
						startloop = inputRandom.nextInt();
						System.out.println();
					}while(startloop != 0);
					autoData = 0;
					Guard = 0 ;
					System.out.println();
					System.out.println("*************************************************");
					
				}if(Guard == 1) {
					enter = enter + 1;
					
					
					
					System.out.println("\nYou talked to the guard.\n");
					System.out.println("	You   : Hello there.\n");
					System.out.println("	Guard : You can't enter this kingdom easily. Go away!\n");
					do {
						System.out.print("\n\nPress 0 to continue : ");
						startloop = inputRandom.nextInt();
						System.out.println();
					}while(startloop != 0);
					autoData = 0;
					Guard = 0 ;
					System.out.println();
					System.out.println("*************************************************");
				}
				
				

					}if(choice == 2) {
						
						System.out.println("\nYou approached to the guard and attacked with a knife.\n");
						System.out.println("	You   : YOU LEFT ME NO CHOICE! HAIYAAA!!!\n");
						System.out.println("	Guard : YOU IDIOT!\n\nThe guard attacked you and you received 1 damage.");
						PlayerHP = PlayerHP - 1;
						System.out.println("Your HP is now " + PlayerHP + "\n");
						do {
							System.out.print("\n\nPress 0 to continue : ");
							startloop = inputRandom.nextInt();
							System.out.println();
						}while(startloop != 0);
						autoData = 0;
						System.out.println("*************************************************");
						enter = enter + 1;
						}if(choice == 3) {
							
							
						if(enter < 2) {
							System.out.println("Please choose other option before you leave.");
							do {
								
								
								System.out.print("\n\nPress 0 to continue : ");
								startloop = inputRandom.nextInt();
								
								System.out.println();
							
							}while(startloop != 0);
							System.out.println("*************************************************");
						
						}if(enter >= 2) {
							
							System.out.println("\nYou decided to leave the kingdom.\n");
							System.out.println("You entered the deep forest.");
							autoData = 1;

						}
							
														
							}if(choice < 1 || choice > 3) {
								System.out.println("Please put the number that listed above");
								System.out.println();
								System.out.println("-------------------------------------------------");
								do {
									System.out.print("\n\nPress 0 to continue : ");
									startloop = inputRandom.nextInt();
									System.out.println();
								}while(startloop != 0);
								autoData = 0;
								
							}
						
						
		
		
		}while(autoData == 0);
		
		extrance = 0;
		int forest = 0 ;
		int FromTree = 1 ;
		int frogHP = 10 ;
		
		do {
		
		System.out.println("There are four paths to choose. Where do you want to go?");
		System.out.println();
		System.out.println("1. North");
		System.out.println("2. East");
		System.out.println("3. South");
		System.out.println("4. West (Pick as the Last option)");
		System.out.println("-------------------------------------------------");
		System.out.print("Your answer is : ");
		choiceForest = yourChoiceForest.nextInt();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		
		
		//------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
				if (choiceForest == 1) {
					
					
						if(FromTree == 0) {
								System.out.println("There is no healing potion left to take.\nYou went back to the main forest");
								do {
									System.out.print("\n\nPress 0 to continue : ");
									startloop = inputRandom.nextInt();
									System.out.println();
								}while(startloop != 0);
								forest = 0;
								System.out.println("\n*************************************************");
							
							
							}if (FromTree==1) {
								extrance = extrance + 1;
									System.out.println("You decided to go North.\n");
									System.out.println("You are surrounded by a thick forest and there is only \none path that leads to somewhere.");
									System.out.println("\nYou followed the one and only path.\n");
									do {
										System.out.print("\n\nPress 0 to continue : ");
										startloop = inputRandom.nextInt();
										System.out.println();
									}while(startloop != 0);
									System.out.println("\n*************************************************");
									
									System.out.println("As you proceed, you saw a big tree aheads you.");
									System.out.println("You went for the big tree.");
									do {
										System.out.print("\n\nPress 0 to continue : ");
										startloop = inputRandom.nextInt();
										System.out.println();
									}while(startloop != 0);
									System.out.println("\n*************************************************");
									
									
									System.out.println("There's a healing potion inside the Big Tree.\nYou took the healing potion.\n");
									System.out.println("	Potion added into item");
									curePotion = curePotion + 1;
									System.out.print("	Available potion : " + curePotion);
									FromTree = 0;
									
									
									do {
										System.out.print("\n\nPress 0 to continue : ");
										startloop = inputRandom.nextInt();
										System.out.println();
									}while(startloop != 0);
									forest = 0;
									System.out.println("\n*************************************************");
										
								}
					
				}if (choiceForest==2) {
					
					
					if(optionForest2 == 0) {
						System.out.println("You told yourself that you're not going back there because there is nothing left.");
						
						do {
							System.out.print("\n\nPress 0 to continue : ");
							startloop = inputRandom.nextInt();
							System.out.println();
						}while(startloop != 0);
						forest = 0;
						System.out.println("\n*************************************************");
						
						
						
					}if(optionForest2 == 1) {
						extrance = extrance + 1;
						System.out.println("You decided to go east.\n");
						
						
						
						System.out.println("You have been walking about 1 hour.");
						System.out.println("You got pretty thirsty after a long walk.");
						do {
							System.out.print("\n\nPress 0 to continue : ");
							startloop = inputRandom.nextInt();
							System.out.println();
						}while(startloop != 0);
						System.out.println("\n*************************************************");
						
						System.out.println("Suddenly, you saw a river just right in front of you");
						System.out.println("You approached to the riverside and drinked the fresh water\n");
						
						System.out.println("	Your HP increased by 10");
						PlayerHP = PlayerHP + 10;
						System.out.println("	Current HP is " + PlayerHP);
						
						System.out.println("\nThe river is uncrossable. You returned to the forest.");
						do {
							System.out.print("\n\nPress 0 to continue : ");
							startloop = inputRandom.nextInt();
							System.out.println();
						}while(startloop != 0);
						forest = 0;
						System.out.println("\n*************************************************");
						optionForest2 = 0;
						
					}
					
						
				}if (choiceForest == 3) {
					
			
					Scanner pick = new Scanner(System.in);
												int autoData2 = 0;
												
												
												if(Cave == 2) {
													System.out.println("There's nothing left there. \nYou went back to the forest.");
													do {
														System.out.print("\n\nPress 0 to continue : ");
														startloop = inputRandom.nextInt();
														System.out.println();
													}while(startloop != 0);
													System.out.println("\n*************************************************");
													
													
													
												}if(Cave == 0) {
													
															
												
														do {
															
															System.out.println("You found an enormous dark cave and have a pile of bones infront of it. Do you wish to enter? ");
															System.out.println("\n1. Enter\n2. Back to the forest");
															Scanner EnterCave = new Scanner(System.in);
															int CaveOption = 0;
															
															System.out.println("-------------------------------------------------");
															System.out.print("Your answer : ");
															CaveOption = EnterCave.nextInt();
															System.out.println("-------------------------------------------------");
															System.out.println();
															
															
												
																
															
																if(CaveOption == 1) {
																	extrance = extrance + 1;
																	System.out.println("You entered the cave.\n");
																	System.out.println("While walking inside the cave, you see a torch and some words written at the stonewall");
																	System.out.println("You tried to light up the torch and read the words.");
																	System.out.println("You tried to understand it but failed.");
																	do {
																		System.out.print("\n\nPress 0 to continue : ");
																		startloop = inputRandom.nextInt();
																		System.out.println();
																	}while(startloop != 0);
																	System.out.println("\n*************************************************");
																	
																	System.out.println("It is written Naim loves Ayo FOREVAAARRR!");
																	System.out.println("You scrath your head");
																	System.out.println("You asked yourself, 'What does that means?'");
																	do {
																		System.out.print("\n\nPress 0 to continue : ");
																		startloop = inputRandom.nextInt();
																		System.out.println();
																	}while(startloop != 0);
																	System.out.println("\n*************************************************");
																	
																	
																	System.out.println("\nYou've reached to the deeper cave.\nA GIANT BAT has appeared. You have no choice but to fight.");
																		
																		int loop2 = 0;
																		int kosong2 = 0;
																		int loop5 = 0;
																		do {
																			
																			System.out.println();
																			System.out.println("	Traveller HP     =  " + PlayerHP);
																			System.out.println("	Giant Bat HP     =  " + batHP);
																					
																						
																						System.out.println("\n\nSo, " + Name);
																						System.out.println("What do you want to do?");
																						System.out.println("1. Attack\n2. Use Potion (" + curePotion + ")");
																						System.out.println("-------------------------------------------------");
																						System.out.print("Your answer : ");
																						
																						inputAction = yourAction.nextInt();
																						System.out.println("-------------------------------------------------");
																						
																							
																							if(inputAction == 1) {
																									
																								System.out.println("\nYou attacked the GIANT BAT");
																								System.out.println("The GIANT BAT received 5 damage");
																								batHP = batHP - 5;
																								System.out.print("\n\nPress 0 to continue : ");
																								kosong2 = yourAction.nextInt();
																								System.out.println("\n*************************************************");
																								
																								
																								}if(inputAction == 2) {
																								
																								
																											if(curePotion == 0) {
																												System.out.println("\nSorry, but you have no item to use.\n");
																												do {
																													System.out.print("\n\nPress 0 to continue : ");
																													startloop = inputRandom.nextInt();
																													System.out.println();
																												}while(startloop != 0);
																												System.out.println("\n*************************************************");
																												loop5 = 0;
																												
																												
																												
																											}if(curePotion >= 1) {
																												
																												Scanner pick2 = new Scanner(System.in);
																												int end22 = 0;
																												do {
																													
																													System.out.println("\nYou selected the item.");
																													System.out.println("Press 1 to use the potion.\n");
																													int yourchoice2 ;
																													System.out.println("-------------------------------------------------");
																													System.out.print("Your answer : ");
																													yourchoice2 = pick2.nextInt();
																													System.out.println("-------------------------------------------------");
																													System.out.println();
																												
																															if(yourchoice2 == 1) {
																																
																																System.out.println("HP recovered by 5");
																																PlayerHP = PlayerHP + 5;
																																System.out.print("Your HP is now " + PlayerHP);
																																System.out.println("\n");
																																System.out.print("Press 0 to continue : ");
																																loop5 = yourAction.nextInt();
																																System.out.println("\n*************************************************");
																																
																																curePotion = curePotion - 1;
																																end22 = 1 ;
																																
																																
																																
																																
																														
																																}if(yourchoice2 < 1 || yourchoice2 > 1){
																																	System.out.println("Please put a proper answer\n");
																																	
																																	do {
																																		System.out.print("\n\nPress 0 to continue : ");
																																		startloop = inputRandom.nextInt();
																																		System.out.println();
																																	}while(startloop != 0);
																																	loop5 = 0 ;
																																	end22 = 0 ;
																															
																															
																															
																															
																															}
																														
																												}while(end22 == 0);
																												
																												
																											}
																								
																								
																								
																									
																							}if(inputAction < 1 || inputAction >2) {
																								
																								System.out.println("\nYou were confused. You did not do anything.\n");
																								
																								do {
																									System.out.print("\n\nPress 0 to continue : ");
																									startloop = inputRandom.nextInt();
																									System.out.println();
																								}while(startloop != 0);
																								loop5 = 0;
																								System.out.println("\n*************************************************");
																								
																								
																								
																								
																										}if(batHP != 0) {
																														System.out.println("\nThe GIANT BAT attacked you");
																														System.out.println("You received 4 damage\n");
																														PlayerHP = PlayerHP - 4;
																														do {
																															System.out.print("\n\nPress 0 to continue : ");
																															startloop = inputRandom.nextInt();
																															System.out.println();
																														}while(startloop != 0);
																														loop2 = 0;
																														System.out.println("\n*************************************************");
																								
																														
																										}if(batHP <= 0) {
																														
																												System.out.println("\nCONGRATULATION!");
																												System.out.println("YOU HAVE DEFEATED THE ENEMY!");
																												System.out.println("\n	The enemy has dropped 2 healing potions.");
																												curePotion = curePotion + 2;
																												System.out.println("	You took the potions.\n");
																												System.out.println("	Potion added into inventory");
																												System.out.print("	Available potion : " + curePotion);
																														
																												do {
																													System.out.print("\n\nPress 0 to continue : ");
																													startloop = inputRandom.nextInt();
																													System.out.println();
																												}while(startloop != 0);
																												System.out.println("\n*************************************************");
																												loop2 = 1;
																												kosong2 = 0;
																												autoData2 = 1;
																												Cave = 2;
																												
																												
																													}if(PlayerHP <= 0) {
																														
																												System.out.println("You are Dead!\n\n");
																												System.out.println("Game over.");
																												System.out.println("\n\nWASTED.");
																												
																														
																												java.lang.System.exit(0);
																												
																												
																													}	
																										
																										
																										
																										
																										
																										
																												
																								
																				}while(loop2 == 0);
															
																		
																	}if(CaveOption == 2) {
																				System.out.println("You decided to go back to the main forest.\n");
																				System.out.println("You returned to the forest.\n");
																				do {
																					System.out.print("\n\nPress 0 to continue : ");
																					startloop = inputRandom.nextInt();
																					System.out.println();
																				}while(startloop != 0);
																				System.out.println("\n*************************************************");
																				forest = 0;
																				autoData2 = 1;
																				
																				}
																	
														}while(autoData2 == 0);
										
											}
										
					
					
				}if (choiceForest == 4) {
						
					if(extrance < 3) {
						System.out.println("Please choose other option first before you proceed.");
						do {
							System.out.print("\n\nPress 0 to continue : ");
							startloop = inputRandom.nextInt();
							System.out.println();
						}while(startloop != 0);
						System.out.println("\n*************************************************");
						
					}if(extrance == 3) {
						System.out.println("You decided to go west.\n\n");
						System.out.println("As you continued your journey, you heard a lady was calling for you.\nYou approached to the lady.\n");
						System.out.println("	You    : Hello beautiful. How can I help you?\n");
						System.out.println("	Lady   : There is a long sword not far from here. ");
						System.out.println("\t\tA legend said that one day a young traveller came and take the sword to save our village from a monster. Try check it out!\n");
						System.out.println("Without wasting time, you headed for the sword.\n");
						
						do {
							System.out.print("\n\nPress 0 to continue : ");
							startloop = inputRandom.nextInt();
							System.out.println();
						}while(startloop != 0);
						System.out.println("\n*************************************************");
						
						System.out.println("Enemy appeared.\n\n");
						System.out.println("You encountered a Red Giant Froggy.\nYou have no choice but to fight.\n");
						System.out.println("	Red Giant Froggy : 'Gero Gero' \n");
						
								
								int loop = 0;
								int kosong = 0;
								int end22 = 0;
								do {
									
								
									System.out.println("\n	Traveller HP      	=  " + PlayerHP);
									System.out.println("	Redd Giant frog HP	=  " + frogHP);
											
												
												System.out.println("\n\nSo, " + Name);
												System.out.println("What do you want to do?");
												System.out.println("1. Attack\n2. Use Potion (" + curePotion + ")");
												System.out.println("-------------------------------------------------");
												System.out.print("Your answer : ");
												
												inputAction = yourAction.nextInt();
												System.out.println("-------------------------------------------------");
													
													if(inputAction == 1) {
															
														System.out.println("\nYou attacked the frog");
														System.out.println("The frog received 5 damage\n");
														frogHP = frogHP - 5;
														do {
															System.out.print("\n\nPress 0 to continue : ");
															startloop = inputRandom.nextInt();
															System.out.println();
														}while(startloop != 0);
														kosong = 0;
														System.out.println("\n*************************************************");
														
														}		
													
													if(inputAction == 2) {
														
														
														if(curePotion == 0) {
															System.out.println("\nSorry, but you have no item to use.\n");
															do {
																System.out.print("\n\nPress 0 to continue : ");
																startloop = inputRandom.nextInt();
																System.out.println();
															}while(startloop != 0);
															System.out.println("\n*************************************************");
															loop = 0;
															
															
															
														}if(curePotion >= 1) {
															
															Scanner pick2 = new Scanner(System.in);
															
															do {
																
																System.out.println("\nYou selected the item.");
																int yourchoice2 ;
																System.out.print("Press 1 to use the potion : ");
																yourchoice2 = pick2.nextInt();
																System.out.println("\n-------------------------------------------------");
															
																		if(yourchoice2 == 1) {
																			
																			System.out.println("\nHP recoverd by 13");
																			PlayerHP = PlayerHP + 13;
																			System.out.print("Your HP now is " + PlayerHP);
																			System.out.println("\n");
																			System.out.print("Press 0 to continue : ");
																			
																			loop = yourAction.nextInt();
																			System.out.println("\n*************************************************");
																			curePotion = curePotion - 1;
																			end22 = 1 ;
																			
																			
																			
																			
																	
																			}if(yourchoice2 < 1 || yourchoice2 > 1){
																				System.out.println("\nYou were confused. You didn't do anything.\n");
																				
																				System.out.print("Press 0 to continue : ");
																				loop = yourAction.nextInt();
																				System.out.println("\n*************************************************");
																				
																				end22 = 0 ;
																		
																		
																		
																		
																		}
																	
															}while(end22 == 0);
															
															
														
														}
													}
													
													if(frogHP <= 0) {
														
														
														
														System.out.println("\nSUPERB!\nYOU DEFEATED THE RED GIANT FROG!");
														System.out.println("\nYou obtained a Magical Silver Ring that increases 5 HP");
														System.out.println("\nYour HP is " + (PlayerHP + 5));
														
														loop = 1;
														System.out.print("\nPress 0 to continue : ");
														kosong = yourAction.nextInt();
														System.out.println("\n*************************************************");
														forest = 1;
													}
													
													
													if(frogHP != 0) {
														System.out.println("\nThe frog attacked you");
														System.out.println("You received 5 damage\n");
														PlayerHP = PlayerHP - 5;
														System.out.print("Press 0 to continue : ");
														loop = yourAction.nextInt();
														System.out.println("\n*************************************************");
														
														
													}if(PlayerHP <= 0) {
														
														System.out.println("You are Dead!\n\n");
														System.out.println("Game over.");
														System.out.println("\n\nWASTED");
																
														java.lang.System.exit(0);
														
														
															}	
													
														
								}while(loop == 0);
								
								
					
					
						
					
					
					
							
							
						
						
					}
					
					
					
					
						
						
					}
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//------------------------------------------------------------------------------
				
				
		}while(forest == 0);
		
		
					int sword;
					
					System.out.println("\nYou have arrived to the destination. You saw a sword in a stone.");
					
					int backToOption = 0;
					int kosong3;
				do {
					
					System.out.println("\n\nSo, " + Name);
					System.out.println("What do you want to do?");
					System.out.print("\n1.Pull the sword out\n2.Leave");
					System.out.println("\n-------------------------------------------------");
					System.out.print("Your answer : ");
					sword = yourActionSword.nextInt();
					System.out.println("-------------------------------------------------");
					
					
					if(sword == 1) {
						
						System.out.println("You pulled out the sword with every strength you had.\n\n");
						int kosong = 0;
						System.out.print("Press 0 to continue : ");
						kosong = yourAction.nextInt();
						System.out.println("\n*************************************************");
						System.out.println("The Long Sword glows when you pulled it.\n");
						System.out.println("You obtained a Long Sword.\n");
						
						System.out.println("	Your weapon type has changed into a Long Sword.");
						System.out.println("	Your ATK increased.\n");
						kosong = 0;
						System.out.print("Press 0 to continue : ");
						kosong = yourAction.nextInt();
						System.out.println("\n*************************************************");
						
						weapon = "Long Sword" ;
						
						backToOption = 1;
						
						
							}if(sword == 2) {
									
									
									System.out.println("\nYou are curious about the sword. There is no turning back.");
									System.out.println("You decided to stay.\n");
									
									System.out.print("\nPress 0 to continue : ");
									kosong3 = yourAction.nextInt();
									System.out.println("\n*************************************************");
									backToOption = 0;
									
									
										}if(sword < 1 || sword > 2) {
											
											System.out.println("Please put a proper answer\n");
											
											System.out.println("0 to continue");
											kosong3 = yourAction.nextInt();
											
											backToOption = 0;
											
											}
						
						
					
					
				}while(backToOption == 0);
				
				
			//Last Chapter
			
				System.out.println("You continued your journey.\n\n");	
				int kosong = 0;
				System.out.print("Press 0 to continue : ");
				kosong = yourAction.nextInt();
				System.out.println("\n*************************************************");
				
				System.out.println("Suddenly, you heard some people were screaming and asking for help");
				System.out.println("from the nearby village.");
				System.out.println("You ran towards to the small village\n\n");
				kosong = 0;
				System.out.print("Press 0 to continue : ");
				kosong = yourAction.nextInt();
				System.out.println("\n*************************************************");
				
				System.out.println("You reached the village.\n");
				System.out.println("There is a Golem attacking the village.");
				System.out.println("Without any hesitation, you challanged the Golem.\n\n");
				kosong = 0;
				System.out.print("Press 0 to continue : ");
				kosong = yourAction.nextInt();
				System.out.println("\n*************************************************");
				
		
		//gameplay
			
			int kosong6 = 0;
			int loop10 = 0;
			int end10 = 0; 
			do {
				
				
				System.out.println("\n	Your HP        : " + PlayerHP);
				System.out.println("	The Golem HP   : " + GolemHP);
						
							
							System.out.println("\n\nSo, " + Name);
							System.out.println("What do you want to do?");
							System.out.println("1. Attack\n2. Use Potion (" + curePotion + ")");
							System.out.println("-------------------------------------------------");
							System.out.print("\nYour answer : ");
							
							inputAction = yourAction.nextInt();
							System.out.println("-------------------------------------------------");
								
								if(inputAction == 1) {
										
									System.out.println("\n\nYou attacked the Golem");
									System.out.println("The Golem received 15 damage\n");
									GolemHP = GolemHP - 15;
									System.out.print("Press 0 to continue : ");
									kosong6 = yourAction.nextInt();
									System.out.println("\n*************************************************");
									
									}		
								
								if(inputAction == 2) {
									
									
									if(curePotion == 0) {
										System.out.println("Sorry, but you have no HEALTH POTIION left to use\n");
										System.out.print("Press 0 to continue : ");
										loop10 = yourAction.nextInt();
										System.out.println("\n*************************************************");
										loop10 = 0;
										
										
										
									}if(curePotion >= 1) {
										
										Scanner fight = new Scanner(System.in);
										
										do {
											
											System.out.println("\nYou selected the item.");
											System.out.println("Press 1 to use the potion.\n");
											int yourchoice2 ;
											System.out.println("-------------------------------------------------");
											System.out.print("Your answer : ");
											yourchoice2 = fight.nextInt();
											System.out.println("-------------------------------------------------");
											System.out.println();
											
										
													if(yourchoice2 == 1) {
														
														System.out.println("HP recoverd by 10");
														PlayerHP = PlayerHP + 10;
														System.out.print("Your HP now is " + PlayerHP);
														System.out.println("\n");
														System.out.print("Press 0 to continue : ");
														loop10 = yourAction.nextInt();
														System.out.println("\n*************************************************");
														
														curePotion = curePotion - 1;
														end10 = 1 ;
														
														
														}if(yourchoice2 < 1 || yourchoice2 > 1){
															System.out.println("Please put a proper answer\n\n");
															
															System.out.print("Press 0 to continue : ");
															loop10 = yourAction.nextInt();
															System.out.println("\n*************************************************");
															
															end10 = 0 ;
													
													
													
													
													}
												
										}while(end10 == 0);
										
										
									
									}
								}
								
								if(GolemHP <= 0) {
									
									
									
									System.out.println("\nMARVELOUS! TRULY MARVELOUS!!");
									System.out.println("\nYou have defeated the Golem that attacked the village.\n\n");
									
									loop10 = 1;
									System.out.print("Press 0 to continue : ");
									kosong6 = yourAction.nextInt();
									System.out.println("\n*************************************************");
									forest = 1;
								}
								
								
								if(GolemHP != 0) {
									System.out.println("\nThe Golem attacked you");
									System.out.println("You received 8 damage\n\n");
									PlayerHP = PlayerHP - 8;
									System.out.print("Press 0 to continue : ");
									loop10 = yourAction.nextInt();
									System.out.println("\n*************************************************");
									
								}if(PlayerHP <= 0) {
									
									System.out.println("You are Dead!\n\n");
									System.out.println("Game over.");
									
											
									java.lang.System.exit(0);
									
							
									}	
								
									
			}while(loop10 == 0);
			
			
			
			//Last Chapter
			System.out.println("The villagers came towards you. The mayor of the village said :\n\n");
			System.out.println("	Mayor : Young warrior, thank you. Thank you so much for helping us.");
			System.out.println("	        How can we ever repay you kindness?");
			do {
				System.out.print("\n\nPress 0 to continue : ");
				startloop = inputRandom.nextInt();
				System.out.println();
			}while(startloop != 0);
			System.out.println("\n*************************************************");
			
			
			System.out.println("You replied :\n\n");
			System.out.println("	You : Well, if that's the case. How about i stay here for ");
			System.out.println("	      a couple days?");
			do {
				System.out.print("\n\nPress 0 to continue : ");
				startloop = inputRandom.nextInt();
				System.out.println();
			}while(startloop != 0);
			System.out.println("\n*************************************************");
			
			
			System.out.println("The mayor replied :\n\n");
			System.out.println("	Mayor : Anything for you young warrior!\n");
			
			
			
		System.out.println("The End");
			
			
			
			
			
				
	}
}
