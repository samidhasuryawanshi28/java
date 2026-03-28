import java.util.Scanner;

class TextProcessingBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StringBuilder
        StringBuilder sb = new StringBuilder();

        // Accept initial text
        System.out.print("Enter initial text: ");
        String text = sc.nextLine();
        sb.append(text);

        // Append additional text
        System.out.print("Enter text to append: ");
        String moreText = sc.nextLine();
        sb.append(moreText);

        // Display modified string
        System.out.println("Modified String: " + sb);

        sc.close();
    }
}

/*
Comparison between StringBuilder and StringBuffer:

1. StringBuffer is thread-safe (synchronized), while StringBuilder is not.
2. StringBuilder is faster than StringBuffer because it is not synchronized.
3. Use StringBuffer in multi-threaded environments.
4. Use StringBuilder in single-threaded programs for better performance.
*/