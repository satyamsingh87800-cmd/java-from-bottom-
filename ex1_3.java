import java.util.Scanner;
public class ex1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        Double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("How many miles :" + miles);
        sc.close();
        
    }
}
