
import java.util.Scanner;

public class Arrayqs {
    public static void main(String[] args) {
       //Qs.Take an array as input from the user. Search for a given number x and print the index at which it occurs.
       Scanner SC=new Scanner(System.in);
       int size=SC.nextInt();
       int numbers[]=new int[size];
       //input
       for(int i=0;i<size;i++){
        numbers[i]=SC.nextInt();
       }
       int x=SC.nextInt();
       //output
       for( int i=0;i<numbers.length;i++){
        if(numbers[i]==x){
            System.out.println("x found at index:"+i);
        }
        SC.close();

       }
       
    }
}
