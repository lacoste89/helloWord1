package com.renat.test;

public class Main {

    public static  <T> T getT(Object obj){

        return (T) obj;
    }
    public static void main(String[] args) {
        System.out.println("Hello word");
        System.out.println("Hello word");
        System.out.println("Hello word");
        System.out.println(Main.<Integer>getT(new Object()).getClass().toString());
    }


}
