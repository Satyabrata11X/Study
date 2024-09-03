
import java.util.Scanner;

class Jarvis{
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1:Addition");
        System.out.println("2:Subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        int choice=SC.nextInt();
        System.out.println("Enter your first number:");
        double num1=SC.nextDouble();
        System.out.println("Enter your second number:");
        double num2=SC.nextDouble();
        double result=0;
        switch (choice) {
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;    
            case 3:
                result=num1*num2;
                break;           
            case 4:
                result=num1/num2;
                break;                 
            default:
                System.out.println("Enter operator is not valid");
        }
        System.out.println("Result:"+result);
    }
}