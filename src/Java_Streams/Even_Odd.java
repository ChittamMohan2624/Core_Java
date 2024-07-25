package Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Even_Odd {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays
                .asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        System.out.println( listOfIntegers.stream().filter(i -> i%2==0).collect(Collectors.toList()));
        System.out.println( listOfIntegers.stream().filter(i -> i%2==1).collect(Collectors.toList()));

        // Using Map

        Map<Boolean,List<Integer>> map= listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2==0));

        Set<Map.Entry<Boolean,List<Integer>>> set= map.entrySet();

        for(Map.Entry<Boolean,List<Integer>> entry:set){
           if(entry.getKey()){
               System.out.println("Even numbers are: "+entry.getValue());
           }else{
               System.out.println("Even numbers are: "+entry.getValue());
           }
        }
    }
}
