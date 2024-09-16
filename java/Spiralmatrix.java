import java.util.Scanner;

public class Spiralmatrix {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();
        int m=SC.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=SC.nextInt();

            }
        }
        System.out.println("The Spiral matrix is:");
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        //To print spiral order matrix
        while (rowStart<=rowEnd&&colStart<=colEnd){
            //1
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;
            //2
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;
            //3
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;
            //4
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(matrix[row][colStart]);
            }
            colStart++;
            System.out.println();
        }

        SC.close();
    }
}
