public class Four {
    public static void main(String[] args) {
        int a = 999;
        int result;
        int max = 0;
        int temp;
        int m = 0;
        int n = 0;

        while(a > 99) {
            for(int i=999; i>99; i--) {
                result = a * i;
                if(isPalindrome(result+"") == true) {
                    temp = result;
                    if(temp > max) {
                        max = temp;
                        m = a;
                        n = i;
                    }
                }
            }
            a--;
        }

        System.out.println("Largest Palindrome: " + max);
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        System.out.println("m * n = " + max);
    }


    public static boolean isPalindrome(String x) {
        String y = "";

        for(int i=x.length()-1; i>=0; i--) {
            y += x.charAt(i);
        }

        if(!y.equals(x)) {
            return false;
        } else {
            return true;
        }
    }
}
