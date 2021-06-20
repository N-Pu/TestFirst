package com.javacourse.se.lesson8;

public class References {
    String str = "Моя строка";
    String srt2 = new String("Моя строка");

    static Byte a = 1;
    Short b;
    Integer c;
    Long d;
    static Character z;
    Float e;
    Double f;
    Boolean g;
    int v;

    public void foo() {
        new String("Моя строка");
        a.hashCode();
        z.getClass();
    }


    public static void main(String[] args) {
        System.out.println(z);
        System.out.println(a);
    }

}
