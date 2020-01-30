import java.util.ArrayList;

public class One {
    public static void main(String[] args) {
        final int max = 1000;
        int total = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<max; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                list.add(i);
            } else if(i % 3 == 0) {
                list.add(i);
                //System.out.println("New 3: " + i);
            } else if(i % 5 == 0) {
                list.add(i);
                //System.out.println("New 5: " + i);
            }
        }

        for(int x: list){
            total += x;
            //System.out.println("New Total: " + total);
        }

        System.out.println(total);
    }
}