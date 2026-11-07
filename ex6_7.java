public class ex6_7 {
    public static void main(String[] args) {
        int[] a = {45, 12, 78, 33, 90};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}
