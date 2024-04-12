public class Five {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(862)); // Выведет true
        System.out.println(isLeapYear(1820)); // Выведет false
        System.out.println(isLeapYear(2001)); // Выведет true
        System.out.println(isLeapYear(1916)); // Выведет false
    }
}