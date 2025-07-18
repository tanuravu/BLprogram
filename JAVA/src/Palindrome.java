public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reversed = 0;

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
