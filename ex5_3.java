import java.util.Scanner; 

public class ex5_3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter a starting number: ");
        int n = sc.nextInt(); // Initialize n with user input
        
        // Removed the semicolon at the end of the for statement
        for (int i = 0; n <= 10; i++) { 
            System.out.println(n); 
            n++; // Increment n to avoid an infinite loop
            sc.close();
        } 
    } 
}
