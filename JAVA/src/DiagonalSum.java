import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matrix=new int[3][3];
        System.out.println("Enter the elements of matrix:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int diagonal=0;
        for(int i=0;i<3;i++){
            sum+=matrix[i][i];
            diagonal+=matrix[i][2-i];
        }
        System.out.println("1st diagonal:"+sum);
        System.out.println("2nd diagonal:"+diagonal);
    }
}
