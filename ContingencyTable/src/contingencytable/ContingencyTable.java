/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contingencytable;

/**
 *
 * @author jose
 */
import java.util.*;
public class ContingencyTable 
{
    public static Scanner input = new Scanner(System.in);
    
    public static void readData(int[][] table, int numRows, int numCols)
    {
        // reads data for a table row by row
        // the table has row rows and columns
        
        System.out.println("Enter data, row by row: ");
        
        //read data row by row
        for(int row = 0; row < numRows; row++)
            for(int col = 0; col < numCols;col++)
                table[row][col] = input.nextInt();
    }
    
    public static void display(int[][] table, int numRows, int numCols, int []rowSums,int[] colSums)
    {
        System.out.println();
        System.out.println();
        System.out.println("Data including ow and colum totals: ");
        System.out.println();
        
        //print table row by row
        for(int row = 0; row < numRows; row++)// for each row
        {
            for(int col = 0; col < numCols; col++)// for each column
                System.out.print(" " + table[row][col] + "\t");
            
            System.out.println("| " + rowSums[row]);//print the row total 
        }
        
        System.out.println();
        
        int grandTotal = 0;
        //print total of columns
        for(int col = 0; col < numCols;col++)
        {
            grandTotal += colSums[col];
            System.out.print(" " + colSums[col] + "\t");
            
        }
        System.out.print("|" + grandTotal);
    }
    
    public static void getTotals(int[][] table, int numRows, int numCols, int[] rowSums, int[] colSums)
    {
        // calculate row and sums
        //get row sums
        
        for(int row = 0; row < numRows;row++)
            for(int col = 0; col < numCols; col++)
                rowSums[row] += table[row][col];
        
        //get col sums
        for(int col = 0; col < numCols; col++)
            for(int row = 0; row < numRows; row++)
                colSums[col] += table[row][col];
        
        
    }
    public static void main(String[] args)
    {
        System.out.print("Please enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter number of columns: ");
        int cols = input.nextInt();
        int[][] table = new int[rows][cols];// 2 d array
        int []rowSums = new int[rows]; // the total of row
        int []colSums = new int[cols]; // the total of columns
        readData(table,rows,cols);
        getTotals(table,rows,cols,rowSums,colSums);// calculate
        display(table,rows,cols,rowSums,colSums); // display
    }
    
}
