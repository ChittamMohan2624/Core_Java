package Java_Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

        String s=Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));

        System.out.println(s);
    }
}
