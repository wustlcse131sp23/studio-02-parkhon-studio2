package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// startAmount
		System.out.println("Please enter the amount of money that you start with: ");
		double startAmount = in.nextDouble();
		
		//winChance
		System.out.println("Please enter the win probability, or the probability that you win a single play: ");
		double winChance = in.nextDouble();

		//winLimit
		System.out.println("Please enter amount of money you will consider as a successful day and leave: ");
		double winLimit = in.nextDouble();
		
		//totalSimulations
		System.out.println("Please enter the number of days you will simulate");
		int totalSimulations = in.nextInt();
		
		//counts
		int countDays = 0;
		int countWin = 0;
		int countLose = 0;
		double winAmount = 0;
		
		//Daily 
		for (int x = 0; x < totalSimulations; x += 1)
		{
			//initiate day
			countDays += 1;
			int countPlays = 0;
			double dayAmount = startAmount;
			System.out.println("Day " + countDays);
			
			//within day
			while (dayAmount > 0 && dayAmount < winLimit)
			{
			    //randomResult
				double result = Math.random();
				//System.out.println("Random result is " + result);
					
				//clearing for the day
				countPlays += 1;
				if (result <= winChance)
					{
					dayAmount += 1;
					//System.out.println("You win! Amount now is " + dayAmount);
					
					if (dayAmount == winLimit)
						{
						countWin +=1;
						winAmount += dayAmount;
						System.out.println("Day " + countDays + " result is a win");
						System.out.println("Total play of the days " + countPlays);
						System.out.println("");
						}
					}
							
				else
					{
					dayAmount -= 1;
					//System.out.println("You lose! Amount now is " + dayAmount);
					
					if (dayAmount == 0)	
						{
						countLose +=1;
						winAmount += dayAmount;
						System.out.println("Day " + countDays + " result is a lose");
						System.out.println("Total play of the days " + countPlays);
						System.out.println("");
						}
					}
			
			}
		
		}
		System.out.println("Total play is " + countDays);
		System.out.println("Total win is " + countWin);
		System.out.println("Total lose is " + countLose);
		System.out.println("Total amount is " + winAmount);
		
}
}

