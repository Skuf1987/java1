public class Dva {

    public static void main(String[] args) {
        int number1 = 9;
        int number2 = -2;
        int number3 = 0;
        printPositiveOrNegative(number1);
        printPositiveOrNegative(number2);
        printPositiveOrNegative(number3);
    }
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}