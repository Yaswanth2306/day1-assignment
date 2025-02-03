public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        System.out.println("Is palindrome? " + isPalindrome(input));
    }
}