

import java.util.Scanner;



public class Array {
    public static void main(String[] args) {
       // int[]marks=new int[3];
       //int marks[]={97,93,86};//we know the size of the arrayor values
       //whenever we want user gives input and gives the size of the array
       Scanner SC=new Scanner(System.in);
       // marks[0]=97;//phy
        //marks[1]=93;//chem
       // marks[2]=86;//eng
       
       int size=SC.nextInt();
       int numbers[]=new int[size];
       //input
       for(int i=0;i<size;i++){
          numbers[i]=SC.nextInt();
       }
       //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
