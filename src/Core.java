public class Core {

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("It is a leap year");
            return;
        }
        System.out.println("Not a leap year");
    }

    public static void headOrTail(int numberOfFlips) {
        int tailCount = 0, headCount = 0;
        for (int i = 1; i <= numberOfFlips; i++) {
            if (Math.random() < 0.5)
                tailCount++;
            else
                headCount++;
        }
        int headPercent = ((headCount * 100) / (headCount + tailCount));
        int tailPercent = ((tailCount * 100) / (headCount + tailCount));
        System.out.println("Head Percentage = " + headPercent);
        System.out.println("Tail Percentage = " + tailPercent);
    }

    public static void main(String[] args) {
        headOrTail(10);
        leapYear(2020);
    }
}
