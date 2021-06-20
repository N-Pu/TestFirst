package com.javacourse.se.lesson12;

import com.javacourse.se.lesson11.OperatorSwitch;

public class LoopControl {
    boolean value = true;
    int a = 5, b = 7;
    OperatorSwitch ass = new OperatorSwitch();
    int[] Arrays = new int[2];
//    Candy[] box = new Candy[5];
//    Candy[] box = new Candy[7];
//    Candy candyFirst = new Candy();
//    Candy[] box = {candyFirst};

    public void foo() {

        // while (a < b) {
        //      System.out.println(a);
        //       a++;
        //       ass.foo();

        do {
            a++;
            System.out.println(a);
            ass.foo();
        } while (a < 10);


    }


//    public void Candy() {
//        Candy candy = new Candy();
//        box[0] = candy;
//        System.out.println(box);
//
//    }
}

//class Candy {
//    Candy[] box = new Candy[7];
//    //int[] box = {1,4,4,4,4,4,4};
//    Candy candyFirst = new Candy();
//    Candy[] box2 = {candyFirst};
//
//}