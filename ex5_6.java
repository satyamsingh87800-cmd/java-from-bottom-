import java.util.Scanner;
public class ex5_6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number the table you want");
        int i = sc.nextInt();
        for(int j = 10; j>=1;j--) {
            System.out.println(i*j);

        }
        sc.close();
    }
// reverse table 
}
