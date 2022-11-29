import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        oddNumbers();
//        evenNumbers();
//        words();
        count();


    }

    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 10, 15, 15, 15, 19));
    public static final List<String> words = new ArrayList<>(List.of("one", "one", "two", "three", "three", "four", "liza", "ivan", "ivan"));

    //Task 1
    public static void oddNumbers() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }


    //Task 2
    public static void evenNumbers() {
        Collections.sort(nums);
        Set<Integer> set = new HashSet<>(nums);
        for (int num : set) {
            if (num % 2 == 0) {
                System.out.println(num);

            }
        }
    }

    //Task 3
    public static void words() {
        Set<String> s = new LinkedHashSet<>(words);
        System.out.println(s);
    }

    //Task 4
    public static void count() {
        Set<String> s = new LinkedHashSet<>(words);
        System.out.println(words.size() - s.size());


    }
}