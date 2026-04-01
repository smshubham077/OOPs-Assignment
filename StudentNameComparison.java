import java.util.Scanner;

public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();
        
        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();
        
        boolean caseSensitive = name1.equals(name2);
        boolean caseInsensitive = name1.equalsIgnoreCase(name2);
        
        System.out.println("Case-sensitive comparison (equals): " + caseSensitive);
        System.out.println("Case-insensitive comparison (equalsIgnoreCase): " + caseInsensitive);
        
        sc.close();
    }
}
