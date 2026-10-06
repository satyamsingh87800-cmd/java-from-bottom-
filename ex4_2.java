import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of maths");
        int maths = sc.nextInt();
        System.out.println("Enter the number of Physics");
        int Physics = sc.nextInt();
        System.out.println("Enter the number of Chemistry");
        int Chemistry = sc.nextInt();

        double total = ((maths + Chemistry + Physics) / 300.0) * 100;
        if(total >= 33) {
            System.out.println("You have been pass : %" + total);

        }
else{
    System.out.println("better luck next time " + total);
}
        sc.close();
    }
}
