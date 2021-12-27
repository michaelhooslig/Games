import java.util.Scanner;
class Main 
{
	//Combat Stuff
  private static int melee = 0;//
  private static int health;//
  private static int range = 0;//
  private static int pot;
	private static int brawn = 0;
	private static int dex = 0;
	private static int tough = 0;
	private static int intel = 0;
	private static int agility = 0;
  private static int Mhealth = 0;//
  private static int Hrune = 0;
  private static int Trune = 0;
  private static int Crune = 0;
  private static int treasure;
  private static int luck = 0;
	private static int XP = 0;
	private static int Lvl = 1;
	private static int soldierTraining = 0;//
	private static int wizardDmg = 0;//
	private static int weaponDmg = 0;//
	private static int rangeDmg = 0;//
	private static int magicBuff = 0;//
	private static int throwDmg = 0;
	private static int boltDmg = 0;
	private static int iceDmg = 0;
	private static int sparkDmg = 0;
	private static int fireDmg = 0;
	private static int quakeDmg = 0;
	private static int throw1 = 0;
	private static int spark1 = 0;
	private static int bolt1 = 0;
	private static int fire1 = 0;
	private static int ice1 = 0;
	private static int quake1 = 0;
	private static int bosscount = 0;
	private static double archerSpeed = .0;//
	private static double wizardAccuracy = .0;//
	private static double archerDeft = .0;//
	private static double xpThreshold = 10;
  private static double defence = .00;//
	private static double Mattack = .00;//
  private static double Rattack = .00;//
	private static double rand;
	private static double backup;//
	private static double manuver;//
	private static double Oprob = 0;
	private static double Tprob = 0;
	private static double SpSuccess = .00;//
	private static double Spclose = .0;
	private static double Sprange = .0;
	private static boolean canTrans = false;
	private static String spell1 = "";
	private static String spell2 = "";
	private static String spell3 = "";
	private static String Bchoice = "";

