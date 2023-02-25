public class Core {

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
    }
}
