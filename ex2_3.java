import java.util.Scanner;

public class ex2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess");
        int user = sc.nextInt();

        int system = 55;

        boolean is = user > system;
        System.out.println(  "The number is grater than available number"+ is);

        sc.close();

    }

}
