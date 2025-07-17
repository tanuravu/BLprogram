import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the roll number:");
        String rollNo = sc.nextLine();

        System.out.println("University Name:");
        String college = sc.nextLine();

        System.out.println("Branch:");
        String branch= sc.nextLine();


        // Output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("College  : " + college);
        System.out.println("Branch Name : "+ branch);
    }
}
