package com.javacourse.se.lesson6;

public class Numbers { //Можно создать обьект по типу => Numbers <Название объекта> = new Numbers();
    // new - ключевое слово // Numbers() - конструктор класса Numbers // В каждом классе неявно задан конструктор
    public byte a; // 5-8 поля класса Numbers
    public static float b = 21.4f;
    public static long c = 1_000_002_444L;
    public static boolean f = false;

    public void Numbe() {// метод Numbe
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
    }

    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(b); //....Для инициализирования переменной необходимо смотреть на объявление класса
        System.out.println(c); //....Конкретно здесь это не написание слова static в объявлении переменных класса Numbers
        System.out.println(f);
    }
}