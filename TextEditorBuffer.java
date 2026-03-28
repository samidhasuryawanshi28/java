import java.util.Scanner;

class TextEditorBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Append text
        System.out.print("Enter initial text: ");
        String text = sc.nextLine();
        sb.append(text);

        // Insert text at specific position
        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();

        System.out.print("Enter position to insert: ");
        int position = sc.nextInt();

        if (position >= 0 && position <= sb.length()) {
            sb.insert(position, insertText);
        } else {
            System.out.println("Invalid position!");
        }

        // Reverse the final string
        sb.reverse();

        // Display result
        System.out.println("Final reversed string: " + sb);

        sc.close();
    }
}