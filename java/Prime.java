
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int n=SC.nextInt();
        boolean is_prime=true;
       for(int i=2;i<=n/2;i++){
        if(n%i==0){
            is_prime=false;
            break;
        }
       }
       if(is_prime){
       if(n==1){
       System.out.println("This is neither prime or not composite"); 
        }else{
            System.out.println("This is Prime number");
        }
       }else{
        System.out.println("This is not Prime number");
       }
    }
}
