
import java.util.Scanner;

public class Twod_array {
    public static void main(String[] args) {
       Scanner SC=new Scanner(System.in);
       int rows=SC.nextInt();
       int cols=SC.nextInt();
       int[][] numbers=new int[rows][cols];
       //input
       //rows
       for(int i=0;i<rows;i++){
       //coulmns
       for (int j=0; j< cols; j++) {
           numbers[i][j]=SC.nextInt();

       }
       }
       //output
       for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
            System.out.print(numbers[i][j]+" ");
          }
          System.out.println();
       }
    }
}
