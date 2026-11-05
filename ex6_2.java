public class ex6_2 {
    public static void main(String[] args) {
        int[] physics = { 55, 45, 66, 70, 99 };
        int sum = 0;
        for (int i = 0; i < physics.length; i++) {
            sum += physics[i];

        }
        System.out.println("the total is " + sum + "The average is" +
                (sum / 5));
    }

}



//public class ex6_2 {
    //public static void main(String[] args) {
       // int[] physics = { 55, 45, 66, 70, 99 };
        //int sum = 0;

       // for (int mark : physics) {
       //     sum += mark;
       // }

        //System.out.println("The total is " + sum + ", the average is " + (sum / physics.length));
   // }
//}