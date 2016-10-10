import java.util.*;
import java.io.*;
import java.text.*;
import java.io.File;

//This program Belongs to Jose Meza

public class dictionary
{
	public static Scanner input = new Scanner(System.in);
	
	public static MyArrayList myWords = new MyArrayList();
	
	public static int SIZE = 0;
	
	public static void getWordLists()
	{

		String temp = "";
		
		System.out.println("Please enter a list of valid words for your word list, Type \"DONE\" when you are finished.");
		
		do 
		{
			temp = input.next();
			if(temp.equalsIgnoreCase("done"))
				break;
			myWords.add(new String(temp));
			SIZE++;
			
		}while(!input.equals("DONE"));
	
	
	}
	
	public static void searchList(String[] arry)
	{

		System.out.println("Please enter a word and I search my word list to see if it is in there: ");
		//String temp = input.next();
		String userInput = input.next();
		
		//sort the array
		sort(arry);
		
		//
		String suggestedWord = "";
		boolean isCorrect = false;
	
		if(binarySearch(arry,userInput) != -1)
		{
			System.out.println("Correct");
			isCorrect = true;
			
		
		}
		
		else 
		{
		suggestedWord = binarySuggestion(arry,userInput);
		}
		
		if(suggestedWord!= null && isCorrect == false)
		{
			System.out.println("Your suggested word is: " + suggestedWord);
			
		}
		else if(isCorrect == false)
		{
			System.out.println("No suggestions");
		}
	
		
	}
	// to Sort a single string alphabetically
	public static String insertionSort(String input)
	{
		char[] tempKey = input.toCharArray();
		
		for(int i=0;i<(tempKey.length-1);i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(tempKey[j]<tempKey[j-1])
				{
					char temp=tempKey[j-1];
					tempKey[j-1]=tempKey[j];
					tempKey[j]=temp;
				}
			}
		}
		
		return String.valueOf(tempKey);
	}
	
	////
	public static String binarySuggestion(String[] arry,String key)
	{
		//binary search
		int lo = 0; 
		int hi = arry.length-1;
		int mid;
		
		String temp = "";
		String tempKey = "";
		
			//tempArry[i] = arry[i];;
			
			
		String [] tempArry = new String[arry.length];
		for(int i = 0; i < tempArry.length; i++)
			tempArry[i] = arry[i];
		
		key = key.toLowerCase();//error checking for capital letters
		
		while(lo<= hi)
		{
		mid = lo +(hi-lo)/2;	
		//
		if(key.length() == tempArry[mid].length())
		{
			tempArry[mid] = tempArry[mid].toLowerCase();
			
			if(key.charAt(0) == tempArry[mid].charAt(0) && key.charAt(key.length()-1) == tempArry[mid].charAt(key.length()-1))// && key.length() == tempArry[mid].length())
			{
			tempArry[mid] = insertionSort(tempArry[mid]);
			tempKey = insertionSort(key);
			
			if(tempKey.equals(tempArry[mid]))
				return arry[mid];
			}	
		}
		
		if(key.compareToIgnoreCase(tempArry[mid]) < 0)
			hi = mid-1;
		else if(key.compareToIgnoreCase(tempArry[mid]) > 0)
			lo = mid + 1;
		
		}
		
		return null;	 
	
	}
	
	//Recursive binary taken from StackOverflow.com
	public static int binarySearch(String[] arry, String key)
	{
		return binarySearch(arry,0, arry.length-1, key);
	}
	
	public static int binarySearch(String[] arry, int start, int end,String key)
	{
		int middle = (start+end)/2;
		if(end < start)
			return -1;
		
		if( key.equals(arry[middle]))
			return middle;
		else if(key.compareToIgnoreCase(arry[middle]) < 0)
			return binarySearch(arry,start,middle-1,key);
		else
			return binarySearch(arry,middle+1,end,key);
			
	}
	
	
	//Selection Sort
	public static void sort(String words[])
	{
	   int minIndex;
	   String smallest;

	   for(int i = 0; i < (words.length); i++)
	   {
		   minIndex = i;
		   smallest = words[i];
		   for(int index = i +1; index < words.length; index++)
		   {
			   if (words[index].compareToIgnoreCase(smallest) < 0)
			   {
				   smallest = words[index];
				   minIndex = index;
			   }
		   }
		   words[minIndex] = words[i];
		   words[i] = smallest;
	   }
	   
	}

	public static void main(String[] args)
	{
	
		getWordLists();
		
		String []wordList = new String[SIZE];
		
		for(int i = 0;i < SIZE;i++)
		{
			wordList[i] = myWords.get(0);
			myWords.remove(0);
		}
		
		
	
		searchList(wordList);
		
	}
	
}
/* Array List Implementation
Array list class taken from this link and Changed from Objects to String to suit my program
http://www.java2novice.com/java-interview-programs/arraylist-implementation/ 
*/
class MyArrayList {
 
    private String[] myStore;
    private int actSize = 0;
     
    public MyArrayList(){
        myStore = new String[10];
    }
     
    public String get(int index){
        if(index < actSize){
            return myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(String obj){
        if(myStore.length-actSize <= 5){
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }
     
    public String remove(int index){
        if(index < actSize){
            String obj = myStore[index];
            myStore[index] = null;
            int tmp = index;
            while(tmp < actSize){
                myStore[tmp] = myStore[tmp+1];
                myStore[tmp+1] = null;
                tmp++;
            }
            actSize--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
     
    public int size(){
        return actSize;
    }
     
    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: "+myStore.length);
    }
	
}
