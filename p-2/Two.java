import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {
        sumFibonacci(4000000);
    }

    public static void sumFibonacci(long n) {
        ArrayList<Integer> nums = new ArrayList<>();
        int total = 2;

        nums.add(1);
        nums.add(2);

        int i = 1;
        while(nums.get(i) < n) {
            i++;
            nums.add(nums.get(i-1) + nums.get(i-2));

            if(nums.get(i) % 2 == 0) {
                total += nums.get(i);
            }
        }
        System.out.println("Total: " + total);
    }
}
