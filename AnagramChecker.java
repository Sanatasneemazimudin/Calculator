import java.util.Arrays;
public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        System.out.println("Sana Tasneem Azimudin-2024503007");
        String s1 = "JAVA PROGRAMMING!!";
        String s2 = "Language";
        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        }
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}






