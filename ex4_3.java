import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nontax = 250000;
        System.out.println("Enter your income");
        double income = sc.nextDouble();

        if (income <= nontax) {
            System.out.println("you dont have to pay tax earn more");
        } else if (income > 250000 && income <= 500000) {
            double tax = (income - nontax) * 0.05;
            System.out.println("your total amount was :" + income);
            System.out.println("your amout after tax is  :" + tax);
            System.out.println("Your income after tax is: " + (income - tax));

        } else if (income > 500000 && income <= 1000000) {
            double tax = (income - nontax) * 0.20;
            System.out.println("your total amount was :" + income);
            System.out.println("your amout after tax is  :" + tax);
            System.out.println("Your income after tax is: " + (income - tax));

        } else if (income > 1000000) {
            double tax = (income - nontax) * 0.30;
            System.out.println("your total amount was :" + income);
            System.out.println("your amout after tax is  :" + tax);
            System.out.println("Your income after tax is: " + (income - tax));

        }
        sc.close();

    }
}
