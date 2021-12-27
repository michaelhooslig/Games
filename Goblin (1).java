import java.util.Scanner;
public class Goblin
{
	Scanner scanner = new Scanner(System.in);
	//Monster Stats
  private int monHealth; 
  private int monDmg = 2;
	private double monAttack = .35;
  private double monDefence;
	private double slowness;
	
	//Player Stats
	private int melee;
  private int health;
  private int range;
	private int difficulty;
	private int throwDmg;
	private int sparkDmg;
	private int boltDmg;
	private int fireDmg;
	private int iceDmg;
	private int quakeDmg;
	private double dodge;
	private double defence;
	private double Mattack;
  private double Rattack;
	private double manuver;
	private double backup;
	private double Spclose;
	private double Sprange;
  private boolean space = true;
  private boolean work1 = true;
  private boolean stun = false;
	


	//Combat Methods
	public Goblin(int hardness)
	{
		difficulty = hardness;
		monHealth = ((int)(Math.random()*3)+6) * difficulty;
	}

	//monster attacks
  public int monAttack (int Php)
  {
    Php = Php - monDmg;
    return Php;
  }

	//monster is hurt
  public void monIsHit (int Pdmg)
  {
    monHealth = monHealth - Pdmg;
    if (health < 0)
    {
      monHealth = 0;
    }
  }

	//cripples the monster
	public void cripple ()
  {
    monDefence = monDefence - .15;
    monAttack = monAttack - .1;
		slowness = slowness + .15;
  }

	//return Hp
  public int getHP()
  {
    return monHealth;
  }

	//return accuracy
	public double getAttack()
  {
    return monAttack;
  }

	//return melee damage
  public int getDmg()
  {
    return monDmg;
  }

	//return dodge
	public double getDodge()
  {
    return monDefence;
  }

	//Looting
  public int monLoot()
  {
    double rand1 = Math.random();
    if (rand1 <= .6)
    {
      return 0;
    }
    else if (rand1 <= .8)
    {
      return 1;
    }
    else
    {
      return 2;
    }

  }

	//Collects Xp
	public int XP(int levelBuff)
	{
		return 5 * (int)(difficulty * levelBuff * 1.5);
	}




	// combat loop starts      here        here          here          here    

