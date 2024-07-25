package Java_Streams;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<Character,Long> map= inputString.toLowerCase().chars().
                mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Set<Map.Entry<Character,Long>> set= map.entrySet();

        for(Map.Entry<Character,Long> entry:set) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
