import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Arrays;
import java.util.ArrayList;
public class NFL2{

	public static String[] teams = {"Dallas Cowboys","Indianapolis Colts","New Orleans Saints","Buffalo Bills","Denver Broncos","San Francisco 49ers","Green Bay Packers","Minnesota Vikings"};

	public static String[] players ={"Tony Romo","Demarco Murray","Sam Bradford","Adrian Peterson","Landry Jones","Blake Bell","Tom Brady","Roy Finch","Ryan Broyles","Trevor Knight","Peytton Manning","Eli Manning","Brett Favre","Ben Roethlisberger","Aaron Rodgers","Joe Flacco","Reggie Bush","Lance Dunbar","Toby Gerhart","Brandon Bostick","Garrett Celek","Gavin Escobar","Anthony Fasano","Geno Smith","Drew Brees","Andrew Luck","Johnny Manziel","Robert Griffin III","Jonathan Franklin","Arian Foster","Mike Goodson","Jeff Demps"};

	
	
	public static void printRounds(String[] round1, String[] round2, String[] round3,String[] round4,String[] teamOrder)//////////////////////-----------------
	{
		
	for(int i = 0; i < round1.length;i++)
		System.out.println("Round :1 Team:" + teamOrder[i] + " selected: " + round1[i]);
	System.out.println();
	
	for(int i = 0; i < round1.length;i++)
		System.out.println("Round :2 Team:" + teamOrder[i] + " selected: " + round2[i]);
	System.out.println();
	
	for(int i = 0; i < round1.length;i++)
		System.out.println("Round :3 Team:" + teamOrder[i] + " selected: " + round3[i]);
	System.out.println();
	
	for(int i = 0; i < round1.length;i++)
		System.out.println("Round :4 Team:" + teamOrder[i] + " selected: " + round4[i]);
	System.out.println();
	
	
	}
  
	public static void draftRound(String[] players, String[] teamOrder)
	{
		
		System.out.println(); //spacing purposes
		Random number = new Random();
		ArrayList<Integer> roundNumbers = new ArrayList<Integer>();
		ArrayList<String> playerlist = new ArrayList<String>();//////////// newwwwww
		
		
		int index,
			ones = 0,
			twos = 0,
			threes = 0,
			fours = 0;
			
		for(int i = 1; i < 5;i++)
			roundNumbers.add(i);
			
		for(int j = 0; j < players.length;j++)/////
			playerlist.add(players[j]);/////////
			
		String currentPlayer = "";//neww
		
			
		String roundPicks[][] = new String[players.length][roundNumbers.size()];
		
		//String selection[][] = new String[players.length]
		String roundOne[] = new String[8];
		String roundTwo[] = new String[8];
		String roundThree[] = new String[8];
		String roundFour[] = new String[8];
	
			
		//index = roundNumbers.get(number.nextInt(roundNumbers.size()));
		int count = 0;
		
		for(int i = 0; i < 8; i++) // less than players.length
		{
			for(int j = 0; j < 4; j++)//newwwwwwwwwww
			{
			
				index = roundNumbers.get(number.nextInt(roundNumbers.size()));
				currentPlayer = playerlist.get(number.nextInt(playerlist.size()));
				//playerlist.remove(currentPlayer);
				
				roundPicks[i][j] = currentPlayer;
				//playerlist.remove(currentPlayer);
				/*
				if(index == 1)
				{
					roundOne[count] = currentPlayer;
					count++;
				}
				else if(index ==2)
				{
					roundTwo[i] = currentPlayer;
					count++;
				}
				else if(index == 3)
					roundThree[i] = currentPlayer;
				else
					roundFour[i] = currentPlayer;
					
				*/
				
				System.out.println(roundPicks[i][j] + " has been selected to be drafted in Round " + index );
				
				//playerlist.remove(currentPlayer);
				if(index == 1)
				{
					roundOne[ones] = currentPlayer;
					ones++;
					if(ones == 8)
						roundNumbers.remove(Integer.valueOf(1));
					
				}
				
				if(index == 2)
				{
					roundTwo[twos] = currentPlayer;
					twos++;
					if(twos == 8)
						roundNumbers.remove(Integer.valueOf(2));
					
					
				}
				
				if(index == 3)
				{
					roundThree[threes] = currentPlayer;
					threes++;
					if(threes == 8)
						roundNumbers.remove(Integer.valueOf(3));
				
					
				}
				
				if(index == 4)
				{
					roundFour[fours] = currentPlayer;
					fours++;
					if(fours ==8)
						roundNumbers.remove(Integer.valueOf(4));
					
				}
				
				playerlist.remove(currentPlayer);
			
			}
			
			
			
			
		}
		System.out.println();
		
		printRounds(roundOne,roundTwo,roundThree,roundFour,teamOrder);
	
	}
	public static void percentagesWon(String[] teams)
	{
		Random generator = new Random();
		DecimalFormat formatdec = new DecimalFormat("0.00");
		DecimalFormat singleDec = new DecimalFormat("0");
		double percentagesWon[] = new double[teams.length];
		
		
		for(int j = 0; j < teams.length; j++)
			percentagesWon[j] = generator.nextDouble()*100;
		
		for(int i = 0; i < teams.length; i++)
			System.out.println("The " + teams[i] + " won " + formatdec.format(percentagesWon[i]) + " of their games last season ");
			System.out.println();
		
		
		double sortedPercentages[] = new double[teams.length];
		System.arraycopy(percentagesWon,0,sortedPercentages,0,percentagesWon.length);// copies percentagesWOn array
		Arrays.sort(sortedPercentages);
		
		int [] rankings = new int[players.length];
		//int [] teamOrder = new int[players.length];
		
		for(int a = 0; a < teams.length; a++)
		{
			for(int b = 0; b < teams.length; b++)
			{
				//System.out.println(j);
				if(percentagesWon[a] == sortedPercentages[b])
						rankings[a] = b +1;
						
				
			}
		}
	
		
		String [] teamOrder = new String[players.length];
		//int counter = 0;
		
		System.out.println("After sorting the data is");
		for(int k = 0; k < teams.length; k++)
		{
			System.out.println("The " + teams[k] + " are ranked " + singleDec.format((rankings[k])));
			if(rankings[k] == 1)
			{
				teamOrder[0] = teams[k];
			}
			else if(rankings[k] == 2)
			{
				teamOrder[1] = teams[k];
			}
			else if(rankings[k] == 3)
			{
				teamOrder[2] = teams[k];
			}
			else if(rankings[k] == 4)
			{
				teamOrder[3] = teams[k];
			}
			else if(rankings[k] == 5)
			{
				teamOrder[4] = teams[k];
			}
			else if(rankings[k] == 6)
			{
				teamOrder[5] = teams[k];
			}
			else if(rankings[k] == 7)
			{
				teamOrder[6] = teams[k];
			}
			else if(rankings[k] == 8)
			{
				teamOrder[7] = teams[k];
			}
		}
		
		
		
		
		draftRound(players,teamOrder);
		
		//for(int z = 0; z < 8; z++)
			//System.out.println(teamOrder[z]);
	}

	public static void main(String[] args)
	{
	
		
		percentagesWon(teams);
		
		//draftRound(players);
		
		
			


	}
}