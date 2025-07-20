import java.util.Scanner;

public class Duplicate {
    //Remove duplicates
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int []array=new int[n];

        System.out.println("Sorted Elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int i=0;
        for(int j=0;j<n-1;j++){
            if(array[j]!=array[i]){
                array[i+1]=array[j];
                i++;
            }
        }
        System.out.println("After removing");
        for(int k=0;k<=i;k++){
            System.out.println(array[k]+" ");
        }
    }
}
