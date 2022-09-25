import java.util.*;

public class Main {
    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();



    }
    public  static final  List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,8,10,15,15,15,19));
//Task 1
    public static void oddNumbers() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    //Task 2
    public static void evenNumbers() {
        Collections.sort(nums);
        Set<Integer> set = new HashSet<>(nums);
        System.out.println(set);

    }


}