package com.javacourse.se.lesson13;

public class ForLoop {

    int[] array = {3, 7, 8, 9, 56, 6, 6, 6, 6};

    public void foo1() {
        int b;
        int j = 0;
        for (int inner : array) {
            for (int i = 0; i < array.length; i++)
                System.out.println("i = " + i);
            //int j = 0;
            j++;
            if (j > array[7])
                System.out.println("inner = " + inner);
//            b = array.length;
        }
        System.out.println("Array length is " + array.length + ".");
    }
}
 