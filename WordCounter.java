import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Use StringTokenizer to count words
        StringTokenizer st = new StringTokenizer(sentence);
        int wordCount = st.countTokens();

        // Display result
        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}