	//to use the Trader
	public static void goTrader()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\033[H\033[2J");
  	System.out.flush();

    System.out.println("\n\nYou open the door onto a well lit hallway with another door on the side. you follow a hunch and open the side door into a warm, well-lit room filled with personal objects. At the back of the space, an old man sits smoking a pipe.\n\n\nShopkeeper - 'Aah, welcome weary traveler. I see you wish to explore the depths of the dungeon.' \n\n Shopkeeper - 'While i'm far too old to go out adventuring, I may have a few items hear you could use, if you have goods to trade.\n\n Press 'Enter' to open the shop menu.");
    String confirm = scanner.nextLine();

   System.out.println("\n\n\nShaggy's Equipment Emporium:\n Your source of mundane supplies and inexplicable magic since 1969 (lol)\n\n");

  	while (true)
  	{          
    	System.out.println("You have " + treasure + " treasure left.");

      System.out.println("\n\n CATALOG:\n\n1 - Health potion, recover 8 Hp (1 treasure)\n2 - Health Rune, increase your max health (3 treasures)\n3 - Luck Rune, increase the rate at which you find treasure (5 treasures)\n4 - Combat Rune, Increases your chance to dodge enemy attacks (5 treasures)\n5 - Leave shop");

      System.out.println("\n\nType the number of your selection.\n");
      int Schoice = scanner.nextInt(); 

      //Buy potions
      if (Schoice == 1 && treasure >= 1)
      {
				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");

        System.out.println("Ahh, stocking up on healing I see. Always a wise choice.\n");
        pot++;
        treasure--;
        System.out.println("You now have " + pot + " health potion(s).");
        System.out.println("\n\nType 'Enter' to return to the shop menu");			
        confirm = scanner.nextLine();

				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");
      }
      else if (Schoice == 1 && treasure < 1)
      {
        System.out.println("Sorry, but you need treasures to trade here. Keep exploring for some.");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();
      }

      //Buy Health runes
      else if (Schoice == 2 && treasure >= 3)
      {
				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");

        System.out.println("Want some extra protection? These runes will help you.\n");
        Hrune++;
        treasure = treasure - 3;
        System.out.println("You now have " + Hrune + " health rune(s).");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();

				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");
      }
    	else if (Schoice == 2 && treasure < 3)
      {
      	System.out.println("Sorry, but you need more treasures to trade here. Keep exploring for some.");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();
      }

      //Buy Luck runes
      else if (Schoice == 3 && treasure >= 5)
      {
				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");

        System.out.println("Ahh, so you seek wealth. I had quite a few of these back in the day, but I'm so old I have no use for them now.\n");
        Trune++;
        treasure = treasure - 5;
        System.out.println("You now have " + Trune + " Luck rune(s).");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();

				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");
      }
      else if (Schoice == 3 && treasure < 5)
      {
        System.out.println("Sorry, but you need more treasures to trade here. Keep exploring for some.");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();
      }

      //Buy Combat runes
      else if (Schoice == 4 && treasure >= 5)
      {
				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");

        System.out.println("This is from a special collection. They can turn anyone into a true warrior. I hope you find more use from it than me.\n");
        Crune++;
        defence = defence + .1;
        System.out.println("You now have " + Trune + " Luck rune(s).");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();

				System.out.println("\n\n         ///*///*///*///*///*///*///*///*///*///*///*///*///\n\n");
      }
      else if (Schoice == 4 && treasure < 5)
      {
        System.out.println("Sorry, but you need more treasures to trade here. Keep exploring for some.");
        System.out.println("\n\nType 'Enter' to return to the shop menu");
        confirm = scanner.nextLine();
      }
      else if (Schoice == 5)
      {
        break;
      }                          
    }
	}


	//to Level up
	public static void levelUp()
	{
		Scanner scanner = new Scanner(System.in);
		if (XP >= xpThreshold)
		{
		System.out.println("\n\n\nYOU LEVELED UP!\n\nYou are now level " + (Lvl + 1) + " and have a skill to allocate.");
			int points = 1;
			while (points > 0)
			{
				System.out.println("\nYou have " + points + " points left to spend.");

				System.out.println("\n\nSKILLS:\n1 - Brawn: " + brawn + "\n\n2 - Dexterity: " + dex + "\n\n3 - Toughness: " + tough + "\n\n4 - Intelligence: " + intel + "\n\n5 - Agility: " + agility + "\n\n\nType the number of the skill you wish to improve.\n");

				int Lchoice = scanner.nextInt();
				if (Lchoice == 1)
				{
					brawn++;
					System.out.println("You upgraged your Brawn! You now are level " + brawn + " in Brawn.");
				}
				else if (Lchoice == 2)
				{
					dex++;
					System.out.println("You upgraged your Dexterity! You now are level " + dex + " in Dexterity.");
				}
				else if (Lchoice == 3)
				{
					tough++;
					System.out.println("You upgraged your Toughness! You now are level " + tough + " in Toughness.");
				}
				else if (Lchoice == 3)
				{
					intel++;
					System.out.println("You upgraged your Intelligence! You now are level " + intel + " in Intelligence.");
				}
				else if (Lchoice == 3)
				{
					agility++;
					System.out.println("You upgraged your Agility! You now are level " + agility + " in Agility.");
				}
				points--;
			}
			xpThreshold = (xpThreshold + 10)*1.25;
			Lvl++;
			System.out.println("Remember, if you don't know what a skill does, check the manual!\n\nEND OF LEVELING\n");

			//Stat refresh
			melee = (int)(.5 * brawn) + weaponDmg;
			range = (int)(.5 * dex) + rangeDmg;
			Mattack = (.08 * brawn) + .2;
			Rattack = (.08 * dex);
			Mhealth = (tough * 2) + 8 + soldierTraining;
			health = Mhealth;
			defence = (.05 * tough) + (.05 * agility) + .2;
			backup = (.08 * agility) + archerSpeed;
			manuver = (.05 * agility) + archerDeft;
			SpSuccess = (.05 * intel) + SpSuccess + wizardAccuracy;
			magicBuff = (intel / 4) + wizardDmg;
		}
	}


  public static void main(String[] args) 
  {
		Map tyrael = new Map();
		tyrael.makeMap();

		String roomtemp = tyrael.getData();
		String r00 = "e00";
		String r01 = roomtemp.substring(0,2);
		String r02 = roomtemp.substring(2,4);
		String r03 = roomtemp.substring(4,6);
		String r04 = roomtemp.substring(6,8);
		String r05 = roomtemp.substring(8,10);
		String r10 = roomtemp.substring(10,12);
		String r11 = roomtemp.substring(12,14);
		String r12 = roomtemp.substring(14,16);
		String r13 = roomtemp.substring(16,18);
		String r14 = roomtemp.substring(18,20);
		String r15 = roomtemp.substring(20,22);
		String r20 = roomtemp.substring(22,24);
		String r21 = roomtemp.substring(24,26);
		String r22 = roomtemp.substring(26,28);
		String r23 = roomtemp.substring(28,30);
		String r24 = roomtemp.substring(30,32);
		String r25 = roomtemp.substring(32,34);
		String r30 = roomtemp.substring(34,36);
		String r31 = roomtemp.substring(36,38);
		String r32 = roomtemp.substring(38,40);
		String r33 = roomtemp.substring(40,42);
		String r34 = roomtemp.substring(42,44);
		String r35 = roomtemp.substring(44,46);
		String r40 = roomtemp.substring(46,48);
		String r41 = roomtemp.substring(48,50);
		String r42 = roomtemp.substring(50,52);
		String r43 = roomtemp.substring(52,54);
		String r44 = roomtemp.substring(54,56);
		String r45 = roomtemp.substring(56,58);
		String r50 = roomtemp.substring(58,60);
		String r51 = roomtemp.substring(60,62);
		String r52 = roomtemp.substring(62,64);
		String r53 = roomtemp.substring(64,66);
		String r54 = roomtemp.substring(66,68);
		String r55 = roomtemp.substring(68,70);
		String Rid = "e00";

		Scanner scanner = new Scanner(System.in);

		System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("\n\n\nWelcome to the dungeon! \n \n Your job is to kill everything that tries to kill you.\n \n");

    System.out.println("Select a character\n \n Swordsman: These warriors are armed with a sword, shield, and a bad additude. While you have no ranged options, you have more health to stay in the fight. \n\n Archer: She works best when she has space between her and her enemys. She's nimbler than the swordsman, able to perform greater feats of ability, but is physically weaker and has less health.\n\n Wizard: These are not for the faint of heart or new player. They're the most extreme of glass-cannons that can clear the toughest enemys, but die almost instantly if they get pinned down.");
    while (true)
    {
      System.out.println("\n\nType the class you want:");

      String class1 = scanner.nextLine();

      if (class1.equalsIgnoreCase("Swordsman"))
      {
        brawn = 3;
				dex = 1;
				tough = 4;
				intel = 2;
				agility =3;
				soldierTraining = 2;
				weaponDmg = 2;

        pot = 1;
        treasure = 1;
        break;
      }
      else if (class1.equalsIgnoreCase("Archer"))
      {
        brawn = 1;
				dex = 4;
				tough = 1;
				intel = 2;
				agility = 4;
				rangeDmg = 2;
				archerSpeed = .1;
				archerDeft = .15;

        pot = 1;
        treasure = 1;
        break;
      }
			else if (class1.equalsIgnoreCase("Wizard"))
      {
        brawn = 1;
				dex = 1;
				tough = 1;
				intel = 5;
				agility = 2;
				wizardAccuracy = .25;
				wizardDmg = 1;
				canTrans = true;
				throwDmg = 3;

        pot = 1;
        treasure = 1;
        break;
      }
      System.out.println("Not a class, try again");
		}
		
		//Stat refresh
		melee = (int)(.5 * brawn) + weaponDmg;
		range = (int)(.5 * dex) + rangeDmg;
		Mattack = (.08 * brawn) + .2;
		Rattack = (.08 * dex);
		Mhealth = (tough * 2) + 8 + soldierTraining;
		health = Mhealth;
		defence = (.05 * tough) + (.05 * agility) + .2;
		backup = (.08 * agility) + archerSpeed;
		manuver = (.05 * agility) + archerDeft;
		SpSuccess = (.05 * intel) + SpSuccess + wizardAccuracy;
		magicBuff = (intel / 4) + wizardDmg;

		System.out.println("\nWant to read the manual?(y/n)");
		String temp = scanner.nextLine();

		if (temp.equals("y"))
		{
			System.out.println("\n\n\n Welcome to the Manual!\n\nWhile this is a pretty straight-forward game, there are some things that can take some explanation.\n\nATTRIBUTES:\nYour character is governed by its attributes. You improve your stats by leveling up, and what you invest in will govern you success in the dungeon.\nBrawn is the melee stat. It controls melee damage and accuracy. While you might think it is only useful to Swordsmen, be aware, it also governs armor requirments later in the game.\nMeanwhile, Dexterity is pure damage. Archers love Dex, and for good reason. Being able to kill enemys a when they can't hurt you is powerful, and dex helps with that. It buffs both the damage and accuracy of ranged weapons and opens up better bows later in the game. If you play Archer, use Dexterity.\nToughness is a good multipurpose stat. It's simple, more Toughness, more health. Plus, Toughness also give some defenc to reduce damage as well. Besides that, there isn't much to say. If you need survivability, upgrade toughness.\nIntelligence is an interesting stat. It is the favored attribute of Wizards, since it gets them better, more powerful spells, but it can also be used by others for specific purposes. Intelligence also governs rune usage as well as spell buffs by increasing the amount of runes you can have active at once, so most classes can use a decent Intel score.\nFinally, we get to Agility. This is the most tactical attribute, as it gives no direct buff to combat but instead gives you options. Agility increases the success of charge attacks and kick-back manuvers that get you in and out of range. Plus, it helps you keep away from an enemy once you are far away. Use Agility to be stratigic in you combat plays.\n\nCLASSES:\nThere are three classes to play, Swordsman, Archer, and Wizard.\nSwordsmen are tough and use there health to stick in close. They like big weapons and armor to hack and slash at people. When playing one focus on Brawn and Toughness, as they will carry you the furthest. Later on, you can play with Agility and Intelligence. If you want a straight-forward experience, play a Swordsman. \nArchers are a nimbler breed, and focus more on running and shooting than direct confrontation. They have high Dex and Agility scores, so use them to stay at range and hit your enemys with powerful arrows. Be aware, Archers start with less health than Swordsmen, so keep on your toes.\n Finnaly, we get to Wizards. These guys are the epitome of glass-cannon. You start with mountains of intelect, but basicly nothing else and desperatly need to expand and improve your arsenal to keep ahead of the monsters. My advice, invest into Intelligence primarily and Agility when you have a point to spare. All of the good spells take huge Intel, so stick with it!\n\nCOMBAT:\nWhen in combat, you will either be at far away, or close to your opponent. Most fights start with a bit of distance between you and your foe, but that isn't always the case. \nYour distance from the enemy gives you certain options for attack. When at range you can shoot an enemy's body for better accuracy, his legs to cripple his movement and make him slower to dodge and catch you, or you can charge and close the gap yourself.\nOnce up close, your ranged weapons will be useless, so you get a new set of actions. You can go all out on a sword swipe and use you full melee damage, you could be defensive and jab at the enemy to protect yourself in exchange for damage, or you could kick the enemy back and try to get away.\n\n ENEMYS:\nYou'll also meet an interesting host of enemys in the dungeons. All enemys have a preset damage stat and atributes, but their health is random.\nGoblins are the lowest and most common of enemys. They have pitiful health and damage, but tend to drop less. Killing them should be relativly easy.\nOrcs are a bit tougher than goblins and have better armor, making them harder to hit but drop better loot and XP. Taking these guys down requires a bit of stratagy, but shouldn't be to hard.\nTrolls are the worst. They have huge health pools and hit hard with their clubs. The only upside is their big frame makes them mssive targets and they can be slow to attack. Still, watch it with these guys and go in with a plan.\n\n RUNES:\nRunes are the main way to upgrade your stats. They are magic symbols that give buffs when held to your person. The three main types are Health, Combat, and Luck.\nHealth Runes increase your max health, and most are simple stone runes that only give 2 more health. But, very rarely, you can find silver runes that give you 3.\nCombat Runes increase your defence and protect you from attacks in fights. Not perfectly, but still a good amount. The best way to find these is by buying them from a trader.\nLuck Runes are the final and most cosmetic of runes. There only ability is granting you more treasure in you travels, and they can only be bought with treasure from traders. They are longer term investments, and are lower priority early in the game.");
			String choice = scanner.nextLine();
		}
      
    System.out.println("\nReady to go? Type 'Enter' to start. \n");
		String choice2 = scanner.nextLine();
								
		
		if (choice2.equals("Enter"))
		{
			System.out.println("Good luck adventurer!\n \n\n\n\n\n\n");
		}
	

		//Start the Adventure loop     here      here      here      here

    while (true)
    {
			System.out.print("\033[H\033[2J");
    	System.out.flush();

			Map.printMap();

			System.out.println("\n You are in room: " + Rid + "\n\n");

			if (Rid.endsWith("00"))
			{
				if (r01.endsWith("01"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r10.endsWith("10"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r01.endsWith("01"))
				{
					Rid = r01;
				}
				if (Dchoice.equalsIgnoreCase("s") && r10.endsWith("10"))
				{
					Rid = r10;
				}
			}

			else if (Rid.endsWith("01"))
			{
				if (r02.endsWith("02"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r11.endsWith("11"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r00.endsWith("00"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r02.endsWith("02"))
				{
					Rid = r02;
				}
				if (Dchoice.equalsIgnoreCase("s") && r11.endsWith("11"))
				{
					Rid = r11;
				}
				if (Dchoice.equalsIgnoreCase("w") && r00.endsWith("00"))
				{
					Rid = r00;
				}
			}

			else if (Rid.endsWith("02"))
			{
				if (r03.endsWith("03"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r12.endsWith("12"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r01.endsWith("01"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r03.endsWith("03"))
				{
					Rid = r03;
				}
				if (Dchoice.equalsIgnoreCase("s") && r12.endsWith("12"))
				{
					Rid = r12;
				}
				if (Dchoice.equalsIgnoreCase("w") && r01.endsWith("01"))
				{
					Rid = r01;
				}
			}

			else if (Rid.endsWith("03"))
			{
				if (r04.endsWith("04"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r13.endsWith("13"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r02.endsWith("02"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r04.endsWith("04"))
				{
					Rid = r04;
				}
				if (Dchoice.equalsIgnoreCase("s") && r13.endsWith("13"))
				{
					Rid = r13;
				}
				if (Dchoice.equalsIgnoreCase("w") && r02.endsWith("02"))
				{
					Rid = r02;
				}
			}

			else if (Rid.endsWith("04"))
			{
				if (r05.endsWith("05"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r14.endsWith("14"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r03.endsWith("03"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r05.endsWith("05"))
				{
					Rid = r05;
				}
				if (Dchoice.equalsIgnoreCase("s") && r14.endsWith("14"))
				{
					Rid = r14;
				}
				if (Dchoice.equalsIgnoreCase("w") && r03.endsWith("03"))
				{
					Rid = r03;
				}
			}

			else if (Rid.endsWith("05"))
			{
				if (r15.endsWith("15"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r04.endsWith("04"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("s") && r15.endsWith("15"))
				{
					Rid = r15;
				}
				if (Dchoice.equalsIgnoreCase("w") && r04.endsWith("04"))
				{
					Rid = r04;
				}
			}

			else if (Rid.endsWith("10"))
			{
				if (r11.endsWith("11"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r20.endsWith("20"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r00.endsWith("00"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r11.endsWith("11"))
				{
					Rid = r11;
				}
				if (Dchoice.equalsIgnoreCase("s") && r20.endsWith("20"))
				{
					Rid = r20;
				}
				if (Dchoice.equalsIgnoreCase("n") && r00.endsWith("00"))
				{
					Rid = r00;
				}
			}

			else if (Rid.endsWith("11"))
			{
				if (r12.endsWith("12"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r21.endsWith("21"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r10.endsWith("10"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r01.endsWith("01"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r12.endsWith("12"))
				{
					Rid = r12;
				}
				if (Dchoice.equalsIgnoreCase("s") && r21.endsWith("21"))
				{
					Rid = r21;
				}
				if (Dchoice.equalsIgnoreCase("w") && r10.endsWith("10"))
				{
					Rid = r10;
				}
				if (Dchoice.equalsIgnoreCase("n") && r01.endsWith("01"))
				{
					Rid = r01;
				}
			}

			else if (Rid.endsWith("12"))
			{
				if (r13.endsWith("13"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r22.endsWith("22"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r11.endsWith("11"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r02.endsWith("02"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r13.endsWith("13"))
				{
					Rid = r13;
				}
				if (Dchoice.equalsIgnoreCase("s") && r22.endsWith("22"))
				{
					Rid = r22;
				}
				if (Dchoice.equalsIgnoreCase("w") && r11.endsWith("11"))
				{
					Rid = r11;
				}
				if (Dchoice.equalsIgnoreCase("n") && r02.endsWith("02"))
				{
					Rid = r02;
				}
			}

			else if (Rid.endsWith("13"))
			{
				if (r14.endsWith("14"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r23.endsWith("23"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r12.endsWith("12"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r03.endsWith("03"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r14.endsWith("14"))
				{
					Rid = r14;
				}
				if (Dchoice.equalsIgnoreCase("s") && r23.endsWith("23"))
				{
					Rid = r23;
				}
				if (Dchoice.equalsIgnoreCase("w") && r12.endsWith("12"))
				{
					Rid = r12;
				}
				if (Dchoice.equalsIgnoreCase("n") && r03.endsWith("03"))
				{
					Rid = r03;
				}
			}

			else if (Rid.endsWith("14"))
			{
				if (r15.endsWith("15"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r24.endsWith("24"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r13.endsWith("13"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r04.endsWith("04"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r15.endsWith("15"))
				{
					Rid = r15;
				}
				if (Dchoice.equalsIgnoreCase("s") && r24.endsWith("24"))
				{
					Rid = r24;
				}
				if (Dchoice.equalsIgnoreCase("w") && r13.endsWith("13"))
				{
					Rid = r13;
				}
				if (Dchoice.equalsIgnoreCase("n") && r04.endsWith("04"))
				{
					Rid = r04;
				}
			}

			else if (Rid.endsWith("15"))
			{
				if (r25.endsWith("25"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r14.endsWith("14"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r05.endsWith("05"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("s") && r25.endsWith("25"))
				{
					Rid = r25;
				}
				if (Dchoice.equalsIgnoreCase("w") && r14.endsWith("14"))
				{
					Rid = r14;
				}
				if (Dchoice.equalsIgnoreCase("n") && r05.endsWith("05"))
				{
					Rid = r05;
				}
			}

			else if (Rid.endsWith("20"))
			{
				if (r21.endsWith("21"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r30.endsWith("30"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r10.endsWith("10"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r21.endsWith("21"))
				{
					Rid = r21;
				}
				if (Dchoice.equalsIgnoreCase("s") && r30.endsWith("30"))
				{
					Rid = r30;
				}
				if (Dchoice.equalsIgnoreCase("n") && r10.endsWith("10"))
				{
					Rid = r10;
				}
			}

			else if (Rid.endsWith("21"))
			{
				if (r22.endsWith("22"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r31.endsWith("31"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r20.endsWith("20"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r11.endsWith("11"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r22.endsWith("22"))
				{
					Rid = r22;
				}
				if (Dchoice.equalsIgnoreCase("s") && r31.endsWith("31"))
				{
					Rid = r31;
				}
				if (Dchoice.equalsIgnoreCase("w") && r20.endsWith("20"))
				{
					Rid = r20;
				}
				if (Dchoice.equalsIgnoreCase("n") && r11.endsWith("11"))
				{
					Rid = r11;
				}
			}

			else if (Rid.endsWith("22"))
			{
				if (r23.endsWith("23"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r32.endsWith("32"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r21.endsWith("21"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r12.endsWith("12"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r23.endsWith("23"))
				{
					Rid = r22;
				}
				if (Dchoice.equalsIgnoreCase("s") && r31.endsWith("32"))
				{
					Rid = r32;
				}
				if (Dchoice.equalsIgnoreCase("w") && r20.endsWith("21"))
				{
					Rid = r21;
				}
				if (Dchoice.equalsIgnoreCase("n") && r11.endsWith("12"))
				{
					Rid = r12;
				}
			}

			else if (Rid.endsWith("23"))
			{
				if (r24.endsWith("24"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r33.endsWith("33"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r22.endsWith("22"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r13.endsWith("13"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r24.endsWith("24"))
				{
					Rid = r24;
				}
				if (Dchoice.equalsIgnoreCase("s") && r33.endsWith("33"))
				{
					Rid = r33;
				}
				if (Dchoice.equalsIgnoreCase("w") && r22.endsWith("22"))
				{
					Rid = r22;
				}
				if (Dchoice.equalsIgnoreCase("n") && r13.endsWith("13"))
				{
					Rid = r13;
				}
			}

			else if (Rid.endsWith("24"))
			{
				if (r25.endsWith("25"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r34.endsWith("34"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r23.endsWith("23"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r14.endsWith("14"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r25.endsWith("25"))
				{
					Rid = r25;
				}
				if (Dchoice.equalsIgnoreCase("s") && r34.endsWith("34"))
				{
					Rid = r34;
				}
				if (Dchoice.equalsIgnoreCase("w") && r23.endsWith("23"))
				{
					Rid = r23;
				}
				if (Dchoice.equalsIgnoreCase("n") && r14.endsWith("14"))
				{
					Rid = r14;
				}
			}

			else if (Rid.endsWith("25"))
			{
				if (r35.endsWith("35"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r24.endsWith("24"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r15.endsWith("15"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("s") && r35.endsWith("35"))
				{
					Rid = r35;
				}
				if (Dchoice.equalsIgnoreCase("w") && r24.endsWith("24"))
				{
					Rid = r24;
				}
				if (Dchoice.equalsIgnoreCase("n") && r15.endsWith("15"))
				{
					Rid = r15;
				}
			}

			else if (Rid.endsWith("30"))
			{
				if (r31.endsWith("31"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r40.endsWith("40"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r20.endsWith("20"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r31.endsWith("31"))
				{
					Rid = r31;
				}
				if (Dchoice.equalsIgnoreCase("s") && r40.endsWith("40"))
				{
					Rid = r41;
				}
				if (Dchoice.equalsIgnoreCase("n") && r20.endsWith("20"))
				{
					Rid = r20;
				}
			}

			else if (Rid.endsWith("31"))
			{
				if (r32.endsWith("32"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r41.endsWith("41"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r30.endsWith("30"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r21.endsWith("21"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r32.endsWith("32"))
				{
					Rid = r32;
				}
				if (Dchoice.equalsIgnoreCase("s") && r41.endsWith("41"))
				{
					Rid = r41;
				}
				if (Dchoice.equalsIgnoreCase("w") && r30.endsWith("30"))
				{
					Rid = r30;
				}
				if (Dchoice.equalsIgnoreCase("n") && r21.endsWith("21"))
				{
					Rid = r21;
				}
			}

			else if (Rid.endsWith("32"))
			{
				if (r33.endsWith("33"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r42.endsWith("42"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r31.endsWith("31"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r22.endsWith("22"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r33.endsWith("33"))
				{
					Rid = r33;
				}
				if (Dchoice.equalsIgnoreCase("s") && r42.endsWith("42"))
				{
					Rid = r42;
				}
				if (Dchoice.equalsIgnoreCase("w") && r31.endsWith("31"))
				{
					Rid = r31;
				}
				if (Dchoice.equalsIgnoreCase("n") && r22.endsWith("22"))
				{
					Rid = r22;
				}
			}

			else if (Rid.endsWith("33"))
			{
				if (r34.endsWith("34"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r43.endsWith("43"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r32.endsWith("32"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r23.endsWith("23"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r34.endsWith("34"))
				{
					Rid = r34;
				}
				if (Dchoice.equalsIgnoreCase("s") && r43.endsWith("43"))
				{
					Rid = r43;
				}
				if (Dchoice.equalsIgnoreCase("w") && r32.endsWith("32"))
				{
					Rid = r32;
				}
				if (Dchoice.equalsIgnoreCase("n") && r23.endsWith("23"))
				{
					Rid = r23;
				}
			}

			else if (Rid.endsWith("34"))
			{
				if (r35.endsWith("35"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r44.endsWith("44"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r33.endsWith("33"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r24.endsWith("24"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r35.endsWith("35"))
				{
					Rid = r35;
				}
				if (Dchoice.equalsIgnoreCase("s") && r44.endsWith("44"))
				{
					Rid = r44;
				}
				if (Dchoice.equalsIgnoreCase("w") && r33.endsWith("33"))
				{
					Rid = r33;
				}
				if (Dchoice.equalsIgnoreCase("n") && r24.endsWith("24"))
				{
					Rid = r24;
				}
			}

			else if (Rid.endsWith("35"))
			{
				if (r45.endsWith("45"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r34.endsWith("34"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r25.endsWith("25"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("s") && r45.endsWith("45"))
				{
					Rid = r45;
				}
				if (Dchoice.equalsIgnoreCase("w") && r34.endsWith("34"))
				{
					Rid = r34;
				}
				if (Dchoice.equalsIgnoreCase("n") && r25.endsWith("25"))
				{
					Rid = r25;
				}
			}

			else if (Rid.endsWith("40"))
			{
				if (r41.endsWith("41"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r50.endsWith("50"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r30.endsWith("30"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r41.endsWith("41"))
				{
					Rid = r41;
				}
				if (Dchoice.equalsIgnoreCase("s") && r50.endsWith("50"))
				{
					Rid = r50;
				}
				if (Dchoice.equalsIgnoreCase("n") && r30.endsWith("30"))
				{
					Rid = r30;
				}
			}

			else if (Rid.endsWith("41"))
			{
				if (r42.endsWith("42"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r51.endsWith("51"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r40.endsWith("40"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r31.endsWith("31"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r42.endsWith("42"))
				{
					Rid = r42;
				}
				if (Dchoice.equalsIgnoreCase("s") && r51.endsWith("51"))
				{
					Rid = r51;
				}
				if (Dchoice.equalsIgnoreCase("w") && r40.endsWith("40"))
				{
					Rid = r40;
				}
				if (Dchoice.equalsIgnoreCase("n") && r31.endsWith("31"))
				{
					Rid = r31;
				}
			}

			else if (Rid.endsWith("42"))
			{
				if (r43.endsWith("43"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r52.endsWith("52"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r41.endsWith("41"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r32.endsWith("32"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r42.endsWith("43"))
				{
					Rid = r43;
				}
				if (Dchoice.equalsIgnoreCase("s") && r52.endsWith("52"))
				{
					Rid = r52;
				}
				if (Dchoice.equalsIgnoreCase("w") && r41.endsWith("41"))
				{
					Rid = r41;
				}
				if (Dchoice.equalsIgnoreCase("n") && r32.endsWith("32"))
				{
					Rid = r32;
				}
			}

			else if (Rid.endsWith("43"))
			{
				if (r44.endsWith("44"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r53.endsWith("53"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r42.endsWith("42"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r33.endsWith("33"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r44.endsWith("44"))
				{
					Rid = r44;
				}
				if (Dchoice.equalsIgnoreCase("s") && r53.endsWith("53"))
				{
					Rid = r53;
				}
				if (Dchoice.equalsIgnoreCase("w") && r42.endsWith("42"))
				{
					Rid = r42;
				}
				if (Dchoice.equalsIgnoreCase("n") && r33.endsWith("33"))
				{
					Rid = r33;
				}
			}

			else if (Rid.endsWith("44"))
			{
				if (r45.endsWith("45"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r54.endsWith("54"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r43.endsWith("43"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r34.endsWith("34"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r45.endsWith("45"))
				{
					Rid = r45;
				}
				if (Dchoice.equalsIgnoreCase("s") && r54.endsWith("54"))
				{
					Rid = r54;
				}
				if (Dchoice.equalsIgnoreCase("w") && r43.endsWith("43"))
				{
					Rid = r43;
				}
				if (Dchoice.equalsIgnoreCase("n") && r34.endsWith("34"))
				{
					Rid = r34;
				}
			}

			else if (Rid.endsWith("45"))
			{
				if (r55.endsWith("55"))
				{
					System.out.println("There is a door to the South. To enter, type 'S'");
				}
				if (r44.endsWith("44"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r35.endsWith("35"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("s") && r55.endsWith("55"))
				{
					Rid = r55;
				}
				if (Dchoice.equalsIgnoreCase("w") && r44.endsWith("44"))
				{
					Rid = r44;
				}
				if (Dchoice.equalsIgnoreCase("n") && r35.endsWith("35"))
				{
					Rid = r35;
				}
			}

			else if (Rid.endsWith("50"))
			{
				if (r51.endsWith("51"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r40.endsWith("40"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r51.endsWith("51"))
				{
					Rid = r42;
				}
				if (Dchoice.equalsIgnoreCase("n") && r40.endsWith("40"))
				{
					Rid = r40;
				}
			}

			else if (Rid.endsWith("51"))
			{
				if (r52.endsWith("52"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r50.endsWith("50"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r41.endsWith("41"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r52.endsWith("52"))
				{
					Rid = r52;
				}
				if (Dchoice.equalsIgnoreCase("w") && r50.endsWith("50"))
				{
					Rid = r50;
				}
				if (Dchoice.equalsIgnoreCase("n") && r41.endsWith("41"))
				{
					Rid = r41;
				}
			}

			else if (Rid.endsWith("52"))
			{
				if (r53.endsWith("53"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r51.endsWith("51"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r42.endsWith("42"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r53.endsWith("53"))
				{
					Rid = r53;
				}
				if (Dchoice.equalsIgnoreCase("w") && r51.endsWith("51"))
				{
					Rid = r51;
				}
				if (Dchoice.equalsIgnoreCase("n") && r41.endsWith("42"))
				{
					Rid = r42;
				}
			}

			else if (Rid.endsWith("53"))
			{
				if (r54.endsWith("54"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r52.endsWith("52"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r43.endsWith("43"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r54.endsWith("54"))
				{
					Rid = r54;
				}
				if (Dchoice.equalsIgnoreCase("w") && r52.endsWith("52"))
				{
					Rid = r52;
				}
				if (Dchoice.equalsIgnoreCase("n") && r43.endsWith("43"))
				{
					Rid = r43;
				}
			}

			else if (Rid.endsWith("54"))
			{
				if (r55.endsWith("55"))
				{
					System.out.println("There is a door to the East. To enter, type 'E'");
				}
				if (r53.endsWith("53"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r44.endsWith("44"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("e") && r55.endsWith("55"))
				{
					Rid = r55;
				}
				if (Dchoice.equalsIgnoreCase("w") && r53.endsWith("53"))
				{
					Rid = r53;
				}
				if (Dchoice.equalsIgnoreCase("n") && r44.endsWith("44"))
				{
					Rid = r44;
				}
			}
			
			else if (Rid.endsWith("55"))
			{
				if (r53.endsWith("54"))
				{
					System.out.println("There is a door to the West. To enter, type 'W'");
				}
				if (r44.endsWith("45"))
				{
					System.out.println("There is a door to the North. To enter, type 'N'");
				}
				String Dchoice = scanner.nextLine();
				if (Dchoice.equalsIgnoreCase("w") && r54.endsWith("54"))
				{
					Rid = r54;
				}
				if (Dchoice.equalsIgnoreCase("n") && r45.endsWith("45"))
				{
					Rid = r45;
				}
			}


			//at the door here
			for (int j = 0; j <= 0; j++)
			{
				System.out.println("\n\nYou move to the door. Before you go in, you consider your options.\n\n ");
      	System.out.println("Type 'E' to go in\nType 'C' to look at your stats\nType 'S' to look at your spell list\nType 'D' to use a potion and regain 8 life\nType 'Leave' to leave the Dungeon\n\n");
			

				String Bchoice = scanner.nextLine();

				System.out.println("///////////////*//////////////////");

				//Character Screen
				if (Bchoice.equalsIgnoreCase("C"))
      	{
					System.out.println("\n\nYour stats:\n\nLevel: " + Lvl + "\nXp: " + XP + "            Xp needed to Level Up: " + (xpThreshold - XP) + "\n\nHealth is " + health + "\n\nMelee damage is " + melee + "\nRanged damage is " + range + "\n\nMelee Accuracy is " + Mattack + "\nRanged Accuracy is " + Rattack + "\nDefence is " + defence + "\n\nYou have " + pot + " health potion(s)\nYou have " + treasure + " piece(s) of gold\n\n");

					System.out.println("Your Attributes:\n\nBrawn: " + brawn + "\nDexterity: " + dex + "\nToughness: " + tough + "\nIntelligence: " + intel + "\nAgility: " + agility);
					j--;
					
					for (int i = 0; i < Hrune; i++)
					{
					System.out.println("A health rune increases your max health.");
					}

					System.out.println("");

					for (int i = 0; i < Trune; i++)
					{
						System.out.println("A treasure rune increases your luck by 5%.");
					}

					System.out.println("");

					for (int i = 0; i < Crune; i++)
					{
						System.out.println("A combat rune amplifys your ability to dodge enemy attacks by 10%.");
					}

					System.out.println("\n\n Hit 'Enter' to go back to the door.");
					String confirm = scanner.nextLine();
				}

				//Spell Menu
				else if (Bchoice.equalsIgnoreCase("S"))
				{
					j--;
					while (true)
					{
						System.out.println("\n\nYour spell list:\n");

						if (throwDmg > 0)
						{
							System.out.println(" 1 - Telekinetic Throw\n");
						}

						if (sparkDmg > 0)
						{
							System.out.println(" 2 - Energy Spark\n");
						}

						if (boltDmg > 0)
						{
							System.out.println(" 3 - Lightning Bolt\n");
						}

						if (fireDmg > 0)
						{
							System.out.println(" 4 - Flamethrower\n");
						}

						if (iceDmg > 0)
						{
							System.out.println(" 5 - Ice Storm\n");
						}

						if (quakeDmg > 0)
						{
							System.out.println(" 6 - Earthquake\n");
						}

						System.out.println("\nEquiped spells:\n" + spell1 + "\n\n" + spell2 + "\n\n" + spell3 + "\n");

						System.out.println("If you want to see a spell's stats Type 's'\n If you wish to equip a spell Type 'e'\n If you want to return to the menu, Type 'r'");

						String stemp = scanner.nextLine();

						//Look at a spell
						if (stemp.equals("s"))
						{
							System.out.println("\nWhich spell do you want to look at? Type the number");

							int spchoice = scanner.nextInt();

							System.out.println("\n");

							if (spchoice == 1 && throwDmg > 0)
							{
								System.out.println("Telekinetic Throw is a long distance, low damage spell that uses the concussive force from an object moved with your mind to hurt enemys.\nDamage: " + (throwDmg + magicBuff) + "\nAccuracy: " + (SpSuccess + Sprange));
							}

							if (spchoice == 2 && sparkDmg > 0)
							{
								System.out.println("Energy Spark is a close range electric spell that hits nearby enemys with a powerful shock.\nDamage: " + (sparkDmg + magicBuff) + "\nAccuracy: " + (SpSuccess + Spclose));
							}

							if (spchoice == 3 && boltDmg > 0)
							{
								System.out.println("Lightning Bolt sends a powerful arc of electricity at your enemys and roasts there innards.\nDamage: " + (boltDmg + magicBuff) + "\nAccuracy: " + (SpSuccess + Sprange));
							}

							if (spchoice == 4 && fireDmg > 0)
							{
								System.out.println("Flamethower is a simple spell, you summon a massive cone of flame and douse you enemys in hellfire. Pretty nice. \nDamage: " + (fireDmg + magicBuff) + "\nAccuracy: " + (SpSuccess + Spclose));
							}

							if (spchoice == 5 && iceDmg > 0)
							{
								System.out.println("Ice Storm rains frozen vengence on any and all who oppose you. As a plus, most enemys who don't get pummels instantly by this spell are too frozen to catch you.\nDamage: " + (iceDmg + magicBuff) + "\nAccuracy: " + (SpSuccess + Sprange));
							}

							if (spchoice == 6 && quakeDmg > 0)
							{
								System.out.println("Earthquake causes the ground beneath your opponent to split open and strike them with stony blows. On top of breaking a few bones, it tends to break an enemys concetration and makes them easier to hit.\nDamage: " + (quakeDmg + magicBuff) + "\nAccuracy: " + (SpSuccess + Spclose));
							}
						}

						//Equip a spell
						else if (stemp.equals("e"))
						{
							System.out.println("\nWhich spell do you want to equip? Type the number of the spell you want.");

							int spchoice = scanner.nextInt();

							//equip throw
							if (spchoice == 1 && throwDmg > 0)
							{
								if (spell1.equals(""))
								{
									System.out.println("\nYou equip Telekinetic Throw.");
									spell1 = "Telekinetic Throw";
								}
								else if (spell2.equals(""))
								{
									System.out.println("\nYou equip Telekinetic Throw.");
									spell2 = "Telekinetic Throw";
								}
								else if (spell3.equals(""))
								{
									System.out.println("\nYou equip Telekinetic Throw.");
									spell3 = "Telekinetic Throw";
								}
								else
								{
									System.out.println("\n Which spell do you want to replace?\n1 - " + spell1 + "\n2 - " + spell2 + "\n3 - " + spell3 + "\n\nType the number.");

									int spchoice2 = scanner.nextInt();

									if (spchoice2 == 1)
									{
										System.out.println("\nYou equip Telekinetic Throw.");
										spell1 = "Telekinetic Throw";
									}

									if (spchoice2 == 2)
									{
										System.out.println("\nYou equip Telekinetic Throw.");
										spell2 = "Telekinetic Throw";
									}

									if (spchoice2 == 3)
									{
										System.out.println("\nYou equip Telekinetic Throw.");
										spell3 = "Telekinetic Throw";
									}
								}
							}

							//equip spark
							if (spchoice == 2 && sparkDmg > 0)
							{
								if (spell1.equals(""))
								{
									System.out.println("\nYou equip Energy Spark.");
									spell1 = "Energy Spark";
								}
								else if (spell2.equals(""))
								{
									System.out.println("\nYou equip Energy Spark.");
									spell2 = "Energy Spark";
								}
								else if (spell3.equals(""))
								{
									System.out.println("\nYou equip Energy Spark.");
									spell3 = "Energy Spark";
								}
								else
								{
									System.out.println("\n Which spell do you want to replace?\n1 - " + spell1 + "\n2 - " + spell2 + "\n3 - " + spell3 + "\n\nType the number.");

									int spchoice2 = scanner.nextInt();

									if (spchoice2 == 1)
									{
										System.out.println("\nYou equip Energy Spark.");
										spell1 = "Energy Spark";
									}

									if (spchoice2 == 2)
									{
										System.out.println("\nYou equip Energy Spark.");
										spell2 = "Energy Spark";
									}

									if (spchoice2 == 3)
									{
										System.out.println("\nYou equip Energy Spark.");
										spell3 = "Energy Spark";
									}
								}
							}

							//equip bolt
							if (spchoice == 3 && boltDmg > 0)
							{
								if (spell1.equals(""))
								{
									System.out.println("\nYou equip Lightning Bolt.");
									spell1 = "Lightning Bolt";
								}
								else if (spell2.equals(""))
								{
									System.out.println("\nYou equip Lightning Bolt.");
									spell2 = "Lightning Bolt";
								}
								else if (spell3.equals(""))
								{
									System.out.println("\nYou equip Lightning Bolt.");
									spell3 = "Lightning Bolt";
								}
								else
								{
									System.out.println("\n Which spell do you want to replace?\n1 - " + spell1 + "\n2 - " + spell2 + "\n3 - " + spell3 + "\n\nType the number.");

									int spchoice2 = scanner.nextInt();

									if (spchoice2 == 1)
									{
										System.out.println("\nYou equip Lightning Bolt.");
										spell1 = "Lightning Bolt";
									}

									if (spchoice2 == 2)
									{
										System.out.println("\nYou equip Lightning Bolt.");
										spell2 = "Lightning Bolt";
									}

									if (spchoice2 == 3)
									{
										System.out.println("\nYou equip Lightning Bolt.");
										spell3 = "Lightning Bolt";
									}
								}
							}
							
							//equip fire
							if (spchoice == 4 && fireDmg > 0)
							{
								if (spell1.equals(""))
								{
									System.out.println("\nYou equip Flamethrower.");
									spell1 = "Flamethrower";
								}
								else if (spell2.equals(""))
								{
									System.out.println("\nYou equip Flamethrower.");
									spell2 = "Flamethrower";
								}
								else if (spell3.equals(""))
								{
									System.out.println("\nYou equip Flamethrower.");
									spell3 = "Flamethrower";
								}
								else
								{
									System.out.println("\n Which spell do you want to replace?\n1 - " + spell1 + "\n2 - " + spell2 + "\n3 - " + spell3 + "\n\nType the number.");

									int spchoice2 = scanner.nextInt();

									if (spchoice2 == 1)
									{
										System.out.println("\nYou equip Flamethrower.");
										spell1 = "Flamethrower";
									}

									if (spchoice2 == 2)
									{
										System.out.println("\nYou equip Flamethrower.");
										spell2 = "Flamethrower";
									}

									if (spchoice2 == 3)
									{
										System.out.println("\nYou equip Flamethrower.");
										spell3 = "Flamethrower";
									}
								}
							}

							//equip ice
							if (spchoice == 5 && iceDmg > 0)
							{
								if (spell1.equals(""))
								{
									System.out.println("\nYou equip Ice Storm.");
									spell1 = "Ice Storm";
								}
								else if (spell2.equals(""))
								{
									System.out.println("\nYou equip Ice Storm.");
									spell2 = "Ice Storm";
								}
								else if (spell3.equals(""))
								{
									System.out.println("\nYou equip Ice Storm.");
									spell3 = "Ice Storm";
								}
								else
								{
									System.out.println("\n Which spell do you want to replace?\n1 - " + spell1 + "\n2 - " + spell2 + "\n3 - " + spell3 + "\n\nType the number.");

									int spchoice2 = scanner.nextInt();

									if (spchoice2 == 1)
									{
										System.out.println("\nYou equip Ice Storm.");
										spell1 = "Ice Storm";
									}

									if (spchoice2 == 2)
									{
										System.out.println("\nYou equip Ice Storm.");
										spell2 = "Ice Storm";
									}

									if (spchoice2 == 3)
									{
										System.out.println("\nYou equip Ice Storm.");
										spell3 = "Ice Storm";
									}
								}
							}

							//equip quake
							if (spchoice == 5 && quakeDmg > 0)
							{
								if (spell1.equals(""))
								{
									System.out.println("\nYou equip Earthquake.");
									spell1 = "Earthquake";
								}
								else if (spell2.equals(""))
								{
									System.out.println("\nYou equip Earthquake.");
									spell2 = "Earthquake";
								}
								else if (spell3.equals(""))
								{
									System.out.println("\nYou equip Earthquake.");
									spell3 = "Earthquake";
								}
								else
								{
									System.out.println("\n Which spell do you want to replace?\n1 - " + spell1 + "\n2 - " + spell2 + "\n3 - " + spell3 + "\n\nType the number.");

									int spchoice2 = scanner.nextInt();

									if (spchoice2 == 1)
									{
										System.out.println("\nYou equip Earthquake.");
										spell1 = "Earthquake";
									}

									if (spchoice2 == 2)
									{
										System.out.println("\nYou equip Earthquake.");
										spell2 = "Earthquake";
									}

									if (spchoice2 == 3)
									{
										System.out.println("\nYou equip Earthquake.");
										spell3 = "Earthquake";
									}
								}
							}
						}
						else
						{
							break;
						}
					}
				}

				//Drinking a potion
				else if (Bchoice.equalsIgnoreCase("D") && health != Mhealth)
				{
					j--;
					if ((health + 8) > Mhealth)
					{
						health = Mhealth;
						System.out.println("Ahh, that was refreshing. A bit overkill, but it still topped you off. Hit 'Enter' to go back to the door.");
						String confirm = scanner.nextLine();
					}
					else if ((health + 8) <= Mhealth)
					{
						health = health + 8;
						System.out.println("Ahh, that was refreshing. You needed a pick me up. Hit 'Enter' to go back to the door.");
						String confirm = scanner.nextLine();
					}
					else
					{
						System.out.println("You can't drink right now. Hit 'Enter' to go back to the door.");
						String confirm = scanner.nextLine();
					}
				}

				// Enter a Room
				else if (Bchoice.equalsIgnoreCase("E"))
				{

					//entrance
					if (Rid.startsWith("e"))
					{
						System.out.println("You stand at the staircase that lead you down here. Nothing to do but move farther into the depths.");
						String confirm = scanner.nextLine();
					}

					//old combat
					else if(Rid.startsWith("c"))
					{
						System.out.println("The stench of death is in the air as you move back into this room. The monster you slew is still lying on the floor where you left him. You already looked over this place for loot, so there's nothing left to do here but move on.");
						String confirm = scanner.nextLine();
					}

					//old loot
					else if (Rid.startsWith("t"))
					{
						System.out.println("You walk back into an old store room you looted. You look over a few piles, but nothing good left. Your only choice is to move on.");
						String confirm = scanner.nextLine();
					}

					//old library
					else if (Rid.startsWith("l"))
					{
						System.out.println("As much as you wished you could spend more time in here, you know staying too long in any magic place will probrably be detrimental to your health.");
						String confirm = scanner.nextLine();
					}

					//trader
					else if (Rid.startsWith("s"))
					{
						Main.goTrader();
					}


					//New room
					else
					{
						bosscount++;
						if (bosscount >= 12)
						{

						}


						rand = Math.random();
						if (rand <= .65)
						{
							Rid = "c" + Rid;
							//Roll the Monster Level
							if (Lvl == 1)
							{
								Oprob = 0.00;
								Tprob = 0.00;
							}
							else if (Lvl >= 2 && Lvl <= 4)
							{					
								Oprob = 0.25;
								Tprob = 0.00;
							}
							else if (Lvl >= 5 && Lvl <= 7)
							{
								Oprob = 0.5;
								Tprob = 0.2;
							}
							else if (Lvl >= 8)
							{
								Oprob = 0.83;
								Tprob = 0.33;
							}


							double spellClose = SpSuccess + Spclose;
							double spellRange = SpSuccess + Sprange;

							if (spell1.equals("Telekinetic Throw") || spell2.equals("Telekinetic Throw") || spell3.equals("Telekinetic Throw"))
							{
								throw1 = throwDmg + magicBuff;
							}
							else
							{
								throw1 = 0;
							}

							if (spell1.equals("Energy Spark") || spell2.equals("Energy Spark") || spell3.equals("Energy Spark"))
							{
								spark1 = sparkDmg + magicBuff;
							}
							else
							{
								spark1 = 0;
							}

							if (spell1.equals("Lightning Bolt") || spell2.equals("Lightning Bolt") || spell3.equals("Lightning Bolt"))
							{
								bolt1 = boltDmg + magicBuff;
							}
							else
							{
								bolt1 = 0;
							}

							if (spell1.equals("Flamethrower") || spell2.equals("Flamethrower") || spell3.equals("Flamethrower"))
							{
								fire1 = fireDmg + magicBuff;
							}
							else
							{
								fire1 = 0;
							}

							if (spell1.equals("Ice Storm") || spell2.equals("Ice Storm") || spell3.equals("Ice Storm"))
							{
								ice1 = iceDmg + magicBuff;
							}
							else
							{
								ice1 = 0;
							}

							if (spell1.equals("Earthquake") || spell2.equals("Earthquake") || spell3.equals("Earthquake"))
							{
								quake1 = quakeDmg + magicBuff;
							}
							else
							{
								quake1 = 0;
							}


							double rand3 = Math.random();
							if (rand3 <= Tprob)
							{
								//Killing a Troll
								double rand4 = Math.random();
								if (rand4 <= .33)
								{
									System.out.println("You deftly maneuver into the room and spot a hulking troll. It stumbles around to look at you, and you can see it reaching for it's club. You steel yourself as you prepare for a fight.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}
								else if (rand4 <= .66)
								{
									System.out.println("You don't know why the room's contents wasn't more obvious outside the door. The massive cave troll leaves a putrid stench in its wake that permeates through any door. As you enter, ready for a fight, the troll sees you and swings.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("You stealthly make your way inside and notice a cave troll sitting with it's back to you, apparently asleep. As you creep up behind to hopefully get in a sneak attack, the great beast jerks itself awake and turns to face you. Dang it, You'll have to fight it the old-fashioned way.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}


								//combat for troll
								
								Troll marcos = new Troll(1);
								health = marcos.trollCombat(health, melee, range, Mattack, Rattack, defence, backup, manuver, throw1, spark1, bolt1, fire1, ice1, quake1, spellClose, spellRange);

								int temp5 = marcos.XP(1);
								XP = XP + temp5;
								System.out.println("\nYou gained " + temp5 + " Xp from the troll and now have " + XP + " Xp.\n");
								
								//Leveling
								Main.levelUp();

								//loot
								System.out.println("With a painful groan, the troll finally collapses. You certainly are in a worse state, but at least your still alive. You stumble over to the troll's bleeding body to see if he had anything good on him.");

								int temp3 = marcos.monLoot();
								if (temp3 == 0)
								{
									System.out.println("Damn it all. The ugly brute had nothing. Looks like the big idiot was munching on runes before you walked in. Still, just being around healing magic is good for you, and you heal a little in the process.\n\n Hit 'Enter' to move on to the next room.");
									health = health + 2;
									String confirm = scanner.nextLine();
								}
								else if (temp3 == 1)
								{
									System.out.println("Well. It wasn't a total waste. You found some health potions in the things stah a few feet from his corpse. Well, better move on. \n\n Hit 'Enter' to move on to the next room.");
									pot = pot + 1;
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("Nice! The dumb brute was actually sitting on some good stuff. You found a small stash of health potions and runes in the corner, probrably from the trolls previous victims.\n\n Hit 'Enter' to move on to the next room.");
									Mhealth = Mhealth + 2;
									Hrune = Hrune + 1;
									pot = pot + 2;
									String confirm = scanner.nextLine();
								}
							}         		


							//Kill an Orc
							else if (rand3 <= Oprob)
							{
								double rand4 = Math.random();
								if (rand4 <= .33)
								{
									System.out.println("As you walk into the room, you spot an orc squatting in the corner. As soon as you see him, he jumps up and charges at you.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}
								else if (rand4 <= .66)
								{
									System.out.println("The second you move into the room, you smell him. As you peer into the darkness, you're not suprised to see an orc stumbling around in the center. Alright, let's get him.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("The door opens on a foul orc sharpening his weapons against the hewn stone walls. He's ready for a fight, and so are you.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}

								// combat    here       here       here       here
								
								Orc peter = new Orc(1);
								health = peter.orcCombat(health, melee, range, Mattack, Rattack, defence, backup, manuver, throw1, spark1, bolt1, fire1, ice1, quake1, spellClose, spellRange);

								int temp5 = peter.XP(1);
								XP = XP + temp5;
								System.out.println("\nYou gained " + temp5 + " Xp from the orc and now have " + XP + " Xp.\n");

								

								//Leveling
								Main.levelUp();


								//Loot
								System.out.println("It was a tough fight, but you got him in the end. Once you catch your breath, you go over the loot.");

								int temp3 = peter.monLoot();
								if (temp3 == 0)
								{
									System.out.println("Nothing on him. Tough luck, maybe you'll find something next time. \n\n Hit 'Enter' to move on to the next room.");
									String confirm = scanner.nextLine();
								}
								else if (temp3 == 1)
								{
									System.out.println("With a bit of rummaging, you manage to find a health potion tucked away in the orc's belt. Solid find. \n\n Hit 'Enter' to move on to the next room.");
									pot = pot + 1;
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("That orc was guarding some treasure! On top of a health potion in its vest, the idiot was using a health rune as a necklace. Exellent find.\n\n Hit 'Enter' to move on to the next room.");
									Mhealth = Mhealth + 2;
									Hrune = Hrune + 1;
									pot = pot + 1;
									String confirm = scanner.nextLine();
								}
									
								double lrand = Math.random();
								if (lrand <= .2 + (.05 * luck))
								{
									System.out.println("\n\n\n Ooh! You found some treasure as well! While it is of no direct use to you, I'm sure it's of value to somebody...");
									treasure = treasure + 1;
								}
							}
																				
							//everything else is Goblin
							else
							{
								double lrand = Math.random();
								if (lrand <= .2 + (.05 * luck))
								{
									System.out.println("\n\n\n Ooh! You found some treasure as well! While it is of no direct use to you, I'm sure it's of value to somebody...");
								treasure = treasure + 1;
								}
								double rand4 = Math.random();
								// Enter the room sound
								if (rand4 <= .33)
								{
									System.out.println("You peer into the room and, Eek! There's a goblin in here. Kill it! Kill it!\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}
								else if (rand4 <= .66)
								{
									System.out.println("You press onwards into the room and, Ugh, another goblin. Better get rid of it quickly.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("As you enter the room, a goblin leaps out from behind a dilapitated crate. It won't leave without a fight.\n");
									System.out.println("Press 'Enter' to start the fight.");
									String confirm = scanner.nextLine();
								}

								// combat run         here        here      here

								Goblin james = new Goblin(1);
								health = james.goblinCombat(health, melee, range, Mattack, Rattack, defence, backup, manuver, throw1, spark1, bolt1, fire1, ice1, quake1, spellClose, spellRange);

								int temp5 = james.XP(1);
								XP = XP + temp5;
								System.out.println("\nYou gained " + temp5 + " Xp from the goblin and now have " + XP + " Xp.\n");

								//Leveling
								Main.levelUp();


								//loot
								System.out.println("Congrats! You slew that discusting little goblin. Quick, loot his corpse. Maybe he had something good?");
								int temp3 = james.monLoot();
								if (temp3 == 0)
								{
									System.out.println("Sorry, the little blighter had nothing on him. Better luck next time. \n\n Hit 'Enter' to move on to the 	next room.");
									String confirm = scanner.nextLine();
								}
								else if (temp3 == 1)
								{
									System.out.println("A potion! Nice find. I'm sure that will come in handy at one point or another. \n\n Hit 'Enter' to move on to the next room.");
									pot = pot + 1;
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("Score! Not only did that little thing have a potion, but it had a health rune too! Clip it on your belt and see how it effects your stats.\n\n Hit 'Enter' to move on to the next room.");
									Mhealth = Mhealth + 2;
									Hrune = Hrune + 1;
									pot = pot + 1;
									String confirm = scanner.nextLine();
								}
								lrand = Math.random();
								if (lrand <= .2 + (.05 * luck))
								{
									System.out.println("\n\n\n Ooh! You found some treasure as well! While it is of no direct use to you, I'm sure it's of value to somebody...");
									treasure = treasure + 1;
								} 
							}
						}



						//End room combat
								
						//Loot room and you find health
						else if (rand <= .80)
						{
							Rid = "t" + Rid;
							System.out.print("\033[H\033[2J");
							System.out.flush();

							System.out.println(" \n\nYou walk into a slightly less dingy room with supplie crates lined up agains the wall. After a breif inspection for monsters, you begin to loot the supplies.\n\n");
							double lran1 = Math.random();
							if (lran1 <= .5)
							{
								System.out.println("After restocking of food and other staple items, you open a slightly more protected chest and find a pristine health rune on a silver chain. After putting the other supplies away, with a small health potion to boot, you tie the rune to your belt and feel your life revitalizing.\n\n Hit 'Enter' to move on to the next room.");

								Mhealth = Mhealth + 3;
								health = Mhealth;
								Hrune = Hrune + 1;
								pot = pot + 1;
								String confirm = scanner.nextLine();
							}
							//you find a sword
							else if (lran1 <= .75)
							{
								System.out.print("You sort through the forgotten stores and come across a medium sized ornate box. The sides are made of metal, not wood, and are obviously of high quality. You crack open the lid and find ");
								if (melee == 0)
								{
									System.out.println("a well preserved long sword. The edges are a bit dull, but you can still swing it. It's an exellent find since you have no melee weapon of your own, but the edges could use some sharpening.\n\n Hit 'Enter' to move on to the next room.");
									melee = 2;
									String confirm = scanner.nextLine();
								}
								else if (melee <= 4)
								{
									System.out.println("a set of tools. Apon further inspection, you discover the strange objects are sharpening tools for weapons and immediatly use them on your sword. The set consists of a high quality whet stones and a carved rune of refining that is set to hone the edge of any weapon. By the time you're done, your sword gleams and its edge is far sharper.\n\n Hit 'Enter' to move on to the next room.");
									melee = melee + 1;
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("a small set of runes. When you look at them closer, you realise they are magical damage runes built for weapons. You are obviously overjoyed, and immediatly set to work installing them into your sword. In the end, you hold a powerful, glowing sword of destruction, and you couldn't be happier.\n\n Hit 'Enter' to move on to the next room.");
									melee = melee + 1;
									String confirm = scanner.nextLine();
								}
							}
							//you find a bow
							else
							{
								System.out.print("Looking through the rubbage you find a large wooden case. It is obviously of elven design, as there is no way a wood box of such elegance wouldn't have decayed if it was made by human hands. With mild trepidation, the elves were a crafty folk after all, you open the box to find ");
								if (range == 0)
								{
									System.out.println("an old iron crossbow. As you pull it out and test it, you are shocked to find it in almost perfect working order. Sure the pully is a bit rusty, and the body creaks when you draw the string back, but it is in impressivly good repair for being left in a box underground for god knows how long. You decide to keep it, as a ranged weapon is almost always useful. \n\n Hit 'Enter' to move on to the next room.");
									range = 2;
									String confirm = scanner.nextLine();
								}
								else if (range <= 5)
								{
									System.out.println("a high quality bow repair kit. the tools are top notch and it even comes with some oil to rub into the wood. You spend some time repairing, cleaning, and upgrading your bow until it shines with quality. \n\n Hit 'Enter' to move on to the next room.");
									range = range + 1;
									String confirm = scanner.nextLine();
								}
								else
								{
									System.out.println("a large wooden rune lying on the floor of the container. At first your confused, but then your eyes light up in joy as you recognise it as a magical damage rune designed for ranged weapons. It takes some work, but after a few hours, you have the spell fitted to your bow. As you knock back an arrow, you can hear the crackle of magic energy, and know you hold a powerful weapon in your hands now. \n\n Hit 'Enter' to move on to the next room.");
									range = range + 1;
									String confirm = scanner.nextLine();
								}          
							}
							double lrand1 = Math.random();
							if (lrand1 <= .2 + (.05 * luck))
							{
								System.out.println("\n\n\n Ooh! You found some treasure as well! While it is of no direct use to you, I'm sure it's of value to somebody...");
								treasure = treasure + 1;
							}
						}


						// Find a Library
						else if (rand <= .90)
						{
							Rid = "l" + Rid;
							System.out.print("\033[H\033[2J");
							System.out.flush();

							System.out.println("\nYou open the door and slowly move down the corridor in search of any dangers that await you. While you walk, you spot a grandly carved side door that looks like it hasn't been opened in years. You open the door and find...\nA Library!\n\nYou quickly move inside and shut the door to explore this trove of information. You can read (obviously) but some of the topics here are a bit beyond you. Plus, you can't stay here forever. This is obviously a magic library, and whoever owns the place probrably will notice if you dally here to long. With limited time, You have to choice what to look at.\n");

							System.out.println("You can:\n\n1 - Try to learn a new spell\n\n2 - Do further research into a spell you already know\n\n3 - Study basic combat magic theory\n\n4 - Leave\n\n");

							int Litemp = scanner.nextInt();


							//learn new spells
							if (Litemp == 1)
							{
								System.out.println("You can learn:\n");
								if (intel >= 5 && throwDmg == 0)
								{
									System.out.println(" 1 - Telekinetic Throw (2 damage at range)");
								}
								else if (intel < 5 && throwDmg == 0)
								{
									System.out.println("You can't learn Telekinetic Throw");
								}
								else
								{
									System.out.println("You already know Telekinetic Throw");
								}

								if (intel >= 5 && sparkDmg == 0)
								{
									System.out.println(" 2 - Energy Spark (4 damage up close)");
								}
								else if (intel < 5 && sparkDmg == 0)
								{
									System.out.println("You can't learn Energy Spark");
								}
								else
								{
									System.out.println("You already know Energy Spark");
								}

								if (intel >= 8 && boltDmg == 0)
								{
									System.out.println(" 3 - Lightning Bolt (5 damage at range");
								}
								else if (intel < 8 && boltDmg == 0)
								{
									System.out.println("You can't learn Lightning Bolt");
								}
								else
								{
									System.out.println("You already know Lightning Bolt");
								}

								if (intel >= 8 && fireDmg == 0)
								{
									System.out.println(" 4 - Flamethrower (7 damage up close");
								}
								else if (intel < 8 && fireDmg == 0)
								{
									System.out.println("You can't learn Flamethrower");
								}
								else
								{
									System.out.println("You already know Flamethrower");
								}

								if (intel >= 10 && iceDmg == 0)
								{
									System.out.println(" 5 - Ice Storm (4 damage at range + slowing effects)");
								}
								else if (intel < 10 && iceDmg == 0)
								{
									System.out.println("You can't learn Ice Storm");
								}
								else
								{
									System.out.println("You already know Ice Storm");
								}

								if (intel >= 10 && quakeDmg == 0)
								{
									System.out.println(" 6 - Earthquake (6 damage up close + satggering effects)");
								}
								else if (intel < 10 && quakeDmg == 0)
								{
									System.out.println("You can't learn Earthquake");
								}
								else
								{
									System.out.println("You already know Earthquake");
								}

								System.out.println("Type the number of the option you want, or '7' to leave the library.");

								int Litemp2 = scanner.nextInt();

								if (Litemp2 == 1 && (intel >= 5 && throwDmg == 0))
								{
									System.out.println("After a couple hours of studying and pouring through tomes, you finally get the hang of it and dang, telekinetics is fun. You throw a few books back and fourth across the room to make sure before you eventually leave.\n\nYou've learned Telekinteic Throw! You can now use it in combat and perfect it in a later library.");
									throwDmg = 2;
								}
								else if (Litemp2 == 2 && (intel >= 5 && sparkDmg == 0))
								{
									System.out.println("It takes you a few hours, but in the end, you get pretty good at channeling electricity from hand to hand. You replace the books you read and make your way out of the library back into the dungeon. \n\nYou've learned Energy Spark! You can now use it in combat and perfect it in a later library.");
									sparkDmg = 4;
								}
								else if (Litemp2 == 3 && (intel >= 8 && boltDmg == 0))
								{
									System.out.println("It was a long and difficult time, but eventully you can feel the power flowing through your veins. You aim at a torch bracket, and push the energy out, causing a fork of lightning to bolt out from your fingertips and hit the torch bracket with a crash. Satisfied, you make your way out of the library to test out your newfound powers on a real target.\n\nYou've learned Lightning Bolt! You can now use it in combat and perfect it in a later library.");
									boltDmg = 5;
								}
								else if (Litemp2 == 4 && (intel >= 8 && fireDmg == 0))
								{
									System.out.println("After almost accidentally burning down the library and a couple of painful sores, you finally got the hang of using and throwing fire. You make the mental command, and suddenly flames roll of your fingers in a mesmerizing dance. It doesn't hurt you, but that doesn't mean it won't hurt someone else. You douse the flames and quickly leave the library, you've been here long enough and are eager to test you new skills.\n\nYou've learned Flamethrower! You can now use it in combat and perfect it in a later library.");
									fireDmg = 7;
								}
								else if (Litemp2 == 5 && (intel >= 10 && iceDmg == 0))
								{
									System.out.println("Nearly 5 hours later, you are sitting and a small ring of frost and snow, but finnaly have the Ice Storm spell under your control. You might have contracted hypothermia, but it was well worth it to be able to call freezing hail and ice whenever you want to make a monsters day worse. You get up, rub your hands together, and move on to the rest of the dungeon. Beside, you needed to warm up anyway.\n\nYou've learned Ice Storm! You can now use it in combat and perfect it in a later library.");
									iceDmg = 4;
								}
								else if (Litemp2 == 6 && (intel >= 10 && quakeDmg == 0))
								{
									System.out.println("Stone books are always hard to read, and when the pages are ultra-thin granite, you have to worry about breaking the precious tomes. Still, you eventually come out on top. With a complicated hand flick, you can feel the ground tremble beneath you. 'This', you say to yourself, 'is going to be fun to watch.' You make your way to the front of the library and out into the hall you started in. It's time to harass some monsters.\n\nYou've learned Earthquake! You can now use it in combat and perfect it in a later library.");
									quakeDmg = 6;
								}
								else if (Litemp2 == 7)
								{
									System.out.println("You make your way out of the library.");
								}										
							}

							//Upgrade spells
							else if (Litemp == 2)
							{
								System.out.println("After looking through some more advanced books, you find a place where you can improve your spells power.\n\nSpells avalible to upgrade:\n");

								if ((intel >= 6 && throwDmg == 2) || (intel >= 8 && throwDmg == 3))
								{
									System.out.println(" 1 - You can upgrade Telekinetic Throw.");
								}
								else if (throwDmg >= 4)
								{
									System.out.println("You already maxed out Telekinetic Throw!");
								}
								else
								{
									System.out.println("You can't upgrade Telekinetic Throw.");
								}

								if ((intel >= 6 && sparkDmg == 4) || (intel >= 8 && sparkDmg == 5))
								{
									System.out.println(" 2 - You can upgrade Energy Spark.");
								}
								else if (sparkDmg >= 4)
								{
									System.out.println("You already maxed out Energy Spark!");
								}
								else
								{
									System.out.println("You can't upgrade Energy Spark.");
								}

								if ((intel >= 9 && boltDmg == 5) || (intel >= 11 && boltDmg == 6))
								{
									System.out.println(" 3 - You can upgrade Lightning Bolt.");
								}
								else if (boltDmg >= 7)
								{
									System.out.println("You already maxed out Lightning Bolt!");
								}
								else
								{
									System.out.println("You can't upgrade Lightning Bolt.");
								}

								if ((intel >= 9 && fireDmg == 7) || (intel >= 11 && fireDmg == 8))
								{
									System.out.println(" 4 - You can upgrade Flamethrower.");
								}
								else if (fireDmg >= 9)
								{
									System.out.println("You already maxed out Flamethrower!");
								}
								else
								{
									System.out.println("You can't upgrade Flamethrower.");
								}

								if ((intel >= 12 && iceDmg == 4) || (intel >= 14 && iceDmg == 5))
								{
									System.out.println(" 5 - You can upgrade Ice Storm.");
								}
								else if (iceDmg >= 6)
								{
									System.out.println("You already maxed out Ice Storm!");
								}
								else
								{
									System.out.println("You can't upgrade Ice Storm.");
								}

								if ((intel >= 12 && quakeDmg == 6) || (intel >= 14 && quakeDmg == 7))
								{
									System.out.println(" 6 - You can upgrade Earthquake.");
								}
								else if (quakeDmg >= 8)
								{
									System.out.println("You already maxed out Earthquake!");
								}
								else
								{
									System.out.println("You can't upgrade Earthquake.");
								}

								System.out.println("Type the number of the spell you wish to study and improve, or type '7' to leave the library.\n");

								int Litemp2 = scanner.nextInt();

								if (Litemp2 == 1 && (intel >= 6 && throwDmg == 2) || (intel >= 8 && throwDmg == 3))
								{
									System.out.println("You spend the next few hours lifting larger and larger loads with telekinesis while testing out new enhancment charms. In the end, you can move bigger things, faster. You juggle a couple big rock just because you can, then pack up your stuff and make your way out of the library.\n\nYou've improved your skills and now Telekinetic Throw deals more damage.");
									throwDmg++;
								}
								else if (Litemp2 == 2 && (intel >= 6 && sparkDmg == 4) || (intel >= 8 && sparkDmg == 5))
								{
									System.out.println("While electricity is a powerful force, you take the time to tame it. Some of these books are really helpful, offering tricks and movments that help channel the shock from your hands to anybody nearby. You spend a few hours practicing and learning new strategies. By the time your done, you can roll lightning between your fingers like a coin made from 2,000 volts of energy.\n\nYou've improved your skills and now Energy Spark deals more damage.");
									sparkDmg++;
								}
								else if (Litemp2 == 3 && (intel >= 9 && boltDmg == 5) || (intel >= 11 && boltDmg == 6))
								{
									System.out.println("It seems ancient wizards were slightly obsessed with controlling lightning, so there certainly wasn't a lack of text to base your advancements. You get to work, and after about 4 hours, are far better at calling the elements from even the farthest spot. You generate bolts arcing from the celing and far walls before your satisfyed.\n\nYou've improved your skills and now Lightning Bolt deals more damage.");
									boltDmg++;
								}
								else if (Litemp2 == 4 && (intel >= 9 && fireDmg == 7) || (intel >= 11 && fireDmg == 8))
								{
									System.out.println("You make your way to a slightly burn looking section of the library and peruse the tomes on fire. 'Conflaguration, an Art' and 'Brain Burning for Dummies' are the two you pull out and read. While the titles might lack tact, the contents are supreme and you quickly refine your flames to burn brighter and hotter. After returning the books, you make your way back outside to test your improved fire.\n\nYou've improved your skills and now Flamethrower deals more damage.");
									fireDmg++;
								}	
								else if (Litemp2 == 5 && (intel >= 12 && iceDmg == 4) || (intel >= 14 && iceDmg == 5))
								{
									System.out.println("Advanced ice magic is stored in great frost bound books made from hairy blue leather you don't want to know the origins of. Nevertheless, you plunge into them to uncover there chilly secrets. It takes quite a bit to amplify your power, but when the reward is a small hurricane of ice and frost, the time is worth it.\n\nYou've improved your skills and now Ice Storm deals more damage.");
									iceDmg++;
								}
								else if (Litemp2 == 6 && (intel >= 12 && quakeDmg == 6) || (intel >= 14 && quakeDmg == 7))
								{
									System.out.println("You pour through more earthen tomes and anceint velum books, looking for the secrets of the earth that let you manipulate it so. You spent so much time improving your spell-work, you hear a door slam as the owner of the library returns. You quickly get up and sneak off to the front door, not daring to try and catch a glance of the owner. while the close call was less than ideal, you're heart still soars thinking of the knowlage you amde of with.\n\nYou've improved your skills and now Earthquake deals more damage.");
									quakeDmg++;
								}
								else if (Litemp == 7)
								{
									System.out.println("You make your way back to the front entrance and leave.");
								}
							}

							//Refine magic fundimentals
							else if (Litemp == 3)
							{
								System.out.println("You walk down to the theory section, and look at the volumes on combat magic. Some of these books promise increased skills and accuracy for your spells, but they seem to be broken into two major groups, close range spell-casting, and long range spell-casting. Which do you choose?");

								if (intel >= 6 && Spclose < .4)
								{
									System.out.println(" 1 - Learn close range combat");
								}
								else if (Spclose >= .4)
								{
									System.out.println("You have already learned as much as possible about close range combat!");
								}
								else
								{
									System.out.println("You need more inteligence to improve your close range combat.");						
								}

								if (intel >= 6 && Sprange < .4)
								{
									System.out.println(" 2 - Learn long range combat");
								}
								else if (Sprange >= .4)
								{
									System.out.println("You have already learned as much as possible about long range combat!");
								}
								else
								{
									System.out.println("You need more intelligence to improve your long range combat.");						
								}

								System.out.println("Type the number of the choice you want, or type '3' to leave the library.\n\n");

								int Litemp2 = scanner.nextInt();

								if (Litemp == 1 && (intel >= 6 && Spclose < .4))
								{
									System.out.println("Spells are complex things, and it only makes casting harder when someone is swinging a sword at you. However, there are some things you can do you speed up cast time and streamline the proccess. This is what you study for the next 4 hours. You pull book after book of the shelves, and eventually see improvements in your performance. \n\nYou have improved your spellcasting, and now are more consistant in close range combat.");
									Spclose += .05;
								}

								else if (Litemp == 2 && (intel >= 6 && Sprange < .4))
								{
									System.out.println("'The Art of Magic can only be condenced so much, but here we shall show you how...' begins the third tome you open. You have been working for hours now, and are just now starting to actually improve your skills. You train for precision and run dozens of casting drills, but eventually you can feel your magic strengthing. \n\nYou have improved your spellcasting, and now are more consistant in long range combat.");
									Sprange += .05;
								}
							}
							System.out.println("\n\nAs you leave the ancient room, you take a look at the door, but are shocked to find the entrance gone. You won't be returning to this exact library again, but maybe you'll chance apon another one in your travels.\n\nHit enter to move on to the next door.");

							String confirm = scanner.nextLine();
						}
						
						//Trader
						else
						{
							Rid = "s" + Rid;
							Main.goTrader();
						}	

						//insert the Rid into the Map
						if (Rid.endsWith("01"))
						{
							r01 = Rid;
						}
						if (Rid.endsWith("02"))
						{
							r02 = Rid;
						}
						if (Rid.endsWith("03"))
						{
							r03 = Rid;
						}
						if (Rid.endsWith("04"))
						{
							r04 = Rid;
						}
						if (Rid.endsWith("05"))
						{
							r05 = Rid;
						}
						if (Rid.endsWith("10"))
						{
							r10 = Rid;
						}
						if (Rid.endsWith("11"))
						{
							r11 = Rid;
						}
						if (Rid.endsWith("12"))
						{
							r12 = Rid;
						}
						if (Rid.endsWith("13"))
						{
							r13 = Rid;
						}
						if (Rid.endsWith("14"))
						{
							r14 = Rid;
						}
						if (Rid.endsWith("15"))
						{
							r15 = Rid;
						}
						if (Rid.endsWith("20"))
						{
							r20 = Rid;
						}
						if (Rid.endsWith("21"))
						{
							r21 = Rid;
						}
						if (Rid.endsWith("22"))
						{
							r22 = Rid;
						}
						if (Rid.endsWith("23"))
						{
							r23 = Rid;
						}
						if (Rid.endsWith("24"))
						{
							r24 = Rid;
						}
						if (Rid.endsWith("25"))
						{
							r25 = Rid;
						}
						if (Rid.endsWith("30"))
						{
							r30 = Rid;
						}
						if (Rid.endsWith("31"))
						{
							r31 = Rid;
						}
						if (Rid.endsWith("32"))
						{
							r32 = Rid;
						}
						if (Rid.endsWith("33"))
						{
							r33 = Rid;
						}
						if (Rid.endsWith("34"))
						{
							r34 = Rid;
						}
						if (Rid.endsWith("35"))
						{
							r35 = Rid;
						}
						if (Rid.endsWith("40"))
						{
							r40 = Rid;
						}
						if (Rid.endsWith("41"))
						{
							r41 = Rid;
						}
						if (Rid.endsWith("42"))
						{
							r42 = Rid;
						}
						if (Rid.endsWith("43"))
						{
							r43 = Rid;
						}
						if (Rid.endsWith("44"))
						{
							r44 = Rid;
						}
						if (Rid.endsWith("45"))
						{
							r45 = Rid;
						}
						if (Rid.endsWith("50"))
						{
							r50 = Rid;
						}
						if (Rid.endsWith("51"))
						{
							r51 = Rid;
						}
						if (Rid.endsWith("52"))
						{
							r52 = Rid;
						}
						if (Rid.endsWith("53"))
						{
							r53 = Rid;
						}
						if (Rid.endsWith("54"))
						{
							r54 = Rid;
						}
						if (Rid.endsWith("55"))
						{
							r55 = Rid;
						}
					}
				}
				else
				{
					j--;
				}
			}      
    }		
  }
}