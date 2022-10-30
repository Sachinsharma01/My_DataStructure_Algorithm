public class Coins {
    public static void flipCoin(String side, int times) {
        int numberOfHeads = 0, numberOfTails = 0;
        for (int i = 0; i < times; i++) {
            if (side.equals("head")) {
                side = "tail";
                numberOfHeads ++;
            } else {
                side = "head";
                numberOfTails ++;
            }
        }
        System.out.println("Number of Tails : " + numberOfTails);
        System.out.println("Number of Heads : " + numberOfHeads);
    }

    public static void main(String[] args) {
        String initialSide = "head";
        int times = 7;
        flipCoin(initialSide, times);
    }
}
