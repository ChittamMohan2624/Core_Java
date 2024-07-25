package Java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReversedIntegerArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, 1, 7, 3, 9, 6);
    Object[] arr=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).toArray();

    System.out.println(Arrays.toString(arr));
    }
}
