
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int input;
        //using do-while loop
        do { 
            int marks=SC.nextInt();
            if(marks>=90&&marks<=100){
                System.out.println("This is Good");
            }else if(marks>=60&&marks<=89){
                System.out.println("This is also Good");
            }else if(marks>=0&&marks<=59){
                System.out.println("This is Good as well");
            }else{
                System.out.println("Invalid");
            }
            System.out.println("Wnat to Continue?(Yes(1)orNo(0))");
            input=SC.nextInt();
        } while (input==1);
    }
}
