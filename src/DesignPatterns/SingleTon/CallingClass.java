package DesignPatterns.SingleTon;

public class CallingClass {

    public static void main(String[] args) {
        Object obj1=SingleClass.getInstance();
        Object obj2=SingleClass.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
