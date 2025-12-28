import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        System.out.println("Sana Tasneem Azimudin=2024503007");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = input.trim().split(" ");
            int wordCount = words.length;
            System.out.println("Number of words: " + wordCount);
        }
    }
}



