import java.util.Scanner;

public class ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Added missing quotation marks to the print statements
        System.out.println("enter a maths number : ");
        int maths = sc.nextInt();

        System.out.println("enter a chemistry number : ");
        int chemistry = sc.nextInt();

        System.out.println("enter a physics number : ");
        int physics = sc.nextInt();

        System.out.println("enter a English number : ");
        int English = sc.nextInt();

        System.out.println("enter a GD number : ");
        int GD = sc.nextInt();

        // Changed 500 to 500.0 to force decimal/floating-point division
        double total = ((maths + chemistry + English + physics + GD) / 500.0) * 100;

        System.out.println("total percentage is " + total + "%");

        sc.close();
    }
}
