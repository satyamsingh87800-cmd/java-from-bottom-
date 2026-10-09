import java.util.Random;
import java.util.Scanner;
public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Please enter the number.\t 1 is paper. \t 2 is sesor and 3 is rock");
        int guess = sc.nextInt();
        int computer = r.nextInt(3) + 1;
        if (guess == computer) {
    System.out.println("Tie!");
}  else if ((guess == 1 && computer == 3) ||
           (guess == 2 && computer == 1) ||
           (guess == 3 && computer == 2)) {
    System.out.println("You win!");
}






        sc.close();
        
    }
}
