package eem480.homework1;
import java.util.Random;

    
   public class cMatrix {

       private long [][] elements; // Keeps the elements of matrix in two dimensional array

       private int row; // row size

       private int col; // column size

       private int row_v = 10 ; //enter your row value here

       private int column_v = 10 ; // enter your coulmn value here

       public cMatrix(){ // Constructor generate matrix of size 10x10

           elements = new long [row_v][column_v];
           
       
       }

       public cMatrix(int row, int col){ //Constructor

           this.row = row;
           this.col = col;
           this.elements = new long [row][col];
       
       }

       public void AssignRandom(){ //Assigning random variables in range 1 -10000

       
            Random r=new Random();
            
            for(int i=0;i< elements.length;i++)
            {
            for(int j=0;j< elements[0].length;j++)
            {
             elements[i][j]=r.nextInt(10000);
            
            }
  
     
  }
  
           
           
       }

       public void printMatrix(){ // Printing matrix in matrix form

       for(int i=0;i< elements.length;i++)
            {
            for(int j=0;j< elements[0].length;j++)
            {
            
            System.out.print(elements[i][j]+"\t");
            }
  
     System.out.print("\n");
       
       }
       }
       
       public void printMatrixWithPrime(){ //Prints the matrix with “*” sign near the prime elements
    
       for(int i=0;i< elements.length;i++)
            {
            for(int j=0;j< elements[0].length;j++)
            {
             boolean isPrime = true;
        for (int k = 2; k<elements[i][j]; k++) {
            if(elements[i][j]%k == 0){
               isPrime = false;
                break;
            }  
        }
        if(isPrime){
            System.out.print(elements[i][j] + "*  ");
        }
        else {
            System.out.print(elements[i][j] + "   ");
        }
            }
             System.out.println();
       }
        }
        public cMatrix multiplyMatrices(cMatrix Multiplicand){ // Multiply two matrices and informs the user about time lapse
           long startTime = System.currentTimeMillis();
           cMatrix m2 =this;
           cMatrix m4 = new cMatrix(m2.row, Multiplicand.col);
           System.out.println(m2.col);
           
           for(int i=0; i<m4.row ;i++)
            {
            for(int j=0;j< m4.col;j++)
            {
                for(int k=0; k< m2.col; k++){
                    
                    m4.elements[i][j] += m2.elements[i][k] * Multiplicand.elements[k][j];
                 }
                 }
            }
           System.out.println(""); 
           m4.printMatrix();
           long stopTime = System.currentTimeMillis();
           long executionTime = stopTime-startTime;
           System.out.println("The duration of multiplication of matrices " +  m2.row  + "x" + m2.col + " * " +  Multiplicand.row + "x" + Multiplicand.col + " is:  " + executionTime + " ms.");
           return m4;
        }
       
       
       public static void main(String[] args) {


        // TODO code application logic here
        
        cMatrix m1 = new cMatrix();
        m1.AssignRandom();
        
        m1.printMatrix();
        
        System.out.println("");
        
        m1.printMatrixWithPrime();
        
        cMatrix m2 = new cMatrix(10,10);
        
       
        m2.AssignRandom();
        
        m2.printMatrix();
        
        cMatrix m3 = new cMatrix(10,10);
        
        
        m3.AssignRandom();
        
        m3.printMatrix();
        
        cMatrix m4 = new cMatrix();
        
        
        
        m4 = m2.multiplyMatrices(m3);
        
       
}
   }
     
    

