import java.util.Arrays;

public class AnagramChecker {
    /**
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("[^a-z]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-z]", "");

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        System.out.println("Are they anagrams? " + isAnagram(str1, str2));
    }
} 
