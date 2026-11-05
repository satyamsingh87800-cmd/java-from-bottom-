public class ex6_3 {
    public static void main(String[] args) {
        int index = -1;
        int target = 7;
        int[] num = { 55, 6, 4, 7, 8 };
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                index = i;
                break;

            }
        }
        if (index != target) {
            System.out.println(target + " found at index " + index);

        } else {
            System.out.println("not found " + index);
        }
    }
}
