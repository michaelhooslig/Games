import java.util.Scanner;
public class Map 
{
	Scanner scanner = new Scanner(System.in);

	public static String r01 = "";
	public static String r02 = "";
	public static String r03 = "";
	public static String r04 = "";
	public static String r05 = "";
	public static String r10 = "";
	public static String r11 = "";
	public static String r12 = "";
	public static String r13 = "";
	public static String r14 = "";
	public static String r15 = "";
	public static String r20 = "";
	public static String r21 = "";
	public static String r22 = "";
	public static String r23 = "";
	public static String r24 = "";
	public static String r25 = "";
	public static String r30 = "";
	public static String r31 = "";
	public static String r32 = "";
	public static String r33 = "";
	public static String r34 = "";
	public static String r35 = "";
	public static String r40 = "";
	public static String r41 = "";
	public static String r42 = "";
	public static String r43 = "";
	public static String r44 = "";
	public static String r45 = "";
	public static String r50 = "";
	public static String r51 = "";
	public static String r52 = "";
	public static String r53 = "";
	public static String r54 = "";
	public static String r55 = "";
	public static int roomcount = 0;

	//Constructor
	public Map()
	{}

	//Make new Map
	public void makeMap()
	{
		while (roomcount <= 12 || roomcount >= 26)
		{
			r01 = "--";
			r02 = "--";
			r03 = "--";
			r04 = "--";	
			r05 = "--";
			r10 = "--";
			r11 = "--";
			r12 = "--";
			r13 = "--";
			r14 = "--";
			r15 = "--";
			r20 = "--";
			r21 = "--";
			r22 = "--";
			r23 = "--";
			r24 = "--";
			r25 = "--";
			r30 = "--";
			r31 = "--";
			r32 = "--";
			r33 = "--";
			r34 = "--";
			r35 = "--";
			r40 = "--";
			r41 = "--";
			r42 = "--";
			r43 = "--";
			r44 = "--";
			r45 = "--";
			r50 = "--";
			r51 = "--";
			r52 = "--";
			r53 = "--";
			r54 = "--";
			r55 = "--";
			roomcount = 0;

			for (int i = 0; i<=1; i++)
			{
				double temp = Math.random();
				if (temp <= .5)
				{
					r01 = "01";
					roomcount++;
				}
				else
				{
					r10 = "10";
					roomcount++;
				}
			}

			if (r01.equals("01"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r02 = "02";
						roomcount++;
					}
					else
					{
						r11 = "11";
						roomcount++;
					}
				}
			}

			if (r02.equals("02"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r03 = "03";
						roomcount++;
					}
					else
					{
						r12 = "12";
						roomcount++;
					}
				}
			}

