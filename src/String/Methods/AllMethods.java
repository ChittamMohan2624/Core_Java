package String.Methods;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class AllMethods {


    public static void main(String[] args) throws UnsupportedEncodingException {

        String s1="Chittam Mohan";
        String s2="Chittam Mohan Babu";

        System.out.println( s1.getBytes().length +" "+s1.length());

        System.out.println( s1.toLowerCase());

        System.out.println( s1.chars().toString());

        System.out.println( s1.codePointAt(0));

        System.out.println( s1.codePointBefore(1));

        System.out.println( s1.codePointCount(0,4));

        System.out.println( s1.compareTo(s2));

        System.out.println( s1.contains("C"));

        System.out.println( s1.describeConstable());

        System.out.println( s1.indexOf('C'));

        System.out.println( s1.repeat(2));

    }

}
