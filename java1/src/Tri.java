public class Tri {
    public static void main(String[] args) {
        System.out.println(isNegative(-10));
        System.out.println(isNegative(0));
        System.out.println(isNegative(21));
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
}
