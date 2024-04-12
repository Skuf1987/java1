public class Three {
    public static void checkSumSign() {
        int a = 28;
        int b = -32;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void main(String[] args) {
        checkSumSign();
    }
}