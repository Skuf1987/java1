import java.awt.image.DataBufferFloat;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSumInRange(3, 6));
        System.out.println(isSumInRange(9, 5));
        System.out.println(isSumInRange(12, 10));
        System.out.println(isSumInRange(12, 1));
        System.out.println(isSumInRange(9, 8));
    }
    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }
}
