public class Three {
    public static void main(String[] args) {
        System.out.println("Biggest Divider: " + biggestPrimeFactor(600851475143L));
    }

    public static long biggestPrimeFactor(long x) {
        long result = 0;
        long count = 2;
        long divider;
        long biggestDivider = 0;

        while(result != 1) {
            if(x % count == 0) {
                result = x / count;
                x = result;
                divider = count;
                if(divider > biggestDivider) {
                    biggestDivider = divider;
                }
                count = 1;
            }
            count++;
        }
        return biggestDivider;
    }
}
