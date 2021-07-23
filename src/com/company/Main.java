package com.company;

public class Main {

    public static void main(String[] args) {
        //Main.a();
        int wynik = silnia(5);
        System.out.println(wynik);
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

    public static int silnia(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }
}
