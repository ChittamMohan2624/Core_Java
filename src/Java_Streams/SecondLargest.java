package Java_Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays
                .asList(45, 12, 56, 15, 24, 75, 31, 89);


        // Using iterating from list
        List<Integer> list=listOfIntegers.stream().sorted().collect(Collectors.toList());

        System.out.println( list.get(list.size()-2));

        // Using streams
        System.out.println( listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

    }
}
