
import java.util.Scanner;
import java.util.Random;

public class Card {

	public static void main(String[] args) {
		Random r=new Random();

		Scanner sc=new Scanner(System.in);
		Player p1=new Player();
		Player p2=new Player();

		System.out.print("Enter the Health : ");
		int h=sc.nextInt();

		p1.setHealth(h);
		p2.setHealth(h);

		System.out.print("Enter number of round : ");
		int rmax=sc.nextInt();

		int coin;


		coin=r.nextInt(2)+1;
		int turn=coin;
		int v1,v2,round=1;
		boolean f=true;
		while(p1.getHealth()>0 && p2.getHealth()>0 && round<=rmax)
		{   System.out.println("-------------------Round "+round+"-------------------");

		    System.out.println("p1 : "+p1.getHealth()+"  p2 : "+p2.getHealth());
		    System.out.print("Player "+turn+" :Enter 1 to roll the dice : ");
			sc.nextInt();

			v1=r.nextInt(11);
			System.out.println("CARD - "+v1);

			if(turn == 1)
				turn=2;
			else
			   turn=1;

			System.out.print("Player "+turn+" :Enter 1 to roll the dice : ");
			sc.nextInt();

			v2=r.nextInt(11);
            System.out.println("CARD - "+v2+"\n");
			if(v1==0 && v2==0)
			{System.out.println("-->Draw");}
			else
				if(v1==0 && v2!=0)
				{
					if(coin==1)
					{
						p1.fullrevive();
						p2.lose();
						System.out.println("-->P1 is the WINNer of ROUND "+round+" & revive");
					}
					else
					{
						p2.fullrevive();
						p1.lose();
						System.out.println("-->P2 is the WINNer of ROUND "+round+" & revive");
					}
				}
				else
					if(v1!=0 && v2==0)
					{
						if(turn==1)
						{
							p1.fullrevive();
							p2.lose();
							System.out.println("-->P1 is the WINNer of ROUND "+round+" & revive");
						}
						else
						{
							p2.fullrevive();
							p1.lose();
							System.out.println("-->P2 is the WINNer of ROUND "+round+" & revive");
						}
					}
					else
						if (v1>v2)
						{
							if(coin==1)
							{

								p2.lose();
								System.out.println("-->P1 is the WINNer of ROUND "+round);
							}
							else
							{

								p1.lose();
								System.out.println("-->P2 is the WINNer of ROUND "+round);
							}

						}
						else
							if (v1<v2)
							{
								if(turn==1)
								{
									p2.lose();
									System.out.println("-->P1 is the WINNer of ROUND "+round);
								}
								else
								{
									p1.lose();
									System.out.println("-->P2 is the WINNer of ROUND "+round);
								}

							}
							else
								System.out.println("-->DRAW");



			if(p1.getHealth()>0 && p2.getHealth()==0)
			{



					System.out.println("-->P1 has won this game.");


				f=false;
				break;
			}
			else
				if(p2.getHealth()>0 && p1.getHealth()==0)
				{
						System.out.println("-->P2 has won this game");

					f=false;
					break;
				}
			round ++;

			if(turn == 1)
				turn=2;
			else
			   turn=1;

		}

		System.out.println("\n------------------------------------------------------------\n");
		System.out.println("p1 :"+p1.getHealth()+"p2 : "+p2.getHealth());

		if(f)
		{
			if(p1.getHealth() > p2.getHealth())
			{
				System.out.println("-->P1 has won this game");
			}
			else
				if(p1.getHealth() < p2.getHealth())
				{
					System.out.println("-->P2 has won this game");
				}
				else
				{
					System.out.println("DRAW :)");
				}
		}




	}

}
