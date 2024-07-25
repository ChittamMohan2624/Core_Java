package Java_Streams;

import java.util.stream.IntStream;

public class PrintFirst10Even_Odd {

    public static void main(String[] args) {
        IntStream.range(1,11).map(i->i*2).forEach(System.out::println);
        IntStream.range(0,10).map(i->(i*2)+1).forEach(System.out::println);
    }
}
