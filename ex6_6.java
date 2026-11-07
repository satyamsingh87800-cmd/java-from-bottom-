public class ex6_6 {
    public static void main(String[] args) {
        int[] a = {45, 12, 78, 33, 90};
        int min = a[0];                  // assume first is the smallest

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];              // new champion
            }
        }

        System.out.println("Minimum = " + min);
    }
}
