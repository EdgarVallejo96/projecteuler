public class Five {
    public static void main(String[] args) {
        int max = 20;
        int count = 1;
        int repeat = 1;

        for(int i=repeat; i<=max; i++) {
            if(count % i != 0) {
                count++;
                i = repeat;
            }

            if(i == max && count % i == 0) {
                System.out.println("Answer: " + count);
                /*
                for(int j=1; j<=max; j++) {
                    System.out.println(count + " / " + j + " = " + count / j);
                }
                 */
            }
        }


    }
}
