package com.javacourse.se.lesson15;

public class Constructors {
    public void foo() {
        Flower flower = new Flower();
        //Flower.name = "Ромащка";
        //Flower.color = "Белая" ;
        String tmp;


        Flower flower2 = new Flower("Роза", "Красный");                         // Почему в независимости от объявления нового конструктора - выводится не обьявленный
        System.out.println(flower2.name + " " + flower2.color + ".");                           // а ПОСЛЕДОВАТЕЛЬНО-ЗАПИСАННЫЙ как в строчках
        Flower flower3 = new Flower("Тюльпан", "Жёлтый");
        System.out.println(flower.name + " " + flower.color + ".");

        System.out.println(" ");

        tmp = flower.name + " " + flower.color + ".";
        System.out.println(tmp);
        tmp = flower2.name + " " + flower2.color + ".";
        System.out.println(tmp);
        tmp = flower3.name + " " + flower3.color + ".";
        System.out.println(tmp);



}
}
