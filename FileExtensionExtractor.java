import java.util.Scanner;

public class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        
        int lastDotIndex = fileName.lastIndexOf('.');
        
        if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            String extension = fileName.substring(lastDotIndex + 1);
            System.out.println("File extension: " + extension);
        } else {
            System.out.println("No valid extension found");
        }
        
        sc.close();
    }
}
