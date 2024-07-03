import java.util.Scanner;

public class input { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(2 * a);
        

        //sc.nextInt() reads the integer input but leaves the newline character in the input buffer.
// If you call sc.nextLine() immediately after sc.nextInt(), nextLine() reads the leftover newline character instead of waiting for the user's input, resulting in an empty string.
// By adding sc.nextLine() after sc.nextInt(), you effectively consume the leftover newline character, ensuring that the next call to nextLine() will correctly wait for and read the user’s actual input.
        sc.nextLine(); // Consume the leftover newline
        
        System.out.println("Enter your name: ");
        String t = sc.nextLine();
        System.out.println("Hello " + t);
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