			if (r03.equals("03"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r04 = "04";
						roomcount++;
					}
					else
					{
						r13 = "13";
						roomcount++;
					}
				}
			}

			if (r04.equals("04"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r05 = "05";
						roomcount++;
					}
					else
					{
						r14 = "14";
						roomcount++;
					}
				}
			}

			if (r05.equals("05"))
			{
				for (int i = 0; i<=0; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r15 = "15";
						roomcount++;
					}
				}
			}

			if (r10.equals("10"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r11 = "11";
						roomcount++;
					}
					else
					{
						r20 = "20";
						roomcount++;
					}
				}
			}

			if (r11.equals("11"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r12 = "12";
						roomcount++;
					}
					else
					{
						r21 = "20";
						roomcount++;
					}
				}
			}

			if (r12.equals("12"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r13 = "13";
						roomcount++;
					}
					else
					{
						r22 = "22";
						roomcount++;
					}
				}
			}

			if (r13.equals("10"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r14 = "14";
						roomcount++;
					}
					else
					{
						r23 = "23";
						roomcount++;
					}
				}
			}

			if (r14.equals("14"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r15 = "15";
						roomcount++;
					}
					else
					{
						r24 = "24";
						roomcount++;
					}
				}
			}

			if (r15.equals("15"))
			{
				for (int i = 0; i<=0; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r25 = "25";
						roomcount++;
					}
				}
			}

			if (r20.equals("20"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r21 = "21";
						roomcount++;
					}
					else
					{
						r30 = "30";
						roomcount++;
					}
				}
			}

			if (r21.equals("21"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r22 = "22";
						roomcount++;
					}
					else
					{
						r31 = "31";
						roomcount++;
					}
				}
			}

			if (r22.equals("22"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r23 = "23";
						roomcount++;
					}
					else
					{
						r32 = "32";
						roomcount++;
					}
				}
			}

			if (r23.equals("23"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r24 = "24";
						roomcount++;
					}
					else
					{
						r33 = "33";
						roomcount++;
					}
				}
			}

			if (r24.equals("24"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r25 = "25";
						roomcount++;
					}
					else
					{
						r34 = "34";
						roomcount++;
					}
				}
			}

			if (r25.equals("25"))
			{
				for (int i = 0; i<=0; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r35 = "35";
						roomcount++;
					}
				}
			}

			if (r30.equals("30"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r31 = "31";
						roomcount++;
					}
					else
					{
					r40 ="40";
						roomcount++;
					}
				}
			}

			if (r31.equals("31"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r32 = "32";
						roomcount++;
					}
					else
					{
						r41 = "41";
						roomcount++;
					}
				}
			}

			if (r32.equals("32"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r33 = "33";
						roomcount++;
					}
					else
					{
						r42 = "42";
						roomcount++;
					}
				}
			}

			if (r33.equals("33"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r34 = "34";
						roomcount++;
					}
					else
					{
						r43 = "43";
						roomcount++;
					}
				}
			}

			if (r34.equals("34"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r35 = "35";
						roomcount++;
					}
					else
					{
						r44 = "44";
						roomcount++;
					}
				}
			}

			if (r35.equals("35"))
			{
				for (int i = 0; i<=0; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r45 = "45";
						roomcount++;
					}
				}
			}

			if (r40.equals("40"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r41 = "41";
						roomcount++;
					}
					else
					{
						r50 = "50";
						roomcount++;
					}
				}
			}

			if (r41.equals("41"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r42 = "42";
						roomcount++;
					}
					else
					{
						r51 = "51";
						roomcount++;
					}
				}
			}

			if (r42.equals("42"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r43 = "43";
						roomcount++;
					}
					else
					{
						r52 = "52";
						roomcount++;
					}
				}
			}

			if (r43.equals("43"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r44 = "44";
						roomcount++;
					}
					else
					{
						r53 = "53";
						roomcount++;
					}
				}
			}

			if (r44.equals("44"))
			{
				for (int i = 0; i<=1; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r45 = "45";
						roomcount++;
					}
					else
					{
						r54 = "54";
						roomcount++;
					}
				}
			}

			if (r45.equals("45"))
			{
				for (int i = 0; i<=0; i++)
				{
					double temp = Math.random();
					if (temp <= .5)
					{
						r55 = "55";
						roomcount++;
					}
				}
			}
		}
	}

	//Print out the Map
	public static void printMap()
	{
		System.out.println(00 + " " + r01 + " " + r02 + " " + r03 + " " + r04 + " " + r05 + " \n" + r10 + " " + r11 + " " + r12 + " " + r13 + " " + r14 + " " + r15 + " \n" + r20 + " " + r21 + " " + r22 + " " + r23 + " " + r24 + " " + r25 + " \n" + r30 + " " + r31 + " " + r32 + " " + r33 + " " + r34 + " " + r35 + " \n" + r40 + " " + r41 + " " + r42 + " " + r43 + " " + r44 + " " + r45 + " \n" + r50 + " " + r51 + " " + r52 + " " + r53 + " " + r54 + " " + r55 + " ");
	}

	//Get info string
	public String getData()
	{
		String output = r01 + r02 + r03 + r04 + r05 + r10 + r11 + r12 + r13 + r14 + r15 + r20 + r21 + r22 + r23 + r24 + r25 + r30 + r31 + r32 + r33 + r34 + r35 + r40 + r41 + r42 + r43 + r44 + r45 + r50 + r51 + r52 + r53 + r54 + r55;
		return output;
	}


}