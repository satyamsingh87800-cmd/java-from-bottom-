public class ex3_4 {
    public static void main(String[] args) {
        String str = "This  is a   string";
System.out.println("Double space: " + str.contains("  "));
System.out.println("Triple space: " + str.contains("   "));
System.out.println("Double at index: " + str.indexOf("  "));
System.out.println("Triple at index: " + str.indexOf("   "));
    }
}
