package Java_Streams;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseInt {

    public static void main(String[] args) {
        int i=123;
        String name=String.valueOf(i);

        String s=IntStream.range(0,name.length()).mapToObj(j-> name.charAt(name.length()-j-1))
                .map(String::valueOf).collect(Collectors.joining());

        i=Integer.parseInt(s);

        System.out.println(i);
    }
}
