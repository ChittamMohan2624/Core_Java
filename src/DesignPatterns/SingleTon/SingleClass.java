package DesignPatterns.SingleTon;

public class SingleClass {

    private static SingleClass instance;
    private SingleClass(){

    }

    public static SingleClass getInstance(){
        if(instance==null){
           instance= new SingleClass();
        }
        return instance;
    }
}
