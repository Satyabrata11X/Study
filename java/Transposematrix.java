
import java.util.Scanner;

public class Transposematrix {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();
        int m=SC.nextInt();
        int matrix[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                matrix [i][j]=SC.nextInt();

            }        
        }
        System.out.println("The transpose is:");
        //To print transpose
        for(int j=0;j<m;j++){
           for (int i = 0; i < n; i++) {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
            }
        }
    }

    

