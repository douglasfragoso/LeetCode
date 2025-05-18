package Palindrome;

public class Palindrome {
    
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x>0) {
            reverse = (reverse * 10) + (x % 10);
            x /=10;
        }

        return reverse == xcopy;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121)); // true
        System.out.println(palindrome.isPalindrome(-121)); // false
        System.out.println(palindrome.isPalindrome(10)); // false
    }
}
