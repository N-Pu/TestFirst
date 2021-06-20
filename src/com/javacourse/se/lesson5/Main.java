package com.javacourse.se.lesson5;

//import com.javacourse.se.lesson6.Numbers;
//import com.javacourse.se.lesson7.Bus;

import com.javacourse.se.lesson12.LoopControl;
import com.javacourse.se.lesson13.ForLoop;
import com.javacourse.se.lesson15.Constructors;
import com.javacourse.se.lesson15.Flower;
import com.javacourse.se.lesson9.Operation;
import com.javacourse.se.lesson11.OperatorSwitch;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hey nigger");
        char z = 4888; // Вывод символа из Unicode
        System.out.println(z); */
        /*Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();
        Numbers smpTh = new Numbers();
        Bus honda = new Bus();

        honda.model = "Civic";
        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";
        smpTh.a = 12;

        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
        honda.showModel();
        smpTh.Numbe();*/

//        ForLoop nice = new ForLoop();
//        nice.foo1();
        //OperatorSwitch op = new OperatorSwitch();
        //op.foo();
//        LoopControl candygrab = new LoopControl();
//        candygrab.Candy();

//        Constructors constructors = new Constructors();
//        constructors.foo();




            Flower flower = new Flower();
            Flower.name = "Ромащка";
            Flower.color = "Белая" ;
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
