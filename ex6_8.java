public class ex6_8 {
    public static void main(String[] args) {
        int[] a = {45, 12, 78, 33, 90};
        boolean sorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;                   // one violation is enough
            }
        }

        if (sorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}
