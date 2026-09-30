import java.util.Scanner;
public class ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Have a good day");
        sc.close();
    }
    
}
