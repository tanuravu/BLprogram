import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number");
        int num2=sc.nextInt();
        System.out.println("Enter the third number");
        int num3=sc.nextInt();
        System.out.println("Enter the fourth number");
        int num4=sc.nextInt();
        //with two numbers
        //int largest=(num1>num2)?num1:num2;

        //with three numbers
        //int largest=(num1 > num2)? (num1 > num3 ? num1 : num3): (num2 > num3 ? num2 : num3);

        //with four numbers
        int largest = (num1 > num2 && num1 > num3 && num1 > num4) ? num1 :
                (num2 > num3 && num2 > num4) ? num2 :
                        (num3 > num4) ? num3 : num4;

        System.out.println("Largest Number:"+largest);
    }
}

