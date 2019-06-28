import java.util.Arrays;
import java.util.List;

public class SelectionSorter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 1, 45, 6, 42, 65, 4);
        List<String> names = Arrays.asList("zoyaa", "divya", "akshay", "deepa");
        System.out.println(getSorted(names));
        System.out.println(getSorted(numbers));
    }

    public static <T extends Comparable<T>> List<T> getSorted(List<T> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i).compareTo(numbers.get(j)) < 0) {
                    T minimum = numbers.get(j);
                      numbers.set(j, numbers.get(i));
                      numbers.set(i, minimum);
                }
            }
        }
        return numbers;
    }
}