	public int goblinCombat(int Php, int PmeleeDmg, int PrangeDmg, double PmeleeAtt, double PrangeAtt, double dex, double back, double man, int throw1, int spark, int bolt, int fire, int ice, int quake, double cspell, double rspell)
	{
		health = Php;
		melee = PmeleeDmg;
		range = PrangeDmg;
		Mattack = PmeleeAtt;
		Rattack = PrangeAtt;
		dodge = dex;
		manuver = man;
		backup = back;
		throwDmg = throw1;
		sparkDmg = spark;
		boltDmg = bolt;
		fireDmg = fire;
		iceDmg = ice;
		quakeDmg = quake;
		Spclose = cspell;
		Sprange = rspell;

		if (true)
    {
			System.out.print("\033[H\033[2J");
    	System.out.flush();		

      System.out.println("Your stats: \n Melee damage is " + melee + "\n Health is " + health + "\n Ranged damage is " + range + "\n ");
      
			//Combat here
      while (monHealth > 0)
      {
				monDefence = .25;
				slowness -= .3;
				if (slowness < 0)
				{
					slowness = 0;
				}
				
        System.out.println("\n Goblin stats: Goblin has " + monHealth + " Hit Points left and deals " + monDmg + " every attack.\n");
      
				stun = false;
				defence = dodge;

        if (space == true)
        {
          System.out.println("You are currently at range from the enemy.\n\n\nType 'a' to shoot at it's arm and cripple it\nType 'b' to go for a body shot\nType 'c' to charge in and attack\n");
          work1 = true;
					System.out.println("Spells avalible:\n");
					if (throwDmg > 0)
					{
						System.out.println("For Telekinetic Throw ( " + throwDmg + " Damage ), Type 't'");
					}
					if (boltDmg > 0)
					{
						System.out.println("For Lightning Bolt ( " + boltDmg + " Damage ), Type 'l'");
					}
					if (iceDmg > 0)
					{
						System.out.println("For Ice Storm ( " + boltDmg + " Damage and a slowing effect), Type 'i'");
					}
					if (throwDmg == 0 && boltDmg == 0 && iceDmg == 0)
					{
						System.out.println("You don't have any spells equipped!\n\n");
					}

        }
        else if(space == false)
        {
          System.out.println("You are currently in close quarters combat with the enemy.\n\n\nType 'j' to hit attack him with a jab\nType 's' to take a swing at the little blighter\nType 'k' to attempt to kick it back and get some room.");
          work1 = false;
					System.out.println("Spells avalible:\n");
					if (sparkDmg > 0)
					{
						System.out.println(" For Energy Spark ( " + sparkDmg + " Damage ), Type 'e'");
					}
					if (fireDmg > 0)
					{
						System.out.println(" For Flamethrower ( " + fireDmg + " Damage ), Type 'f'");
					}
					if (quakeDmg > 0)
					{
						System.out.println("For Earthquake ( " + quakeDmg + " Damage and a stumbling effect), Type 'q'");
					}
					if (sparkDmg == 0 && fireDmg == 0 && quakeDmg == 0)
					{
						System.out.println("You don't have any spells equipped!\n\n");
					}
        }
        String Fchoice = scanner.nextLine();


        //Jab
        if (Fchoice.equals("j") && space == false)
        {
          if (melee > 1)
          {
            double rand = Math.random();
            if (rand + Mattack + .6 - getDodge() >= 1.00)
            {
              monIsHit(melee - 1);
              System.out.println("\n\nYou circle for a bit and eventually nail it with a quick jab.");
							defence = defence + .25;
            }
            else
            {
              System.out.println("\n\nAfter circling for a bit, you lash out, but miss your target.");
							defence = defence + .2;
            }
          }
          else
          {
            System.out.println("\n\nYou can't attack him like that!");
          }
          
        }

        //Swipe
        if (Fchoice.equals("s")  && space == false)
        {
          if (melee != 0)
          {
            double rand = Math.random();
            if (rand + Mattack + .5 - getDodge() >= 1.00)
            {
            	monIsHit(melee);
              System.out.println("\n\nHit witha swipe.");
            }
            else
            {
              System.out.println("\n\nSwipe and a miss.");
            }
          }
          else
          {
            System.out.println("\n\nYou can't use the swipe attack!");
          }                
        }

        //charge
        if (Fchoice.equals("c") && space == true)
        {
          if (melee != 0)
          {
            double rand = Math.random();
            if (rand + manuver + .7 - getDodge() >= 1.00)
            {
              monIsHit(melee + 1);
              System.out.println("\n\nYou charge it and hit.");
              space = false;
              work1 = false;
            }
            else
            {
              System.out.println("\n\nYou try to charge and hit the creature but miss.");
              space = false;
							defence = defence - .1;
            }
          }
          else
          {
            System.out.println("\n\nYou can't charge without a melee weapon!");
          }
          
        }

        //Cripple
        if (Fchoice.equals("a") && space == true)
        {
          if(range != 0)
          {
            double rand = Math.random();
            if (rand + Rattack + .35 - getDodge() >= 1.00)
            {
              monIsHit(range - 1);
              System.out.println("\n\nGreat shot! he's having a hard time fighting back now!");
              cripple();
            }
            else
            {
              System.out.println("\n\nYou miss it's legs!");
            }
          }
          else
          {
            System.out.println("\n\nYou have no ranged weapon!");
          }
        }

        //Body Shot
        if (Fchoice.equals("b") && space == true)
        {
          if(range != 0)
          {
            double rand = Math.random();
            if (rand + Rattack + .5 - getDodge() >= 1.00)
            {
              monIsHit(range);
              System.out.println("\n\nGreat body shot!");
            }
            else
            {
              System.out.println("\n\nYou miss his body!");
            }
          }
          else
          {
            System.out.println("\n\nYou have no ranged weapon!");
          }
        }

        //Kick back
        if (Fchoice.equals("k") && space == false)
        {                  
          double rand = Math.random();
          if (rand + manuver + .7 - getDodge() >= 1.00)
           {
            System.out.println("\n\nYou lean in and kick the little beast back so you get some room to breath.");
            space = true;
            work1 = true;
            stun = true;
           }
           else
          {
            System.out.println("\n\nYou try and fail to punt the goblin back.");
          }
        }                     
       

				//Throw
				if (Fchoice.equals("t") && space == true && throwDmg > 0)
				{
					double rand = Math.random();
					if (rand + Sprange + .6 - getDodge() >= 1.00)
					{
						System.out.println("\n\nYou accelerate a few rocks into the goblins form and nock him back a bit.");
						slowness += .1;
						monIsHit(throwDmg);
					}
					else
					{
						System.out.println("\n\nYou send some rocks at the goblin, but he manages to side step them.");
					}
				}

				//Bolt
				if (Fchoice.equals("l") && space == true && boltDmg > 0)
				{
					double rand = Math.random();
					if (rand + Sprange + .7 - getDodge() >= 1.00)
					{
						System.out.println("\n\nThe smell of charred flesh permeates the air as the lightning bolt lands.");
						monIsHit(boltDmg);
					}
					else
					{
						System.out.println("\n\nThe thunderbolt arcs off the stones near the goblin, but doesn't hurt him.");
					}
				}

				//Ice Storm
				if (Fchoice.equals("i") && space == true && iceDmg > 0)
				{
					double rand = Math.random();
					if (rand + Sprange + .7 - getDodge() >= 1.00)
					{
						System.out.println("\n\nThe temptarture drops as the goblin is bombarded with blinding waves of ice and hail. after the attack finishes, you can still see the bugger frozen to the floor.");
						monIsHit(iceDmg);
						slowness += .4;
					}
					else
					{
						System.out.println("\n\nstorms take a couple seconds to summon, and in that time, the goblin managed to get out of the way.");
					}
				}

				//Spark
				if (Fchoice.equals("e") && space == false && sparkDmg > 0)
				{
					double rand = Math.random();
					if (rand + Spclose + .6 - getDodge() >= 1.00)
					{
						System.out.println("\n\nWith a jolt, the goblin jumps back as an arc of electricity connects with his arm.");
						monIsHit(sparkDmg);
					}
					else
					{
						System.out.println("\n\nWithout a target, electricity can't make an arc, and you only produce sparks with the goblin out of range.");
					}
				}

				//fire
				if (Fchoice.equals("f") && space == false && fireDmg > 0)
				{
					double rand = Math.random();
					if (rand + Spclose + .7 - getDodge() >= 1.00)
					{
						System.out.println("\n\nImolate is a fancy word, and now, I think that goblin knows what it means.");
						monIsHit(fireDmg);
						monDefence -= .1;
					}
					else
					{
						System.out.println("\n\nThe goblin barely manages to get away from the inferno before it consumes him.");
					}
				}

				//earthquake
				if (Fchoice.equals("q") && space == false && quakeDmg > 0)
				{
					double rand = Math.random();
					if (rand + Spclose + .7 - getDodge() >= 1.00)
					{
						System.out.println("\n\nThe ground splits as you make the earth tremble, and the monster in the epicenter isn't having a good time.");
						monIsHit(quakeDmg);
						monDefence -= .25;
					}
					else
					{
						System.out.println("\n\nWith suprising agility, the little bugger jumps out of the dangerzone and makes it to safe ground. Dang it.");
					}
				}

				System.out.println("\n\n\nYou wait for an attack.\n");

        //Player is hit
        double rand = Math.random();
        if (rand + defence - getAttack() <= 1.00 && work1 == false)
        {                
          System.out.println("Ouch, he scored a hit!");

          health = monAttack(health);

          System.out.println("\nYou have " + health + " health left\n");
        }
        else if (stun == true)
        {
          System.out.println("The goblin is too busiy getting up to attack you.");
        }
        else if (work1 == true)
        {
          System.out.print("The goblin is too far to attack you ");
          rand = Math.random();
          if (rand + .8 - (slowness + backup) >= 1.00)
          {
            System.out.println("but manages to catch up to you while trying.");
            space = false;
          }
          else
          {
            System.out.println(" and trips in the attempt. You take the opprotunity to back up a bit more.");
          }
        }
        else 
        {
          System.out.println("Nice, you dodged him!");

          System.out.println("You have " + health + " health left\n");
        }

        //Health check
        if (health <= 0)
        {
          System.out.println("You died! Too bad.");
          System.exit(0);
        }

        System.out.println("\n\nPress 'Enter' to go at him again.");
        String confirm = scanner.nextLine();


        System.out.println("\n\n         ////////////////////////////////////////////////////////////\n\n");
      }      
      System.out.println("\n \n \nYou killed the beast! Great job.");
    }
		return health;
  }

  public String toString()
  {
    return "Goblin has " + monHealth + " Hit Points left and deals " + monDmg + " every attack.";
  }
}