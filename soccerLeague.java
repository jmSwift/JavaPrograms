import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

public class soccerLeague
{
	public static String teamOne = "", teamTwo = "", teamThree ="", sentence ="";
	
	public static int [][]team1 = { {0,0}};
	public static int [][]team2 = { {0,0}};
	public static int [][]team3 = { {0,0}};
	
	public static int count = 0;
	//public static int team1_score = 0, team2_score = 0, team3_score = 0;
	
	public static void simulateMatch(String [] tokens,int [][] tempTeam1, int [][] tempTeam2)
	{
		int i = 0;
	
	if( Integer.parseInt(tokens[1]) > Integer.parseInt(tokens[3]))
		{
			//i = tempTeam1[0][0];
			tempTeam1[0][0] += 1;
			//i = tempTeam2[0][1];
			tempTeam2[0][1] += 1;
		}
	else
		{
			//i = tempTeam1[0][1];
			tempTeam1[0][1] += 1;
			//i = tempTeam2[1][0];
			tempTeam2[0][0] +=1;
		}
		
	}
		
	public static void main(String[] args)throws IOException
	{
			File file = new File("soccerResults.txt");
			Scanner inputFile = new Scanner(file);
			
			
			while(inputFile.hasNext())
			{
				sentence = inputFile.nextLine();
				String [] tokens = sentence.split("\\s+");
				
				//
				//System.out.print(tokens.length);
				
				//for(String str: tokens)
					//System.out.print(str );
					
				
				if(count == 0)
				{
					teamOne = tokens[0];
					teamTwo = tokens[2];
					simulateMatch(tokens,team1,team2);
				}
				else if(count == 1)
				{
					teamThree = tokens[0];
					simulateMatch(tokens,team3,team1);
				}
				else if(count == 2)
					simulateMatch(tokens,team2,team3);
				else if(count == 3)
					simulateMatch(tokens,team3,team1);
				else
					simulateMatch(tokens,team2,team3);
				
				count++;
			
			}
	
		
			inputFile.close();
			System.out.println(String.format("Team %19s %17s", "Wins","Losses"));//Got this string format line from http://stackoverflow.com/questions/4418308/java-output-formatting-for-strings
			System.out.println(String.format("%s %12s %15s " ,teamOne, team1[0][0], team1[0][1]));
			System.out.println(String.format("%s %14s %15s " ,teamTwo, team2[0][0],team2[0][1]));
			System.out.println(String.format("%s %17s %15s " ,teamThree, team3[0][0], team3[0][1]));
			
			
	}
}

