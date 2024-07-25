package Java_Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfIntgers {

    public static void main(String[] args) {
        int i=15623;

        int sum= Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        Stream.of(String.valueOf(i).split("")).forEach(System.out::println);
        System.out.println(sum);
    }
}
