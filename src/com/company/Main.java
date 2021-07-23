package com.company;

public class Main {

    public static void main(String[] args) {
        Main.a();

    }

    public static void a() {
        System.out.println("Metoda a");
        b();
    }

    public static void b() {
        System.out.println("Metoda b");
        c();
    }

    public static void c() {
        System.out.println("Metoda c");
        d();
    }

    public static void d() {
        System.out.println("Metoda d");
        a();
    }
}
//StackOverflow