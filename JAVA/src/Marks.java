import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
//        int[][] marks={10,20,30,40,50,60,70,80,90};
//        for(int i=0;i<=4;i++){
//            System.out.println(marks[i]);
//            marks[3]=300;
//        }
//        //for-each loop
//        for(int mark:marks) {
//            System.out.println(mark);
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row= sc.nextInt();
        System.out.println("Enter the columns");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("enter the element of the matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
     }
       // sc.close();

    }

