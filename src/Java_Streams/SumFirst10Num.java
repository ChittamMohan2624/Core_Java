package Java_Streams;

import java.util.stream.IntStream;

public class SumFirst10Num {

    public static void main(String[] args) {
        System.out.println(IntStream.range(1,11).sum());
    }
}
