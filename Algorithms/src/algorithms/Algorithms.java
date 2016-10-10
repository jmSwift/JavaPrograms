/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author jose
 */
public class Algorithms {

      public static void bubbleSort(int arry[])
    {
        for(int i = 0; i < arry.length; i++)
        {
           
            for(int j = 0; j < arry.length-1;j++)
                if(arry[j] > arry[j+1])
                {
                    int temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                    
                }
        }
       
    }
      
      public static void insertionSort(int arry[])
      {
          int current;
          int j;
          
          for(int i = 0; i < arry.length;i++)
          {
              current = arry[i];
              j = i -1;
              while(j >= 0 && arry[j] > current)
              {
                  arry[j+1] = arry[j];
                  j = j -1;
              }
              
              arry[j+1] = current;
          }
          
      }
      public static void selectionSort(int[] arry)
      {
          int minIndex;
          int temp = 0;
          
          for(int i = 0; i < arry.length-2; i++)
          {
              minIndex = i;
          
              for(int j = i+1 ; j < arry.length -1;j++)
              {
                if(arry[j] < arry[minIndex])
                    minIndex = j;
              }  
                temp = arry[minIndex];
                arry[minIndex] = arry[i];
                arry[i] = temp;
                      
              
          }
          
      }
    public static void main(String[] args)
    {
        int []arry = { 1,3,2,4,6,5,8,9,7,10};
        
        insertionSort(arry);
        
        
    }
    
}
