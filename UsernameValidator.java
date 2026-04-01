import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        
        String cleanedUsername = username.trim().toLowerCase();
        
        System.out.println("Cleaned username: " + cleanedUsername);
        
        sc.close();
    }
}
