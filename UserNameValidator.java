import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept username
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Remove leading & trailing spaces and convert to lowercase
        String cleanedUsername = username.trim().toLowerCase();

        // Display result
        System.out.println("Cleaned Username: " + cleanedUsername);

        sc.close();
    }
}