/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samloydpuzzle;

import java.util.*;
public class SamLoydPuzzle 
{

  
    public static void main(String[] args)
    {
       public static void printPuzzle(int[][] puzzle)
       {
           for(int i = 0; i < 4;i++)
           {
               for(int j= 0; j < 4; j++)
                   System.out.print(puzzle[i][j] + "\t");
               System.out.println();
           }
       }
    }

    public static void swap(int[][] p, int i, int j, int r, int s)
    {
        //swap [i][j] with p[r][s]  
        int temp = p[r][s];
        p[r][s] = p[i][j];
        p[i][j] = temp;
    }

    public static int[] makeList(int[][] p) // writes pusszle numbers into array , left to right, top to bottom
    {  
    int index = 0;
    int[] list = new int[16];
    for(int row = 0; row <4; row++)
        for(int col = 0; col < 4; col++)
            if(p[row][col] !=0)
            {
            list[index] = p[row][col];
            index++;
            }
     return list;

    }

    public static int countInversions(int[][] p)// return number of inversions
    {
    int count = 0;
    int []s = makeList(p);
    for(int i = 0; i < 16; i++)
        {
            int num = 0;
            for(int j = 0; j < i; j++)
                if(s[j] > s[i])
                    num++;

             count = count + num;

        }   
    return count;
    }

    


