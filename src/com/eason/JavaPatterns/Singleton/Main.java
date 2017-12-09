package com.eason.JavaPatterns.Singleton;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Main {

    public static void main(String[] args) {

        SingletonConstructor s = SingletonConstructor.getInstance();
        SingletonConstructor s1 = SingletonConstructor.getInstance();

        System.out.println("s == s1 ? " + (s == s1));
        System.out.println("The hashcode for s: " + s.toString());
        System.out.println("The hashcode for s1: " + s1.toString());

        SingletonEnum si = SingletonEnum.SingletonInstance;
        SingletonEnum si1 = SingletonEnum.SingletonInstance;

        System.out.println("si == si1 ? " + (si == si1));
        System.out.println("The instance for si: " + si.toString());
        System.out.println("The instance for si1: " + si1.toString());
    }
}
