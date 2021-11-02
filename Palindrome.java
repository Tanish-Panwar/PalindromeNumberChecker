public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1201));
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }
}
