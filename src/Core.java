public class Core {


    public static void largestAmongThree(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("Maximum number is : " + max);
    }

    public static void checkVowel(char ch) {
        char c = Character.toLowerCase(ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(ch + " is a vowel");
            return;
        }
        System.out.println(ch + " is a consonant");
    }

    public static void swapTwoNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    private static void computeQuotientAndRemainder(int x, int y) {
        System.out.println("Quotient = " + x / y);
        System.out.println("Remainder = " + x % y);
    }

    public static void factors(int number) {
        int n = number;
        System.out.println(1 + " ");
        for (int i = 2; i * i <= number; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
            if (n == 1)
                return;
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

    public static void harmonicNumber(int n) {
        if (n == 0) {
            System.out.println("n=0 not allowed");
            return;
        }
        double harmonicNumber = 0;
        for (double i = 1; i <= n; i++) {
            harmonicNumber += 1 / i;
        }
        System.out.println("Nth harmonic value = " + harmonicNumber);
    }

    public static void powerOfTwo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("2 ^ " + i + " = " + (int) Math.pow(2, i));
        }
    }

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
//        headOrTail(10);
//        leapYear(2020);
//        powerOfTwo(10);
//        harmonicNumber(6);
//        factors(12);
//        computeQuotientAndRemainder(26, 3);
//        swapTwoNumbers(2, 3);
//        checkVowel('a');
        largestAmongThree(5, 7, 9);
    }
}
