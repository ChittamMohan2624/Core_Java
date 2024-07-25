package Java_Streams;

import java.util.Arrays;

public class Sum_Avg {

    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        System.out.println(Arrays.stream(a).sum() +" "+Arrays.stream(a).average().getAsDouble());
    }
}
