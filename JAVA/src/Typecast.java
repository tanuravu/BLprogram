public class Typecast {
    public static void main(String[] args) {
       // Explicit (Narrowing) int to double
        double num1=50.49;
        int num2=(int)num1;
        System.out.println(num1);
        System.out.println(num2);
        //Implicit(Widening)
        int a = 10;
        double b = a;
        System.out.println(b);

        //int to char
        int num = 65;
        char ch = (char) num;
        System.out.println(ch);
            //char to int
        char c = 'z';
        int val = (int) c;
        System.out.println(val);
    }
}
