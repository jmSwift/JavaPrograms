import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;

public class userInformation
{
	public int row = 0;
	public int column = 0;
	
	String users[][] = new String[25][25];
	
	public String registerUser(String[][] userInfo)
	{
		Random randy = new Random();
		
		int wrong_trys = 0;
		
		System.out.println("Enter a username: ");
		userInfo[row][column] = input.next();
		for(int i = 0; i < row-1; i++)
			for(int j = 0; j < column-1; j++)
			{
				while(userInfo[row][column] == userInfo[i][j] && wrong_trys !=2)
				{
				wrong_trys++;
				System.out.println("Re-enter username: ");
			    userInfo[row][column] = input.next();
				}
			}
		
		if(wrong_trys == 2)
			for(int k = 0; k < 10; k++)
				userInfo[row][column] += (char)(randy.nextInt(25)+65);//casting a character for the ascii numbers 65 - 90
				
				
		System.out.println("Enter a password: ");
		userInfo[row++][++column] = input.next();
		
		
	}
	
	public void existingUser(
	
	//public void existingUser(

}

class StackMethods
{
	int[] stack;
	int top; 
	int size;
	
	public StackMethods(int arraySize)
	{
		size = arraySize;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int value)
	{
		if(top == size -1)
			System.out.println("Stack Overflow");
		else
		{
			top++;
			stack[top] = value;
		}
	}
	
	public int pop()
	{
		int returnValue = -1;
		if(!isEmpty())
		{
			returnValue = stack[top]
			top--;
		}
		
		else
			System.out.println("Stack Underflow");
		
		return returnValue;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void display()
	{
	for(int i = 0; i<=top; i++)
			System.out.print(stack[i]+"|");
		System.out.println("");
	}	
}

class myQueue
{
	StackMethods firstStack, secondStack;
	int temp;
	public myQueue(int stackSize)
	{
	firstStack = new StackMethods(stackSize);
	secondStack = new StackMethods((stackSize+2));
	}
	
	public void enqueue(int a)
	{
		firstStack.push(a);
	}
	public void dequeue()
	{
		int temp = 0;
		if(firstStack.isEmpty())
		{
			System.out.println("underflow occured");
		}
		else
		{
			while(!firstStack.isEmpty())
			{		temp = firstStack.pop();
					secondStack.push(temp);
					
			}
		}
		firstStack.push(temp);
		
	}
	
	public void display()
	{
		firstStack.display();
	}
}	

public class MenuOptions
{
	public void printMenu()
	{
		int choice;
		do{

		System.out.println("1.Register User/Create Account");
		System.out.println("2.Existing user Login");
		System.out.println("3.Visit a  Website");
		System.out.println("4.Browsing History, first visited");
		System.out.println("5.Browsing History, most recent");
		System.out.println("6.Number of times each website was visited");
		System.out.println("7.Check most visited website");
		System.out.println("8. Logout");

			switch(choice)
			{
				case 1: registerUser();
						break;
				case 2: Login();
						break;
				case 3: existingUser();
						break;
				case 4: browsingHistory();
						break;
				case 5: recentlyVisited();
						break;
				case 6: numberTimesVisited();
						break;
				case 7: mostVisited();
						break;
				default:System.out.println("logging out");
						break;
				
			}

		}while(choice!=999);
	}		

}
	
public static void main(String[] args)
{
	printMenu();

}